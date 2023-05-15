package it.polito.tdp.emergency;

import java.time.LocalTime;

public class Patient {
	
	public enum State {
		UNKNOWN, WHITE, YELLOW, RED, BLACK, OUT ;
	}
	
	private State state ;
	private LocalTime arrival ; // tempo di ingresso in sala d'aspetto
	
	public Patient(State state, LocalTime arrival) {
		super();
		this.state = state;
		this.arrival = arrival;
	}

	@Override
	public String toString() {
		return "[" + state + " @ " + arrival + "]";
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public LocalTime getArrival() {
		return arrival;
	}

	public void setArrival(LocalTime arrival) {
		this.arrival = arrival;
	}
	
	
	
}
