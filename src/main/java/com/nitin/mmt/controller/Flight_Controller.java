package com.nitin.mmt.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.nitin.mmt.Flight_Details;

public class Flight_Controller {

	ArrayList<Flight_Details> flightList;
	
	public Flight_Controller()
	{
		flightList=new ArrayList<>();
	}
	
	public void addFlight(Flight_Details flight)
	{
		flightList.add(flight);
	}
	
	public ArrayList<Flight_Details> removeFlight(int flightId)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getflightId()==flightId)
				flightList.remove(flights);
			return flightList;
		}
		throw new RuntimeException("Flight does not exist");
	}
	public ArrayList<Flight_Details> updateFlightDepTime(int flightId, int departureTime)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getflightId()==flightId)
				flights.setDepartureTime(departureTime);
			return flightList;
		}
		throw new RuntimeException("Flight does not exist");
	}
	public ArrayList<Flight_Details> updateFlightArrTime(int flightId, int arrivalTime)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getflightId()==flightId)
				flights.setArrivalTime(arrivalTime);
			return flightList;
		}
		throw new RuntimeException("Flight does not exist");
	}
	public ArrayList<Flight_Details> updateFlightSource(int flightId, String source)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getflightId()==flightId)
				flights.setSource(source);
			return flightList;
		}
		throw new RuntimeException("Flight does not exist");
	}
	public ArrayList<Flight_Details> updateFlightDestination(int flightId, String destination)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getflightId()==flightId)
				flights.setDestination(destination);
			return flightList;
		}
		throw new RuntimeException("Flight does not exist");
	}
	public ArrayList<Flight_Details> getAllFlights()
	{
		return flightList;
	}
	
	public ArrayList<Flight_Details> sortByFlightTime(String source, String destination)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getSource()==source&&flights.getDestination()==destination)
			{
				Collections.sort(flightList, new Comparator<Flight_Details>() {
					public int compare(Flight_Details one, Flight_Details other) {
				        return one.getDuration()-other.getDuration();
				    }
				});
				return flightList;
			}
		}
		throw new RuntimeException("Flight does not exist");
	}
	public ArrayList<Flight_Details> sortByFlightFare(String source, String destination)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getSource()==source&&flights.getDestination()==destination)
			{
				Collections.sort(flightList, new Comparator<Flight_Details>() {
					public int compare(Flight_Details one, Flight_Details other) {
				        return (int) (one.getFare()-other.getFare());
				    }
				});
				return flightList;
			}
		}
		throw new RuntimeException("Flight does not exist");
	}
	
	public Flight_Details getMorningFlights(String source, String destination)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getSource().equals(source)&&flights.getDestination().equals(destination))
			{
				if(flights.getDepartureTime()>=0600&&flights.getDepartureTime()<1200)
				return flights;
			}
		}
		throw new RuntimeException("Flight does not exist");
	}
	public Flight_Details getAfterNoonFlights(String source, String destination)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getSource().equals(source)&&flights.getDestination().equals(destination))
			{
				if(flights.getDepartureTime()>=1200&&flights.getDepartureTime()<1800)
				return flights;
			}
		}
		throw new RuntimeException("Flight does not exist");
	}
	public Flight_Details getNightFlights(String source, String destination)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getSource().equals(source)&&flights.getDestination().equals(destination))
			{
				if(flights.getDepartureTime()>=1800&&flights.getDepartureTime()<=2400)
				return flights;
			}
		}
		throw new RuntimeException("Flight does not exist");
	}
	public Flight_Details getLateNightFlights(String source, String destination)
	{
		for(Flight_Details flights: flightList)
		{
			if(flights.getSource().equals(source)&&flights.getDestination().equals(destination))
			{
				if(flights.getDepartureTime()>0000&&flights.getDepartureTime()<0600)
				return flights;
			}
		}
		throw new RuntimeException("Flight does not exist");
	}
	
	
}
