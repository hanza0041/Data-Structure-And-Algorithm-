/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Goose
 */
public class Rectangle {
    private Point p;
    private double width;
    private double height;
    public Rectangle(Point begin,double w,double h){
        p=begin;
        width= w;
        height=h;
    }
    public double getArea(){
        return width *height;
    }
    public double getPerimeter(){
        return (width+height) *2;
    }
    public boolean contains(Point q){
           return (q.getX()>=p.getX()&& q.getX()<=(p.getX()+width))&&
                   (q.getY()>=(p.getY()-height)&& q.getY()<=p.getY());
    }
}
