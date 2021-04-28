package Misc;

import Trainers.EnemyTrainer;
import Trainers.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class GameEngine {
    //private final int maxNumMon = 5;

    private Scanner scanner;

    private Player player;
    private ArrayList<EnemyTrainer> enemyTrainers;

    public GameEngine(){
        setupGame();
    }

    private void setupGame(){
        //basic setup
        scanner = new Scanner(System.in);

        //monsters

        //player
        player = new Player(askPlayerName(), null, null);
        System.out.println(player.getName()); //todo remove

        //enemies

    }

    private String askPlayerName(){
        System.out.println("What is your name?");
        return scanner.nextLine();
    }
}
