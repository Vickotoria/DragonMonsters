package Misc;

import Trainers.Trainer;

import java.util.ArrayList;
import java.util.Scanner;

public class GameEngine {
    //private final int maxNumMon = 5;

    private Interaction interaction;

    private Trainer player;
    private ArrayList<Trainer> enemyTrainers;

    public GameEngine(){
        interaction = Interaction.getInstance();
    }
}
