package it.polito.tdp.emergency;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestSimulator {
	
	public static void main(String[] args) {
		Simulator sim = new Simulator(2) ;
		
		sim.settArrival(Duration.of(5, ChronoUnit.MINUTES));
		
		sim.initialize();
		sim.run();
		
		System.out.println("Pazienti: "+sim.getnPatients()) ;
		System.out.println("Curati:   "+sim.getnHealedPatients()) ;
		System.out.println("Abbandon: "+sim.getnAbandonedPatients()) ;
		System.out.println("Morti:    "+sim.getnDeadPatients()) ;
	}

}
