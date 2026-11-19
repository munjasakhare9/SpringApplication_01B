package com.demo.mobile;

import com.demo.sim.RelianceSim;
import com.demo.sim.Sim;

public class RelianceMobile {
	private Sim s = new RelianceSim();

	public void startMobile() {
		System.out.println("welcome to reliance mobile...");
	}

	public RelianceMobile() {
		startMobile();
		s.startSim();
	}
}
