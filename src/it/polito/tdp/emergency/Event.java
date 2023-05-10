package it.polito.tdp.emergency;

import java.time.LocalTime;

public class Event {
	
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

}
