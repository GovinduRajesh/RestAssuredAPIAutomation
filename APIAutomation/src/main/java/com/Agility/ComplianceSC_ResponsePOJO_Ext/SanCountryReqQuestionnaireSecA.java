
package com.Agility.ComplianceSC_ResponsePOJO_Ext;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sancCountryQustId",
    "requestId",
    "isShipper",
    "modeOfTransportId",
    "shipmentOrigin",
    "shipmentOriginCountryId",
    "shipmentDestination",
    "shipmentDestCountryId",
    "isTranshipment",
    "transhipmentCountryId",
    "carrierId",
    "vessel",
    "productsToBeShipped",
    "endUserProducts",
    "hsCommodityCodes",
    "ecn",
    "countryOfOriginId",
    "currencyOfPaymentId",
    "othCurrenciesInvInTrans",
    "statusId",
    "modeOfTransportMode",
    "shipmentOriginCountryCode",
    "shipmentOriginCountryName",
    "shipmentDestCountryCode",
    "shipmentDestCountryName",
    "transhipmentCountryCode",
    "transhipmentCountryName",
    "carrierCode",
    "carrierName",
    "countryOfOriginCode",
    "countryOfOriginName",
    "statusStatusDesc"
})
public class SanCountryReqQuestionnaireSecA {

    @JsonProperty("sancCountryQustId")
    private Integer sancCountryQustId;
    @JsonProperty("requestId")
    private Integer requestId;
    @JsonProperty("isShipper")
    private Integer isShipper;
    @JsonProperty("modeOfTransportId")
    private Integer modeOfTransportId;
    @JsonProperty("shipmentOrigin")
    private String shipmentOrigin;
    @JsonProperty("shipmentOriginCountryId")
    private Integer shipmentOriginCountryId;
    @JsonProperty("shipmentDestination")
    private String shipmentDestination;
    @JsonProperty("shipmentDestCountryId")
    private Integer shipmentDestCountryId;
    @JsonProperty("isTranshipment")
    private Integer isTranshipment;
    @JsonProperty("transhipmentCountryId")
    private Integer transhipmentCountryId;
    @JsonProperty("carrierId")
    private Integer carrierId;
    @JsonProperty("vessel")
    private String vessel;
    @JsonProperty("productsToBeShipped")
    private String productsToBeShipped;
    @JsonProperty("endUserProducts")
    private String endUserProducts;
    @JsonProperty("hsCommodityCodes")
    private String hsCommodityCodes;
    @JsonProperty("ecn")
    private String ecn;
    @JsonProperty("countryOfOriginId")
    private Integer countryOfOriginId;
    @JsonProperty("currencyOfPaymentId")
    private String currencyOfPaymentId;
    @JsonProperty("othCurrenciesInvInTrans")
    private String othCurrenciesInvInTrans;
    @JsonProperty("statusId")
    private Integer statusId;
    @JsonProperty("modeOfTransportMode")
    private String modeOfTransportMode;
    @JsonProperty("shipmentOriginCountryCode")
    private String shipmentOriginCountryCode;
    @JsonProperty("shipmentOriginCountryName")
    private String shipmentOriginCountryName;
    @JsonProperty("shipmentDestCountryCode")
    private String shipmentDestCountryCode;
    @JsonProperty("shipmentDestCountryName")
    private String shipmentDestCountryName;
    @JsonProperty("transhipmentCountryCode")
    private String transhipmentCountryCode;
    @JsonProperty("transhipmentCountryName")
    private String transhipmentCountryName;
    @JsonProperty("carrierCode")
    private String carrierCode;
    @JsonProperty("carrierName")
    private String carrierName;
    @JsonProperty("countryOfOriginCode")
    private String countryOfOriginCode;
    @JsonProperty("countryOfOriginName")
    private String countryOfOriginName;
    @JsonProperty("statusStatusDesc")
    private String statusStatusDesc;

    @JsonProperty("sancCountryQustId")
    public Integer getSancCountryQustId() {
        return sancCountryQustId;
    }

    @JsonProperty("sancCountryQustId")
    public void setSancCountryQustId(Integer sancCountryQustId) {
        this.sancCountryQustId = sancCountryQustId;
    }

    @JsonProperty("requestId")
    public Integer getRequestId() {
        return requestId;
    }

    @JsonProperty("requestId")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("isShipper")
    public Integer getIsShipper() {
        return isShipper;
    }

    @JsonProperty("isShipper")
    public void setIsShipper(Integer isShipper) {
        this.isShipper = isShipper;
    }

    @JsonProperty("modeOfTransportId")
    public Integer getModeOfTransportId() {
        return modeOfTransportId;
    }

