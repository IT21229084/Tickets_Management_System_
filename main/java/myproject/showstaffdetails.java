package myproject;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class showstaffdetails {
	private final String GET_DATA = "select * from staffmember";

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<Staffmember> getData(){
		Staffmember customerDto = null;
		List<Staffmember> customerList = new ArrayList<Staffmember>();
		try {
			con = DBconnect.getconnection();
			ps = con.prepareStatement(GET_DATA);
			rs = ps.executeQuery();
			while(rs.next()) {
				customerDto = new Staffmember(GET_DATA, GET_DATA, GET_DATA, GET_DATA, GET_DATA, GET_DATA, GET_DATA, GET_DATA, GET_DATA, GET_DATA, GET_DATA);
				customerDto.setSid(rs.getString(1));
				customerDto.setFirstName(rs.getString(2));
				customerDto.setLastName(rs.getString(3));
				customerDto.setNIC(rs.getString(4));
				customerDto.setEmail(rs.getString(5));
				customerDto.setMemno(rs.getString(6));
				customerDto.setDOB(rs.getString(7));
				customerDto.setGender(rs.getString(8));
				customerDto.setUserName(rs.getString(9));
				customerDto.setPassword(rs.getString(10));
				customerDto.setRId(rs.getString(11));
				
				
								
				customerList.add(customerDto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return customerList;
	}
}
