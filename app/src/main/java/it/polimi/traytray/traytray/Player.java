package it.polimi.traytray.traytray;

/**
 * Created by Матвей on 20.11.2014.
 */
public class Player {

    private boolean ai;
    private String name;
    private int wins, loses;

    public void Player(boolean ai, String name){
        this.ai = ai;
        this.name = name;
        this.wins = this.loses = 0;
    }

}
