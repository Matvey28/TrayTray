package it.polimi.traytray.traytray;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Матвей on 18.11.2014.
 */
public class Game {

    private int size;
    private ArrayList<Bowl> bowls;
    private boolean turn;
    public boolean terminal;

    Game(boolean ai, int size, int seeds){
        this.size = size;
        Player p1, p2 = new Player();
        for (int i = 0; i < size; i++) {
            bowls.add(new Bowl(, seeds));
        }
        bowls.add(new Bowl(true, false, 0));
        for (int i = 0; i < size; i++) {
            bowls.add(new Bowl(false, true, seeds));
        }
        bowls.add(new Bowl(true, true, 0));
        this.turn = false;
        this.terminal = false;
    }

    public void redraw(){
        Log.d("Ciao", "I am drawing");
    }

    public void moveSeeds(int bowl){
        int b = (!true) ? bowl : bowl + size + 1;
        int s = bowls.get(b).getSeeds();
        bowls.get(b).takeSeeds();
        for (int i = 0; i < s - 1; i++) {
            bowls.get(b + 1).putSeeds(1);
        }
        if (bowls.get(b).getSeeds() == 0){
            int p = (!turn) ? 2 * size - b : b - 2 * size;
            bowls.get(size).putSeeds(1 + p);
        }
    }

    public void finishTurn(){
        turn = !turn;
    }

    public void moveRemainingSeeds(){
        int s = 0;
        for (int i = 0; i < size; i++) {
            Bowl b = bowls.get(((turn) ? 0 : size + 1) + i);
            s = b.getSeeds();
            if (s != 0){
                b.takeSeeds();
                bowls.get((turn) ? size : 2 * size).putSeeds(s);
            }
        }
    }

    public void result(){
        Log.d("Ciao", "Sono resultato");
    }

    public void makeStatistics(){
        Log.d("Ciao", "Statistics");
    }

}
