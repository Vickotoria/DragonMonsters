package Misc;

import java.util.Scanner;

/**
 * Class for handling the interactions with the player
 */
public class Interaction {
    private static Interaction interaction;

    private static Scanner scanner;

    private Interaction(){
        scanner = new Scanner(System.in);
    }

    public static Interaction getInstance(){
        if (interaction == null){
            interaction = new Interaction();
        }
        return interaction;
    }
}
