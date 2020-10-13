package com.Agility.ComplianceSC_RequestPOJO;
public class PutRequestPOJO {
	
	
    private int requestId;

    private String consignmentId;

    private int countryId;

    private int sancCountryId;

    private int sancBranchId;

    private String sancCountryType;

    private int modeOfTransportId;

    private int archive;

    private String requestedDate;

    private String requestedBy;

    private int statusId;

    private String comments;

    public void setRequestId(int requestId){
        this.requestId = requestId;
    }
    public int getRequestId(){
        return this.requestId;
    }
    public void setConsignmentId(String consignmentId){
        this.consignmentId = consignmentId;
    }
    public String getConsignmentId(){
        return this.consignmentId;
    }
    public void setCountryId(int countryId){
        this.countryId = countryId;
    }
    public int getCountryId(){
        return this.countryId;
    }
    public void setSancCountryId(int sancCountryId){
        this.sancCountryId = sancCountryId;
    }
    public int getSancCountryId(){
        return this.sancCountryId;
    }
    public void setSancBranchId(int sancBranchId){
        this.sancBranchId = sancBranchId;
    }
    public int getSancBranchId(){
        return this.sancBranchId;
    }
    public void setSancCountryType(String sancCountryType){
        this.sancCountryType = sancCountryType;
    }
    public String getSancCountryType(){
        return this.sancCountryType;
    }
    public void setModeOfTransportId(int modeOfTransportId){
        this.modeOfTransportId = modeOfTransportId;
    }
    public int getModeOfTransportId(){
        return this.modeOfTransportId;
    }
    public void setArchive(int archive){
        this.archive = archive;
    }
    public int getArchive(){
        return this.archive;
    }
    public void setRequestedDate(String requestedDate){
        this.requestedDate = requestedDate;
    }
    public String getRequestedDate(){
        return this.requestedDate;
    }
    public void setRequestedBy(String requestedBy){
        this.requestedBy = requestedBy;
    }
    public String getRequestedBy(){
        return this.requestedBy;
    }
    public void setStatusId(int statusId){
        this.statusId = statusId;
    }
    public int getStatusId(){
        return this.statusId;
    }
    public void setComments(String comments){
        this.comments = comments;
    }
    public String getComments(){
        return this.comments;
    }
}
