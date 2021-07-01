package Beyblade;

public class BeybladeFactory {
    public Beyblade MakeBeyblade(String beybladeType)
    {
        if(beybladeType.equals("Dragon"))
        {
            return new Dragon("Takao",800,300,"Blue Dragon","Talk with Celestial Monster");
        }
        else if (beybladeType.equals("Dranza"))
        {
            return new Dranza("Kai",600,4000,"Red Phoenix");
        }
        else if (beybladeType.equals("Drayga"))
        {
            return new Drayga("Rei",800,250,"White Tiger");
        }
        else if (beybladeType.equals("Draciel"))
        {
            return new Draciel("Max",400,1000,"Black Turtle");
        }
        else
        {
            return null;
        }
    }
}
