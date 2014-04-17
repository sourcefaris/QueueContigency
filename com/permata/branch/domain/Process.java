package com.permata.branch.domain;
//Generated Dec 18, 2008 10:51:11 AM by Hibernate Tools 3.1.0.beta4

import java.util.Date;


/**
 * Process generated by hbm2java
 */

public class Process  implements java.io.Serializable {


    // Fields    

     private ProcessId id;
     private Date timeStartQ;
     private Date timeCall;
     private Date timeLastCall;
     private Date timeFinish;
     private String status;
     private Integer cardNo;
     private int queueIndex;
     private Integer callHit;
     private String periodTicketTaken;
     private String periodServed;
     private String periodFinished;
     private String branchCode;
     private Integer counterNo;
     private String service;
     private String timeDuration;
     private String callBy;

    // Constructors

    /** default constructor */
    public Process() {
    }

	/** minimal constructor */
    public Process(ProcessId id, Date timeCall, Date timeLastCall, Date timeFinish, int queueIndex) {
        this.id = id;
        this.timeCall = timeCall;
        this.timeLastCall = timeLastCall;
        this.timeFinish = timeFinish;
        this.queueIndex = queueIndex;
    }
    
    /** full constructor */
    public Process(ProcessId id, Date timeCall, Date timeLastCall, Date timeFinish, String status, Integer cardNo, int queueIndex, Integer callHit, String periodTicketTaken, String periodServed, String periodFinished, String branchCode, Integer counterNo, String service,String callBy) {
        this.id = id;
        this.timeCall = timeCall;
        this.timeLastCall = timeLastCall;
        this.timeFinish = timeFinish;
        this.status = status;
        this.cardNo = cardNo;
        this.queueIndex = queueIndex;
        this.callHit = callHit;
        this.periodTicketTaken = periodTicketTaken;
        this.periodServed = periodServed;
        this.periodFinished = periodFinished;
        this.branchCode = branchCode;
        this.counterNo = counterNo;
        this.service = service;
        this.callBy = callBy;
    }
    

   
    // Property accessors

    public ProcessId getId() {
        return this.id;
    }
    
    public void setId(ProcessId id) {
        this.id = id;
    }

    public Date getTimeCall() {
        return this.timeCall;
    }
    
    public void setTimeCall(Date timeCall) {
        this.timeCall = timeCall;
    }

    public Date getTimeLastCall() {
        return this.timeLastCall;
    }
    
    public void setTimeLastCall(Date timeLastCall) {
        this.timeLastCall = timeLastCall;
    }

    public Date getTimeFinish() {
        return this.timeFinish;
    }
    
    public void setTimeFinish(Date timeFinish) {
        this.timeFinish = timeFinish;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCardNo() {
        return this.cardNo;
    }
    
    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }

    public int getQueueIndex() {
        return this.queueIndex;
    }
    
    public void setQueueIndex(int queueIndex) {
        this.queueIndex = queueIndex;
    }

    public Integer getCallHit() {
        return this.callHit;
    }
    
    public void setCallHit(Integer callHit) {
        this.callHit = callHit;
    }

    public String getPeriodTicketTaken() {
        return this.periodTicketTaken;
    }
    
    public void setPeriodTicketTaken(String periodTicketTaken) {
        this.periodTicketTaken = periodTicketTaken;
    }

    public String getPeriodServed() {
        return this.periodServed;
    }
    
    public void setPeriodServed(String periodServed) {
        this.periodServed = periodServed;
    }

    public String getPeriodFinished() {
        return this.periodFinished;
    }
    
    public void setPeriodFinished(String periodFinished) {
        this.periodFinished = periodFinished;
    }

    public String getBranchCode() {
        return this.branchCode;
    }
    
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Integer getCounterNo() {
        return this.counterNo;
    }
    
    public void setCounterNo(Integer counterNo) {
        this.counterNo = counterNo;
    }

    public String getService() {
        return this.service;
    }
    
    public void setService(String service) {
        this.service = service;
    }
    
    public String getTimeDuration() {
		return timeDuration;
	}
    
	public void setTimeDuration(String timeDuration) {
		this.timeDuration = timeDuration;
	}
	
	public String getCallBy() {
		return callBy;
	}
	public void setCallBy(String callBy) {
		this.callBy = callBy;
	}
	
	public Date getTimeStartQ() {
		return timeStartQ;
	}
	public void setTimeStartQ(Date timeStartQ) {
		this.timeStartQ = timeStartQ;
	}
	public int getNo(){
		return getId().getNo();
	}
}
