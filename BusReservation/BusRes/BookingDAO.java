package BusRes;

import java.util.Date;
import java.sql.*;

public class BookingDAO {
	
	public int getBookedCount(int busNo,Date date) throws SQLException {
		String query="Select count(pass_name) from booking where bus_no=? and travel_date=?";
		Connection con=Dbconnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		pst.setInt(1, busNo);
		pst.setDate(2, sqldate);
		ResultSet res=pst.executeQuery();
		res.next();
		return res.getInt(1);
	}
	public void addBooking(Booking booked)throws SQLException{
		String query="Insert into booking values(?,?,?)";
		Connection con=Dbconnection.getConnection();
		
		java.sql.Date sqldate=new java.sql.Date(booked.date.getTime());
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, booked.passengerName);
		pst.setInt(2, booked.busNo);
		pst.setDate(3, sqldate);
		pst.executeUpdate();
	}
}
