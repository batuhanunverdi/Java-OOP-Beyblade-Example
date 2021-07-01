package Beyblade;

public class Dragon extends Beyblade {
    private String CelestialMonster;
    private String SecretAbility;

    public Dragon(String beyblader, int speed, int attackPower,String celestialMonster,String secretAbility) {
        super(beyblader, speed, attackPower);
        this.CelestialMonster = celestialMonster;
        this.SecretAbility = secretAbility;
    }

    @Override
    public void CelestialMonsterAwaken() {
        System.out.println(getBeyblader()+"awakened"+CelestialMonster);
        System.out.println(getBeyblader()+"'s attack is : Ghost Tornado ");
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Celestial Monster"+ CelestialMonster);
        System.out.println("SecretAbility = " + SecretAbility);
    }
}
