package com.Santana.zooKeeperPt2;

public class Mammal {
//	Member Variables
	public int energy;
//	Constructor for the Mammal Class
	public Mammal() {
		this.energy = 100;
	}
//	Getting the energy and displaying it (Since the energy Member Variable is private
	public int displayEnergy() {
		System.out.println(this.energy);
		return this.energy;
	}
}