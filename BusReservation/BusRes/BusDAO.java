package BusRes;

import java.sql.*;


public class BusDAO{
	public void displayBusInfo() throws SQLException {
		String query="Select * from bus";
		Connection con=Dbconnection.getConnection();
		Statement st=con.createStatement();
		ResultSet res=st.executeQuery(query);
		
		while(res.next()) {
			System.out.println("Bus No: "+res.getInt(1));
			if(res.getInt(2)==0) {
				System.out.println("Ac: no");
			}
			else {
				System.out.println("Ac: yes");
			}
			System.out.println("Capacity: "+res.getInt(3));
		}
		System.out.println("--------------------------");
	}
	public int getCapacity(int id)throws SQLException{
		String query="Select capacity from bus where id="+id;
		Connection con=Dbconnection.getConnection();
		Statement st=con.createStatement();
		ResultSet res=st.executeQuery(query);
		res.next();
		return res.getInt(1);
	}
}

