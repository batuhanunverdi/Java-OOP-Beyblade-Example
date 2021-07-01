package Beyblade;

import java.sql.SQLOutput;

public class Beyblade {
    private String beyblader;
    private int Speed;
    private int AttackPower;

    public Beyblade(String beyblader, int speed, int attackPower) {
        this.beyblader = beyblader;
        Speed = speed;
        AttackPower = attackPower;
    }

    public String getBeyblader() {
        return beyblader;
    }

    public void setBeyblader(String beyblader) {
        this.beyblader = beyblader;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getAttackPower() {
        return AttackPower;
    }

    public void setAttackPower(int attackPower) {
        AttackPower = attackPower;
    }

    public void Attack()
    {
        System.out.println(beyblader+" Damaged"+getAttackPower()+" Speed"+getSpeed());
    }
    public void CelestialMonsterAwaken()
    {
        System.out.println("The Beyblade has no Celestial Monster.");
    }
    public void ShowInfo()
    {
        System.out.println("Beyblader = "+beyblader);
        System.out.println("Attack Power = "+AttackPower);
        System.out.println("Speed = "+ Speed);
    }
}
