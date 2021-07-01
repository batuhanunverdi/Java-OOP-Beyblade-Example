package Beyblade;

public class Drayga extends Beyblade{
    private String CelestialMonster;
    public Drayga(String beyblader, int speed, int attackPower,String celestialMonster) {
        super(beyblader, speed, attackPower);
        this.CelestialMonster = celestialMonster;
    }

    @Override
    public void CelestialMonsterAwaken() {
        System.out.println(getBeyblader()+"awakened"+CelestialMonster);
        System.out.println(getBeyblader()+"'s attack is : Tiger Claw");
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Celestial Monster"+ CelestialMonster);
    }
}
