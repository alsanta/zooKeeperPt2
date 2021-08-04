package com.Santana.zooKeeperPt2;

public class Bat extends Mammal {
//	Member Variables here
	
//	Constructor
	public Bat(){
		this.energy = 300;
	}
	
//	Methods
	public void fly() {
		System.out.println("You hear a loud flapping sound as the bat flys high");
		this.energy -= 50;
	}
	
	public void eatHumans() {
		System.out.println("You hear ungodly sounds as the bats feasts");
		this.energy += 25;
	}
	
	public void attackTown() {
		System.out.println("You hear the sounds of the town being attacked");
		this.energy -= 100;
	}
}
