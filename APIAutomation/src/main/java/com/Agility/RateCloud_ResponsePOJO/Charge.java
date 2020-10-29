package com.Agility.RateCloud_ResponsePOJO;

public class Charge
{
    private int chargeIdentifier;

    private String chargeCode;

    private String chargeName;

    private String effectiveDate;

    private String expiryDate;

    private String currencyIsoCode;

    private String uomCode;

    private String containerSize;

    private int maximum;

    private int minimum;

    private int unitCost;

    private String rateapplicability;

    private String notes;

    private String baseChargeCode;

    public void setChargeIdentifier(int chargeIdentifier){
        this.chargeIdentifier = chargeIdentifier;
    }
    public int getChargeIdentifier(){
        return this.chargeIdentifier;
    }
    public void setChargeCode(String chargeCode){
        this.chargeCode = chargeCode;
    }
    public String getChargeCode(){
        return this.chargeCode;
    }
    public void setChargeName(String chargeName){
        this.chargeName = chargeName;
    }
    public String getChargeName(){
        return this.chargeName;
    }
    public void setEffectiveDate(String effectiveDate){
        this.effectiveDate = effectiveDate;
    }
    public String getEffectiveDate(){
        return this.effectiveDate;
    }
    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }
    public String getExpiryDate(){
        return this.expiryDate;
    }
    public void setCurrencyIsoCode(String currencyIsoCode){
        this.currencyIsoCode = currencyIsoCode;
    }
    public String getCurrencyIsoCode(){
        return this.currencyIsoCode;
    }
    public void setUomCode(String uomCode){
        this.uomCode = uomCode;
    }
    public String getUomCode(){
        return this.uomCode;
    }
    public void setContainerSize(String containerSize){
        this.containerSize = containerSize;
    }
    public String getContainerSize(){
        return this.containerSize;
    }
    public void setMaximum(int maximum){
        this.maximum = maximum;
    }
    public int getMaximum(){
        return this.maximum;
    }
    public void setMinimum(int minimum){
        this.minimum = minimum;
    }
    public int getMinimum(){
        return this.minimum;
    }
    public void setUnitCost(int unitCost){
        this.unitCost = unitCost;
    }
    public int getUnitCost(){
        return this.unitCost;
    }
    public void setRateapplicability(String rateapplicability){
        this.rateapplicability = rateapplicability;
    }
    public String getRateapplicability(){
        return this.rateapplicability;
    }
    public void setNotes(String notes){
        this.notes = notes;
    }
    public String getNotes(){
        return this.notes;
    }
    public void setBaseChargeCode(String baseChargeCode){
        this.baseChargeCode = baseChargeCode;
    }
    public String getBaseChargeCode(){
        return this.baseChargeCode;
    }
}
