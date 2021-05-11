package Misc;

import Trainers.Trainer;

import java.util.ArrayList;
import java.util.Scanner;

public class GameEngine {
    //private final int maxNumMon = 5;

    private Interaction interaction;
    private XmlLoader xmlLoader;

    private Trainer player;
    private ArrayList<Trainer> enemyTrainers;

    public GameEngine(){
        interaction = Interaction.getInstance();
        xmlLoader = XmlLoader.getInstance();

        player = new Trainer(interaction.askPlayerName(), 5);
    }

    public void play(){
        //
    }
}
