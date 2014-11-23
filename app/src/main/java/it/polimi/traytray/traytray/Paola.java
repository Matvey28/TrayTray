package it.polimi.traytray.traytray;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by Матвей on 18.11.2014.
 */
public class Paola {

    private static InputStream input = new InputStream() {
        @Override
        public int read() throws IOException {
            return 0;
        }
    }  ;
    private static Scanner scan = new Scanner(input);
    private static Game g;

    public static void paola(){
        init(); //initialize
        do{
            g.moveSeeds(scan.nextInt());
            g.finishTurn();
        } while (!g.terminal);
        end();
    }

    // install initial state
    private static void init(){
        g = new Game(false, 6, 3); // add xml stuff
        g.redraw();
   }

    private static void end(){
        g.moveRemainingSeeds();
        g.makeStatistics();

    }


}
