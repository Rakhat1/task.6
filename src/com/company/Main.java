package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHealth(100);
	boss.setDamage(20);

        System.out.println(boss.printInfo());


    }
}
