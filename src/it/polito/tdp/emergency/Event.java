package it.polito.tdp.emergency;

import java.time.LocalTime;

public class Event implements Comparable<Event> {
	
	public enum EventType {
		NEW,
		TRIAGE,
		TIMEOUT,
		FREE_STUDIO,
		HEAL
	}
	
	private LocalTime time ;
	private EventType type ;
	private Patient patient ;
	
	public Event(LocalTime time, EventType type, Patient patient) {
		super();
		this.time = time;
		this.type = type;
		this.patient = patient;
	}

	public LocalTime getTime() {
		return time;
	}

	public EventType getType() {
		return type;
	}

	public Patient getPatient() {
		return patient;
	}

	@Override
	public int compareTo(Event other) {
		return this.time.compareTo(other.time) ;
	}

	@Override
	public String toString() {
		return "[" + time + "-" + type + ": " + patient + "]";
	}

	
}