    @JsonProperty("modeOfTransportId")
    public void setModeOfTransportId(Integer modeOfTransportId) {
        this.modeOfTransportId = modeOfTransportId;
    }

    @JsonProperty("shipmentOrigin")
    public String getShipmentOrigin() {
        return shipmentOrigin;
    }

    @JsonProperty("shipmentOrigin")
    public void setShipmentOrigin(String shipmentOrigin) {
        this.shipmentOrigin = shipmentOrigin;
    }

    @JsonProperty("shipmentOriginCountryId")
    public Integer getShipmentOriginCountryId() {
        return shipmentOriginCountryId;
    }

    @JsonProperty("shipmentOriginCountryId")
    public void setShipmentOriginCountryId(Integer shipmentOriginCountryId) {
        this.shipmentOriginCountryId = shipmentOriginCountryId;
    }

    @JsonProperty("shipmentDestination")
    public String getShipmentDestination() {
        return shipmentDestination;
    }

    @JsonProperty("shipmentDestination")
    public void setShipmentDestination(String shipmentDestination) {
        this.shipmentDestination = shipmentDestination;
    }

    @JsonProperty("shipmentDestCountryId")
    public Integer getShipmentDestCountryId() {
        return shipmentDestCountryId;
    }

    @JsonProperty("shipmentDestCountryId")
    public void setShipmentDestCountryId(Integer shipmentDestCountryId) {
        this.shipmentDestCountryId = shipmentDestCountryId;
    }

    @JsonProperty("isTranshipment")
    public Integer getIsTranshipment() {
        return isTranshipment;
    }

    @JsonProperty("isTranshipment")
    public void setIsTranshipment(Integer isTranshipment) {
        this.isTranshipment = isTranshipment;
    }

    @JsonProperty("transhipmentCountryId")
    public Integer getTranshipmentCountryId() {
        return transhipmentCountryId;
    }

    @JsonProperty("transhipmentCountryId")
    public void setTranshipmentCountryId(Integer transhipmentCountryId) {
        this.transhipmentCountryId = transhipmentCountryId;
    }

    @JsonProperty("carrierId")
    public Integer getCarrierId() {
        return carrierId;
    }

    @JsonProperty("carrierId")
    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    @JsonProperty("vessel")
    public String getVessel() {
        return vessel;
    }

    @JsonProperty("vessel")
    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    @JsonProperty("productsToBeShipped")
    public String getProductsToBeShipped() {
        return productsToBeShipped;
    }

    @JsonProperty("productsToBeShipped")
    public void setProductsToBeShipped(String productsToBeShipped) {
        this.productsToBeShipped = productsToBeShipped;
    }

    @JsonProperty("endUserProducts")
    public String getEndUserProducts() {
        return endUserProducts;
    }

    @JsonProperty("endUserProducts")
    public void setEndUserProducts(String endUserProducts) {
        this.endUserProducts = endUserProducts;
    }

    @JsonProperty("hsCommodityCodes")
    public String getHsCommodityCodes() {
        return hsCommodityCodes;
    }

    @JsonProperty("hsCommodityCodes")
    public void setHsCommodityCodes(String hsCommodityCodes) {
        this.hsCommodityCodes = hsCommodityCodes;
    }

    @JsonProperty("ecn")
    public String getEcn() {
        return ecn;
    }

    @JsonProperty("ecn")
    public void setEcn(String ecn) {
        this.ecn = ecn;
    }

    @JsonProperty("countryOfOriginId")
    public Integer getCountryOfOriginId() {
        return countryOfOriginId;
    }

    @JsonProperty("countryOfOriginId")
    public void setCountryOfOriginId(Integer countryOfOriginId) {
        this.countryOfOriginId = countryOfOriginId;
    }

    @JsonProperty("currencyOfPaymentId")
    public String getCurrencyOfPaymentId() {
        return currencyOfPaymentId;
    }

    @JsonProperty("currencyOfPaymentId")
    public void setCurrencyOfPaymentId(String currencyOfPaymentId) {
        this.currencyOfPaymentId = currencyOfPaymentId;
    }

    @JsonProperty("othCurrenciesInvInTrans")
    public String getOthCurrenciesInvInTrans() {
        return othCurrenciesInvInTrans;
    }

    @JsonProperty("othCurrenciesInvInTrans")
    public void setOthCurrenciesInvInTrans(String othCurrenciesInvInTrans) {
        this.othCurrenciesInvInTrans = othCurrenciesInvInTrans;
    }

    @JsonProperty("statusId")
    public Integer getStatusId() {
        return statusId;
    }

    @JsonProperty("statusId")
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("modeOfTransportMode")
    public String getModeOfTransportMode() {
        return modeOfTransportMode;
    }

    @JsonProperty("modeOfTransportMode")
    public void setModeOfTransportMode(String modeOfTransportMode) {
        this.modeOfTransportMode = modeOfTransportMode;
    }

