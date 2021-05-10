package com.fit.se.webbanhang.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "Bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bID;
    
    private Date date;
    
    @OneToMany(targetEntity=InvoiceDetails.class, mappedBy="bill", fetch=FetchType.EAGER)
    private List<InvoiceDetails> invoiceDetails;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "user_uid", referencedColumnName = "uid")
    private User user;

    public Bill() {}

    public Bill(Date date, List<InvoiceDetails> invoiceDetails) {
		this.date = date;
		this.invoiceDetails = invoiceDetails;
	}    

    public int getbID() {
		return bID;
	}

	public void setbID(int bID) {
		this.bID = bID;
	}

	public int getBID() {
        return this.bID;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

    public List<InvoiceDetails> getInvoiceDetails() {
        return this.invoiceDetails;
    }

    public void setInvoiceDetails(List<InvoiceDetails> invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }

    public float Totals() {
        float moneys = 0;
        for (InvoiceDetails invoiceDetails : this.invoiceDetails) {
        	moneys += invoiceDetails.unitPrice();
		}
        return moneys;
    }

	@Override
	public String toString() {
		return "Bill [bID=" + bID + ", date=" + date + ", invoiceDetails=" + invoiceDetails + ", Totals()=" + Totals()
				+ "]";
	}
}
