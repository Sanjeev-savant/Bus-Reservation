package BusRes;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;  // use get and set method to access the data
	
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getCapacity(){ //accessor method
		return capacity;
	}
	public void setCapacity(int cap){  //mutator
		capacity=cap;
	}
	public boolean getac(){ //accessor method
		return ac;
	}
	public void setCapacity(boolean val){  //mutator
		ac=val;
	}
	public int getBusNo(){ //accessor method
		return busNo;
	}
	public void setBusNo(int busno){  //mutator
		busNo=busno;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No:"+busNo+" Ac:"+ac+" Total Capacity: "+capacity);
	}
	

}
