package com.gyk.java.oop.basics;


import java.sql.Array;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{x, y};
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public double distance(int x, int y){
        int newX= this.x-x;
        int newY= this.y-y;
        return Math.sqrt(newX*newX + newY*newY);
    }
    public double distance(MyPoint another){
        int newX= this.x-another.x;
        int newY= this.y-another.y;
        return Math.sqrt(newX*newX + newY*newY);
    }
    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}
