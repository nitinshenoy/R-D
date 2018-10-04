package com.nitin.mmt;

import com.nitin.mmt.controller.Flight_Controller;

public class Flight_Application {

	public static void main(String[] args) {
		Flight_Controller flightList=new Flight_Controller();
		flightList.addFlight(new Flight_Details(1, "Goa" , "Bangalore", 10102018, 1000, 1500, "SpiceJet", 5500));
		flightList.addFlight(new Flight_Details(2, "Mumbai" , "Kolkata", 10102018, 1100, 1200,"SpiceJet", 4100));
		flightList.addFlight(new Flight_Details(3, "Delhi" , "Mumbai", 10102018, 1300, 1500,"SpiceJet", 2000));
		flightList.addFlight(new Flight_Details(4, "Hubli" , "Pune", 10102018, 1500, 1600,"SpiceJet", 5100));
		
		
		
		System.out.println(flightList.getMorningFlights("Mumbai", "Kolkata"));
		
	}
}
