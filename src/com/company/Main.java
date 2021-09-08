package com.company;

public class Main {

    public static void main(String[] args) {
    	Boss b = new Boss();
    	b.setBossHealth(700);
    	b.setBossDamage(50);
    	b.setBossAbility("Thor");
		System.out.println(b.getBossHealth()+ " " + b.getBossDamage()+ " " + b.getBossAbility() );
	}
}
