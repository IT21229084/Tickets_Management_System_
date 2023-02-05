package myproject;

public class ticketDetails {
	
	int ticketid;
	String tHeader;
	String description;
	String reason;
	String feedback;
	String email;
	
	/**
	 * @param ticketid
	 * @param tHeader
	 * @param description
	 */
	public ticketDetails(int ticketid, String tHeader, String description,String reason,String feedback,String email) {
		this.ticketid = ticketid;
		this.tHeader = tHeader;
		this.description = description;
		this.reason = reason;
		this.feedback = feedback;
		this.email = email;
		
	}
	public int getTicketid() {
		return ticketid;
	}
	
	public String gettHeader() {
		return tHeader;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getreason() {
		return reason;
	}
	public String getfeedback() {
		return feedback;
	}
	public String getemail() {
		return email;
	}
	
	
	
	
	
	

}
