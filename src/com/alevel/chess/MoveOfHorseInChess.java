package com.alevel.chess;

import java.util.Random;

public class MoveOfHorseInChess {
    public static void main(String[] args) {
        Horse horse = new Horse(new Point(1,3));
        horse.MakeAllPossibleMoves();
        horse.CheckPoint(new Point(0,6));
    }
}
