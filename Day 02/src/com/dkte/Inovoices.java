package com.dkte;

class Invoice {
    private String part_number;
    private String part_Description;
    private int quantity;
    private double price;
    
    public Invoice() {
    	}
    public  Invoice(String part_number,String part_Description,int quantity,double price) {
    	this.part_number= part_number;
    	this.part_Description= part_Description;
    	this.quantity= quantity;
    	this.price=price;
    }
    public String getPart_number() {
    	return part_number;
    }
    public void setPart_number(String part_number) {
    	this.part_number=part_number;
    }
    public void setPart_Description(String part_Description) {
    	this.part_Description=part_Description;
    }
    public void setQuantity(int quantity) {
    	this.quantity=quantity;
    }
    public void setPrice(double price) {
    	this.price=price;
    }
    public String getPart_Description() {
    	return part_Description;
    }
    public int getQuantity() {
        	return quantity;
    }
    public double getPrice() {
    	return price;
}
    public void displayInvoices() {
    	System.out.println("Part Number:"+part_number);
    	System.out.println("Part Description:"+part_Description);
    	System.out.println("Quantity:"+quantity);
    	System.out.println("Price:"+price);
    	System.out.println("Final Amount:"+price*quantity);
    }
    
	public static void main(String[] args) {
		Invoice I1= new Invoice("123","  Good",5,64.25);
		I1.displayInvoices();
	    

	}

}

