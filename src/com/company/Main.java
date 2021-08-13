package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setChooseBossDefence("Phisical");
        boss.setHealth(1000);
        boss.setDamage(100);
        System.out.println(boss.getHealth() + ", " + boss.getDamage() + ", " + boss.getChooseBossDefence());
    }
}
