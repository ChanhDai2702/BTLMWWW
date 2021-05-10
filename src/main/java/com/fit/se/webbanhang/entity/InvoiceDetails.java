package com.fit.se.webbanhang.entity;

import javax.persistence.*;

@Entity
@Table (name = "InvoiceDetail")
public class InvoiceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int invoiceID;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "Bill_bid", referencedColumnName = "bid")
    private Bill bill;
   
    
    @ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "Glass_gid", referencedColumnName = "gid")
    private Glass glass;
    
    private int quantity;

    public InvoiceDetails() { }

    public InvoiceDetails(Glass glass, int quantity) {
        this.glass = glass;
        this.quantity = quantity;
    }


    public Glass getGlass() {
        return this.glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float unitPrice(){
        return this.glass.getPrice() * this.quantity;
    }

    public int getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "InvoiceDetails [invoiceID=" + invoiceID + ", bill=" + bill + ", glass=" + glass + ", quantity="
				+ quantity + "]";
	}

	

}
