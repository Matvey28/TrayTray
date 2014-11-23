package it.polimi.traytray.traytray;

import android.util.Log;

/**
 * Created by Матвей on 15.11.2014.
 */
public class Bowl {
    private Player player;  //
    private int seeds;      // number of seeds in the bowl

    public int getSeeds(){
        return this.seeds;
    }

    //bowl constructor
    Bowl(Player player) {
        this.player = player;
        this.seeds = 3; // read from xml
    }

    // graphical representation of the bowl
    public void draw(){
        Log.d("Ciao", "Rook");
    }

    public void takeSeeds(){
        this.seeds = 0;
    }

    public void putSeeds(int seeds){
        this.seeds += seeds;
    }
}
