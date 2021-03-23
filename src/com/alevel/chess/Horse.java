package com.alevel.chess;

public class Horse {
    private Point point,step;
    private Point[] mas = new Point[8];
    private int counter=0;

    public Horse(Point point){
        this.point=point;
    }
    public void move(boolean goGoGo){
        if(goGoGo){
            mas[counter]=new Point(step);
            counter++;
        }
    }
    public void MakeAllPossibleMoves(){
        step = new Point(point);
        move((step.Up()&step.Up()&step.Left()));
        step = new Point(point);
        move((step.Up()&step.Up()&step.Right()));
        step = new Point(point);
        move((step.Down()&step.Down()&step.Left()));
        step = new Point(point);
        move((step.Down()&step.Down()&step.Right()));
        step = new Point(point);
        move((step.Left()&step.Left()&step.Up()));
        step = new Point(point);
        move((step.Left()&step.Left()&step.Down()));
        step = new Point(point);
        move((step.Right()&step.Right()&&step.Up()));
        step = new Point(point);
        move((step.Right()&step.Right()&step.Down()));
    }
    public void CheckPoint(Point p){
        for (int i = 0; i < counter; i++) {
            if (mas[i].checkPoint(p))
                System.out.println("Point "+p+" match with horse init point "+point);
        }

    }

}
