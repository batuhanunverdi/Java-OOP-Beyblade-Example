package Beyblade;

public class Draciel extends Beyblade{
    private String CelestialMonster;
    public Draciel(String beyblader, int speed, int attackPower,String celestialMonster) {
        super(beyblader, speed, attackPower);
        this.CelestialMonster = celestialMonster;
    }

    @Override
    public void CelestialMonsterAwaken() {
        System.out.println(getBeyblader()+"awakened"+CelestialMonster);
        System.out.println(getBeyblader()+"'s defend is : Castle Defend");
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Celestial Monster"+ CelestialMonster);
    }
}
