package Misc;

import Dragons.Element;

import java.util.Scanner;

/**
 * Class for handling the interactions with the player
 */
public class Interaction {
    private static Interaction interaction;

    private static Scanner scanner;

    /**
     * Constructs a new interaction object
     */
    private Interaction(){
        scanner = new Scanner(System.in);
    }

    /**
     * Returns a new instance of the Interaction object
     * @return a new instance
     */
    public static Interaction getInstance(){
        if (interaction == null){
            interaction = new Interaction();
        }
        return interaction;
    }

    /**
     * Asks the player what their name is
     * @return the name of the player
     */
    public String askPlayerName(){
        System.out.println("What is your name? >");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        return name;
    }
}
