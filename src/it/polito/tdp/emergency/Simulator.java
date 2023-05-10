package it.polito.tdp.emergency;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.PriorityQueue;

public class Simulator {
	
	// STATO DEL SISTEMA-MONDO
	private List<Patient> patients ;
	private int studiLiberi ;
	
	// PARAMETRI DI INGRESSO - TUNING
	private int studiTotali ;
	
	private Duration tArrival = Duration.of(10,ChronoUnit.MINUTES);
	
	private LocalTime simStart = LocalTime.of(8, 0);
	private LocalTime simStop = LocalTime.of(20, 0);
	
	private Duration triageTime = Duration.of(5, ChronoUnit.MINUTES);
	private Duration timeoutWhite = Duration.of(60, ChronoUnit.MINUTES);
	private Duration timeoutYellow = Duration.of(60, ChronoUnit.MINUTES);
	private Duration timeoutRed = Duration.of(30, ChronoUnit.MINUTES);
	
	private Duration healWhite = Duration.of(10, ChronoUnit.MINUTES);
	private Duration healYellow = Duration.of(15, ChronoUnit.MINUTES);
	private Duration healRed = Duration.of(30, ChronoUnit.MINUTES);
	
	
	// INDICATORI DI USCITA
	private int nPatients ;
	private int nHealedPatients ;
	private int nAbandonedPatients ;
	private int nDeadPatients ;
	
	// CODA DEGLI EVENTI
	private PriorityQueue<Event> queue ;

	public Simulator(int studiTotali) {
		super();
		this.studiTotali = studiTotali;
	}

	public int getnPatients() {
		return nPatients;
	}

	public int getnHealedPatients() {
		return nHealedPatients;
	}

	public int getnAbandonedPatients() {
		return nAbandonedPatients;
	}

	public int getnDeadPatients() {
		return nDeadPatients;
	}

	public void settArrival(Duration tArrival) {
		this.tArrival = tArrival;
	}

	public void setSimStart(LocalTime simStart) {
		this.simStart = simStart;
	}

	public void setSimStop(LocalTime simStop) {
		this.simStop = simStop;
	}

	public void setTriageTime(Duration triageTime) {
		this.triageTime = triageTime;
	}

	public void setTimeoutWhite(Duration timeoutWhite) {
		this.timeoutWhite = timeoutWhite;
	}

	public void setTimeoutYellow(Duration timeoutYellow) {
		this.timeoutYellow = timeoutYellow;
	}

	public void setTimeoutRed(Duration timeoutRed) {
		this.timeoutRed = timeoutRed;
	}

	public void setHealWhite(Duration healWhite) {
		this.healWhite = healWhite;
	}

	public void setHealYellow(Duration healYellow) {
		this.healYellow = healYellow;
	}

	public void setHealRed(Duration healRed) {
		this.healRed = healRed;
	}
	
	
	
	

}
