package com.jamesmhare.javadesignpatterns.FactoryPattern;

import java.text.DecimalFormat;

/**
 * Serves as an abstract class for a game character.
 */
public abstract class GameCharacter {

    private String name;
    private double speed;
    private double attackPower;
    private double health = 100;
    private String status = "Alive";
    private DecimalFormat decimalFormatter = new DecimalFormat("#.##");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getStatus() {
        return status;
    }

    public void attack(GameCharacter enemy) {
        System.out.println(this.getName() + " is attacking.");
        Double hitPower = this.attackPower * this.speed;
        enemy.setHealth(enemy.getHealth() - hitPower);
        System.out.println(enemy.getName() + " took a hit of " + decimalFormatter.format(hitPower) + ".");
        if (enemy.getHealth() <= 0){
            System.out.println(enemy.getName() + "\'s health is now at 0%");
        } else {
            System.out.println(enemy.getName() + "\'s health is now at " + decimalFormatter.format(enemy.getHealth()) + "%");
        }
        enemy.evaluateHealth();
    }

    public void evaluateHealth() {
        if (this.getHealth() <= 0){
            this.status = "Dead";
            System.out.println(this.getName() + " has died.");
        }
    }
}
