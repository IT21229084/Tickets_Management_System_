package myproject;

public class Staffmember {
	private String sid;
	private String firstName;
	private String lastName;
	private String NIC;
	private String email;
	private String memno;
	private String DOB;
	private String gender;
	private String userName;
	private String password;
	private String RId;
	/**
	 * @param sid
	 * @param firstName
	 * @param lastName
	 * @param nIC
	 * @param email
	 * @param memno
	 * @param dOB
	 * @param gender
	 * @param userName
	 * @param password
	 * @param rId
	 */
	public Staffmember(String sid, String firstName, String lastName, String nIC, String email, String memno, String dOB,
			String gender, String userName, String password, String rId) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.lastName = lastName;
		NIC = nIC;
		this.email = email;
		this.memno = memno;
		DOB = dOB;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
		RId = rId;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMemno() {
		return memno;
	}
	public void setMemno(String memno) {
		this.memno = memno;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRId() {
		return RId;
	}
	public void setRId(String rId) {
		RId = rId;
	}
	
}
