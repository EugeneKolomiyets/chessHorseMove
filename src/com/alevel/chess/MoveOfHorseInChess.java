package com.alevel.chess;

import java.util.Random;

public class MoveOfHorseInChess {
    public static void main(String[] args) {
        Horse horse = new Horse(new Point(7, 7));
        horse.MakeAllPossibleMoves();
        horse.CheckPoint(new Point(6, 5));


 /*   int x=7,y=7,x1=6,y1=5;

    if ((x-2>=0)&(y-1>=0))
         if ((x-2==x1)&(y-1==y1))
            System.out.println("match");
    else if ((x-2>=0)&(y+1<7))
             if ((x-2==x1)&(y+1==y1))
                 System.out.println("match");         */
    }
}
