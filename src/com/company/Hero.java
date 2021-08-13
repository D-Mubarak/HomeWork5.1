package com.company;

public class Hero {
    private int Health;
    private int Damage;
    private String heroesAttackType;

    public Hero(int health, int damage, String heroesAttackType) {
        Health = health;
        Damage = damage;
        heroesAttackType = heroesAttackType;
    }


    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }
}