    @JsonProperty("shipmentOriginCountryCode")
    public String getShipmentOriginCountryCode() {
        return shipmentOriginCountryCode;
    }

    @JsonProperty("shipmentOriginCountryCode")
    public void setShipmentOriginCountryCode(String shipmentOriginCountryCode) {
        this.shipmentOriginCountryCode = shipmentOriginCountryCode;
    }

    @JsonProperty("shipmentOriginCountryName")
    public String getShipmentOriginCountryName() {
        return shipmentOriginCountryName;
    }

    @JsonProperty("shipmentOriginCountryName")
    public void setShipmentOriginCountryName(String shipmentOriginCountryName) {
        this.shipmentOriginCountryName = shipmentOriginCountryName;
    }

    @JsonProperty("shipmentDestCountryCode")
    public String getShipmentDestCountryCode() {
        return shipmentDestCountryCode;
    }

    @JsonProperty("shipmentDestCountryCode")
    public void setShipmentDestCountryCode(String shipmentDestCountryCode) {
        this.shipmentDestCountryCode = shipmentDestCountryCode;
    }

    @JsonProperty("shipmentDestCountryName")
    public String getShipmentDestCountryName() {
        return shipmentDestCountryName;
    }

    @JsonProperty("shipmentDestCountryName")
    public void setShipmentDestCountryName(String shipmentDestCountryName) {
        this.shipmentDestCountryName = shipmentDestCountryName;
    }

    @JsonProperty("transhipmentCountryCode")
    public String getTranshipmentCountryCode() {
        return transhipmentCountryCode;
    }

    @JsonProperty("transhipmentCountryCode")
    public void setTranshipmentCountryCode(String transhipmentCountryCode) {
        this.transhipmentCountryCode = transhipmentCountryCode;
    }

    @JsonProperty("transhipmentCountryName")
    public String getTranshipmentCountryName() {
        return transhipmentCountryName;
    }

    @JsonProperty("transhipmentCountryName")
    public void setTranshipmentCountryName(String transhipmentCountryName) {
        this.transhipmentCountryName = transhipmentCountryName;
    }

    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("carrierName")
    public String getCarrierName() {
        return carrierName;
    }

    @JsonProperty("carrierName")
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    @JsonProperty("countryOfOriginCode")
    public String getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    @JsonProperty("countryOfOriginCode")
    public void setCountryOfOriginCode(String countryOfOriginCode) {
        this.countryOfOriginCode = countryOfOriginCode;
    }

    @JsonProperty("countryOfOriginName")
    public String getCountryOfOriginName() {
        return countryOfOriginName;
    }

    @JsonProperty("countryOfOriginName")
    public void setCountryOfOriginName(String countryOfOriginName) {
        this.countryOfOriginName = countryOfOriginName;
    }

    @JsonProperty("statusStatusDesc")
    public String getStatusStatusDesc() {
        return statusStatusDesc;
    }

    @JsonProperty("statusStatusDesc")
    public void setStatusStatusDesc(String statusStatusDesc) {
        this.statusStatusDesc = statusStatusDesc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sancCountryQustId", sancCountryQustId).append("requestId", requestId).append("isShipper", isShipper).append("modeOfTransportId", modeOfTransportId).append("shipmentOrigin", shipmentOrigin).append("shipmentOriginCountryId", shipmentOriginCountryId).append("shipmentDestination", shipmentDestination).append("shipmentDestCountryId", shipmentDestCountryId).append("isTranshipment", isTranshipment).append("transhipmentCountryId", transhipmentCountryId).append("carrierId", carrierId).append("vessel", vessel).append("productsToBeShipped", productsToBeShipped).append("endUserProducts", endUserProducts).append("hsCommodityCodes", hsCommodityCodes).append("ecn", ecn).append("countryOfOriginId", countryOfOriginId).append("currencyOfPaymentId", currencyOfPaymentId).append("othCurrenciesInvInTrans", othCurrenciesInvInTrans).append("statusId", statusId).append("modeOfTransportMode", modeOfTransportMode).append("shipmentOriginCountryCode", shipmentOriginCountryCode).append("shipmentOriginCountryName", shipmentOriginCountryName).append("shipmentDestCountryCode", shipmentDestCountryCode).append("shipmentDestCountryName", shipmentDestCountryName).append("transhipmentCountryCode", transhipmentCountryCode).append("transhipmentCountryName", transhipmentCountryName).append("carrierCode", carrierCode).append("carrierName", carrierName).append("countryOfOriginCode", countryOfOriginCode).append("countryOfOriginName", countryOfOriginName).append("statusStatusDesc", statusStatusDesc).toString();
    }

}
