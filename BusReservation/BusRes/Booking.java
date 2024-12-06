package BusRes;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name: ");
		passengerName=sc.nextLine();
		System.out.println("Enter bus no: ");
		busNo=sc.nextInt();
		System.out.println("Enter date dd-mm-yy: ");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public boolean isBookingAvailable() throws SQLException{
		
		BusDAO busdao=new BusDAO();
		int capacity=busdao.getCapacity(busNo);
		BookingDAO bookingdao=new BookingDAO();
		int booked=bookingdao.getBookedCount(busNo,date);
		
		return booked<capacity;
	}
}
