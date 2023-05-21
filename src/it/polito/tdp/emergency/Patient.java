package it.polito.tdp.emergency;

import java.time.LocalTime;

public class Patient {
	
	public enum State {
		UNKNOWN, WHITE, YELLOW, RED, BLACK, HEALING, OUT ;
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

	public boolean comesBefore(Patient other) {
		if(this.state==State.RED && other.state!=State.RED) {
			return true ;
		} else if (this.state == State.YELLOW && other.state==State.WHITE) {
			return true ;
		} else if (this.state == State.YELLOW && other.state==State.RED) {
			return false ;
		} else if (this.state == State.WHITE && other.state!=State.WHITE) {
			return false ;
		} else {
			return this.arrival.isBefore(other.arrival);
		}
	}
	
	
	
}
