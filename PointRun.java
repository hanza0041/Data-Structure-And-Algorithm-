package Question1;


import Question1.Point;
import static java.time.Clock.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goose
 */

public class PointRun {
    public static void main(String []args){
        Point A = new Point();
        System.out.println(A.toString());
        Point B = new Point(-3,2);
        System.out.println(B.toString());
        A.setX(1);
        A.setY(1);
        System.out.println(A.toString());
        System.out.println("x of B = " + B.getX());
        System.out.println("y of B = " + B.getY());
        double dis = A.distanceTo(B);
        System.out.printf("Distance between A and B = %.3f\n",dis);
        System.out.printf("Distance between B and A = %.4f\n",B.distanceTo(A));
    }
    
        
    }

    
