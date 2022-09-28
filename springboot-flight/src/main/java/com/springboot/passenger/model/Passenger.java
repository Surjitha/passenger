package com.springboot.passenger.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="passengers")
public class Passenger {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long pnrNumber;
    @Column (name="passenger_name")
    private String passengerName;
    @Column (name="passenger_age")
    private int passengerAge;
    @Column (name="passenger_UIN")
    private long passengerUIN;
    @Column (name="noofluggages")
    private double noofluggages;
	public Passenger(long pnrNumber, String passengerName, int passengerAge, long passengerUIN, double noofluggages) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.noofluggages = noofluggages;
	}
	public Passenger() {
		super();
	}
	public long getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public long getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public double getNoofluggages() {
		return noofluggages;
	}
	public void setNoofluggages(double noofluggages) {
		this.noofluggages = noofluggages;
	}
    
    
 }
    

