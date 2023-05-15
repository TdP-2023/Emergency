package it.polito.tdp.emergency;

public class TestSimulator {
	
	public static void main(String[] args) {
		Simulator sim = new Simulator(3) ;
		
		sim.initialize();
		sim.run();
	}

}
