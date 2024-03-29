package com.permata.branch.domain;
// Generated Dec 30, 2008 11:50:14 AM by Hibernate Tools 3.1.0.beta4



/**
 * BranchservicedetailId generated by hbm2java
 */

public class BranchservicedetailId  implements java.io.Serializable {


    // Fields    

     private String branchCode;
     private int counterNo;
     private String serviceName;


    // Constructors

    /** default constructor */
    public BranchservicedetailId() {
    }

    
    /** full constructor */
    public BranchservicedetailId(String branchCode, int counterNo, String serviceName) {
        this.branchCode = branchCode;
        this.counterNo = counterNo;
        this.serviceName = serviceName;
    }
    

   
    // Property accessors

    public String getBranchCode() {
        return this.branchCode;
    }
    
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public int getCounterNo() {
        return this.counterNo;
    }
    
    public void setCounterNo(int counterNo) {
        this.counterNo = counterNo;
    }

    public String getServiceName() {
        return this.serviceName;
    }
    
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
   
   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BranchservicedetailId) ) return false;
		 BranchservicedetailId castOther = ( BranchservicedetailId ) other; 
         
		 return ( (this.getBranchCode()==castOther.getBranchCode()) || ( this.getBranchCode()!=null && castOther.getBranchCode()!=null && this.getBranchCode().equals(castOther.getBranchCode()) ) )
 && (this.getCounterNo()==castOther.getCounterNo())
 && ( (this.getServiceName()==castOther.getServiceName()) || ( this.getServiceName()!=null && castOther.getServiceName()!=null && this.getServiceName().equals(castOther.getServiceName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getBranchCode() == null ? 0 : this.getBranchCode().hashCode() );
         result = 37 * result + this.getCounterNo();
         result = 37 * result + ( getServiceName() == null ? 0 : this.getServiceName().hashCode() );
         return result;
   }   





}
