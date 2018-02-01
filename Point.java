package Question1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goose
 */
public class Point {
    double x;
    private double y;
    Point(){
        x=0.0 ;y=0.0;
    }
    Point(double a ,double b){
        x=a; y=b;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double distanceTo(Point p){
        double a,b;
        a= Math.abs(this.x-p.x);
        b= Math.abs(this.y-p.y);
        return Math.sqrt((a*a)+(b*b));
        
    }
    @Override
    public  String toString(){
        String s ="";
        s=s+"This point is x = "+x+"y = "+y+"\n";
        return s ;
    }

}
