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
public class TestRectangle {
    public static void main (String []args){
        Point xy =new Point(1,2);
        Rectangle r = new Rectangle(xy,3,4);
        System.out.println("เส้นรอบรูปของสี่เหลี่ยมนี้คือ = "+r.getPerimeter());
        System.out.println("พื้นที่ของสี่เหลี่ยมนี้คือ = "+r.getArea());
        Point p = new Point(2,3);
        Point q = new Point(2,0);
        
        System.out.print("จุด P พิกัด (" +p.getX()+ "," +p.getY()+ ")");
        if(r.contains(p))
            System.out.println("อยู่ในสี่เหลี่ยมนี้");
        else
            System.out.println("ไม่มีอยู่ในสี่เหลี่ยมมนี้");
        System.out.print("จุด q พิกัด (" +q.getX()+ "," +q.getY()+ ")");
        if(r.contains(q))
            System.out.println("อยู่ในสี่เหลี่ยมนี้");
        else
            System.out.println("ไม่มีอยู่ในสี่เหลี่ยมนี้");
                 
    }
    
}
