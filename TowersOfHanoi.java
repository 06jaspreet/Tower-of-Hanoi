import java.util.*;

public class TowersOfHanoi {
    
    public static void main (String [] args) {

        moveRing( 4, "Tower 1",  "Tower 2", "Tower 3");
    }//end main

    public static void moveRing(int rings, String start, String temp, String end){
        if (rings == 1){
            System.out.println("Move from " + start + " to " + end);

        } else {
            moveRing(rings -1, start, end, temp);
            System.out.println("Move from " + start + " to " + end);
            moveRing(rings -1, temp, start, end);
        }
    }
    
}
