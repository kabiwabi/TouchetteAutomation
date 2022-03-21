package com.ondemand.commerce.AllTests.seasonTests;

import com.ondemand.commerce.base.TestUtilities;
import com.ondemand.commerce.pages.*;
import com.ondemand.commerce.pages.data.Tire;
import retrofit.etaModels.EtaRequest;
import retrofit.pricingModels.CustomerPricing;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AllSeasonTest extends TestUtilities {
    private ArrayList<WebElement> msrpList = new ArrayList<>();
    private CustomerPricing customerPricing;
    private String winterTag = "Winter";
    private String summerTag = "Summer";
    private String allSeasonTag = "All-Season";
    private String allWeather = "All-Weather";

    @Test
    public void seasonTest() throws IOException {
        // open main page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        log.info("Welcome page clicked succesfully!");
        // Click on Form Authentication link
        LoginPage loginPage = welcomePage.clickLanguageEnglish();
        // execute log in
        HomePage homePage = loginPage.logIn("jdoe@testgt.ca", "1234");
        // create a navigation bar instance and click search by specifications
        NavigationBar navigationBar = new NavigationBar(driver,log);
        FindTiresBySpecificationPage bySpecificationPage = navigationBar.ClickFindTiresBySpecification();
        bySpecificationPage.FillTireSize("225");
        SearchResultsPage searchResults = bySpecificationPage.clickSearch();

        searchResults.clickAllSeason();
        // adds one of each product to the cart
        searchResults.addToCart("5");
        // clicks get ETA for each product
        searchResults.clickEtaForAll();
        List<Tire> tireListFull = searchResults.initListAssignAllTires();

        for(int i=0; i<tireListFull.size(); i++) {
            Tire tireProductIterate = tireListFull.get(i);
            CustomerPricing customerPricing = searchResults.getPricingFromS4(tireProductIterate);
            String productPrice = customerPricing.getD().getMaterialsList().getResults().get(0).getPrice();
            EtaRequest etaRequest = searchResults.getETAfromS4(tireProductIterate);
            String productEta = etaRequest.getD2().getEtaResults().get(0).getDescription();
            Assert.assertEquals(productPrice.substring(0, productPrice.length() - 1), tireProductIterate.getClientPrice().substring(1), "Price verification failed!");
            log.info("Successfully verified that product "+i+"'s hybris price matches the S4 price ");
            Assert.assertNotEquals(tireProductIterate.getEta(), productEta, "ETA verification failed!");
            log.info("Successfully verified that product "+i+"'s hybris ETA matches the S4 ETA ");
            Assert.assertEquals(tireProductIterate.getSeasonTag(), allSeasonTag, "Season verification failed!");
            log.info("Successfully verified that product "+i+"'s season tag matches the expected tag of "+allSeasonTag);
        }
    }
}
