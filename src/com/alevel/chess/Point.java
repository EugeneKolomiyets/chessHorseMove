package com.alevel.chess;

public class Point {
    private int x,y;
    public boolean checkPoint(Point point){
        return (this.x==point.x)&(this.y==point.y);
    }
    @Override
    public String toString() {
        return "x = "+x+" y = "+y;
    }
    public Point(int x,int y){
        if ((x<0)|(x>7)|(y<0)|(y>7)) {
            System.out.println("wrong init point of horse. Initialisation halt");
            this.x = -100;
            this.y = -100;
        }
       else {
            this.x = x;
            this.y = y;
        }
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public boolean Up(){
        if (x==7)
            return false;
        x++;
        return true;
    }
    public boolean Down(){
        if (x==0)
            return false;
        x--;
        return true;
    }
    public boolean Right(){
        if (y==7)
            return false;
        y++;
        return true;
    }
    public boolean Left(){
        if (y==0)
            return false;
        y--;
        return true;
    }
}
