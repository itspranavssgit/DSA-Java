package com.dkte4;


class Date{
	int Day; 
	int Month;
	
	public void setDay(int Day) {
		if (Day <=0 || Day > 31)
			throw new RuntimeException();
		this.Day=Day;
	}
	public void setMonth(int Month) throws Exception{
		if(Month <=0 || Month >12)
			throw new Exception();
		this.Month=Month;
	}
	@Override
	public String toString() {
		return "Date [day=" + Day + ", month=" + Month + "]";
	}
	
}
public class Prog01{
	public static void main(String[] args) {
		Date d1 = new Date();
		d1.setDay(20);
		try {
			d1.setMonth(20);
			System.out.println(d1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}














public class Prog01 {

	public static void main(String[] args) {
		

	}

}
