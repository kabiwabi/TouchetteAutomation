package com.ondemand.commerce.pages.data;

public class Tire {
    private String sku;
    private String tireName;
    private String msrp;
    private String suggestedPrice;
    private String localAvailability;
    private String warehouseAvailability;
    private String eta;
    private String clientPrice;
    private String customerNumber;
    private String seasonTag;
    private String runFlatTag;

    public Tire() {
        super();
        this.sku = "";
        this.tireName = "";
        this.msrp = "";
        this.suggestedPrice = "";
        this.localAvailability = "";
        this.warehouseAvailability = "";
        this.eta = "";
        this.clientPrice = "";
        this.customerNumber = "";
        this.seasonTag = "";
        this.runFlatTag = "";
    }

    public Tire(String sku, String tireName, String msrp, String suggestedPrice, String localAvailability,
                String warehouseAvailability, String eta, String clientPrice, String customerNumber, String seasonTag, String runFlatTag) {
        this.sku = sku;
        this.tireName = tireName;
        this.msrp = msrp;
        this.suggestedPrice = suggestedPrice;
        this.localAvailability = localAvailability;
        this.warehouseAvailability = warehouseAvailability;
        this.eta = eta;
        this.clientPrice = clientPrice;
        this.customerNumber = customerNumber;
        this.seasonTag = seasonTag;
        this.runFlatTag = runFlatTag;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "sku='" + sku + '\'' +
                ", tireName='" + tireName + '\'' +
                ", msrp='" + msrp + '\'' +
                ", suggestedPrice='" + suggestedPrice + '\'' +
                ", localAvailability='" + localAvailability + '\'' +
                ", warehouseAvailability='" + warehouseAvailability + '\'' +
                ", eta='" + eta + '\'' +
                ", clientPrice='" + clientPrice + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", seasonTag='" + seasonTag + '\'' +
                ", runFlatTag='" + runFlatTag + '\'' +
                '}';
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTireName() {
        return tireName;
    }

    public void setTireName(String tireName) {
        this.tireName = tireName;
    }

    public String getMsrp() {
        return msrp;
    }

    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

    public String getSuggestedPrice() {
        return suggestedPrice;
    }

    public void setSuggestedPrice(String suggestedPrice) {
        this.suggestedPrice = suggestedPrice;
    }

    public String getLocalAvailability() {
        return localAvailability;
    }

    public void setLocalAvailability(String localAvailability) {
        this.localAvailability = localAvailability;
    }

    public String getWarehouseAvailability() {
        return warehouseAvailability;
    }

    public void setWarehouseAvailability(String warehouseAvailability) {this.warehouseAvailability = warehouseAvailability;}

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getClientPrice() {
        return clientPrice;
    }

    public void setClientPrice(String clientPrice) {
        this.clientPrice = clientPrice;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getSeasonTag() {
        return seasonTag;
    }

    public void setSeasonTag(String seasonTag) {
        this.seasonTag = seasonTag;
    }

    public String getRunFlatTag() {
        return runFlatTag;
    }

    public void setRunFlatTag(String runFlatTag) {
        this.runFlatTag = runFlatTag;
    }


}