package zombiefu;

import java.awt.Color;
import jade.ui.TermPanel;
import jade.util.datatype.ColoredChar;
import java.util.ArrayList;
import zombiefu.creature.Player;
import zombiefu.items.Waffe;
import zombiefu.util.Creator;
import zombiefu.util.KeyEdit;
import zombiefu.util.ZombieTools;
import zombiefu.ui.ZombieFrame;
import zombiefu.util.ZombieGame;

public class ZombieFU {

    public static void main(String[] args) {

        ZombieGame.createGame("The Final Exam - Die Anwesenheitspflicht schlägt zurück");
        ZombieGame.keyInit("config.txt");
        ZombieGame.createPlayer(KeyEdit.getPlayername());
        
        ZombieGame.showStaticImage("startscreen.txt");
        ZombieGame.showStaticImage("story.txt");

        ZombieGame.initialize();
        
        ZombieGame.startGame();
        
    }
}
