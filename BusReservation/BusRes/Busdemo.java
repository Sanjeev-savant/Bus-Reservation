package BusRes;
import java.sql.SQLException;
import java.util.Scanner;

public class Busdemo {
	public static void main(String[]args) throws SQLException{
		
		BusDAO busd=new BusDAO();
		busd.displayBusInfo();
		

		int useropt=1;
		Scanner sc=new Scanner(System.in);
		
		while(useropt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			useropt=sc.nextInt();
			if(useropt==1) {
				Booking booked=new Booking();
				if(booked.isBookingAvailable()){
					BookingDAO booking=new BookingDAO();
					booking.addBooking(booked);
					System.out.println("Your Booking is confrimed");
				}
				else {
					System.out.println("Sorry,The bus is full.Try another date");
				}
			}
		}
		
	}
}
