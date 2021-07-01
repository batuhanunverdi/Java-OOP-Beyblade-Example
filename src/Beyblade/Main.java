package Beyblade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to The Beyblade Program");
        System.out.println("Press q to leave");
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Which Beyblade Do you want to Make? ");
            String processes = scanner.nextLine();
            if (processes.equals("q"))
            {
                System.out.println("Leaving to the Program");
                break;
            }
            else
            {
                BeybladeFactory beybladefac = new BeybladeFactory();
                Beyblade beyblade = beybladefac.MakeBeyblade(processes);
                if (beyblade == null)
                {
                    System.out.println("Input a True Beyblade Name");
                }
                else
                {
                    beyblade.ShowInfo();
                    beyblade.Attack();
                    beyblade.CelestialMonsterAwaken();
                }
            }

        }
    }
}
