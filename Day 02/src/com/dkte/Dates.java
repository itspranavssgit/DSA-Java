package com.dkte;

class datess {
	private int Day;
	private int Month;
	private int Year;
	
	public datess() {
		
	}
   public datess(int Day, int Month,int Year) {
	   this.Day= Day;
	   this.Month=Month;
	   this.Year=Year;
   }
   
   public int getDay() {
	   return Day;
   }
   public void setDay(int Day) {
	   this.Day=Day;
	   
   }
   public void setMonth(int Month) {
	   this.Month=Month;
	   
   }
   public void setYear(int Year) {
	   this.Year=Year;
	   
   }
   public int getMonth() {
	   return Month;
   }
   public int getYear() {
	   return Year;
   }
   public void displaydatess() {
	   System.out.println("Day"+Day);
	   System.out.println("Month"+Month);
	   System.out.println("Year"+Year);
   }
	public static void main(String[] args) {
         
		datess d1= new datess(24,11,2005);
		 
		d1.displaydatess();

	}

}

