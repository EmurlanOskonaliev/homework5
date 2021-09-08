package com.company;

public class Hero {
	private int health;

	public int getHealth() {
		return health;
	}

	private int damage;

	public int getDamage() {
		return damage;
	}

	private String superpower;

	public String getSuperpower() {
		return superpower;
	}


	public Hero(int health, int damage, String superpower){
		this.health=health;
		this.damage=damage;
		this.superpower=superpower;
	}

	public Hero(int health, int damage){
		this.damage=damage;
		this.health=health;
	}


}

