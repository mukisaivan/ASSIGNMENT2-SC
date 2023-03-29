import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Circle extends JFrame{

    int radius;
    int centreX;
    int centreY;

    final double PI = 3.14;

    // Circle(int radius, int centreX, int centreY) {

    //     this.radius = Integer.parseInt(JOptionPane.showInputDialog("Enter circle radius: "));
    //     this.centreX = centreX;
    //     this.centreY = centreY;
    // }
    

    public void perimeter() {

        this.radius = Integer.parseInt(JOptionPane.showInputDialog("Enter circle radius: "));
        double result = 2 * PI * this.radius;

        System.out.print("Perimeter: " + result + "\n");
        JOptionPane.showMessageDialog(null, "The perimeter of the circle is " + result + " UNITS");
        System.out.println();

        

    }
    
    public void area() {
        
        this.radius = Integer.parseInt(JOptionPane.showInputDialog("Enter circle radius: "));  
        double result = PI * Math.pow(this.radius, 2);
        JOptionPane.showMessageDialog(null, "The area of the ciircle is " + result + " SQUARE UNITS");

        System.out.println("Area: "+ result + "\n" );
        
    }
    
    // public void position() {
    //     this.centreX = Integer.parseInt(JOptionPane.showInputDialog("Enter centre X cordinate: "));
    //     this.centreY = Integer.parseInt(JOptionPane.showInputDialog("Enter centre Y cordinate: "));
    //     JOptionPane.showMessageDialog(null, "The position of the circle is " + "(" + this.centreX + "," + this.centreY + ")");

    //     if (centreX == 0 || centreY == 0) {
    //         System.out.println("you have specified the centre");
    //     } else {
    //         System.out.println("Position (" + this.centreX + ", " + this.centreY + ")");
    //     }

    // }
   


    
    @Override
    public void paint(Graphics g) {

        this.setSize(750, 750);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.red);

        this.radius = Integer.parseInt(JOptionPane.showInputDialog("Enter circle radius: "));
        this.centreX = Integer.parseInt(JOptionPane.showInputDialog("Enter centre X cordinate: "));
        this.centreY = Integer.parseInt(JOptionPane.showInputDialog("Enter centre Y cordinate: "));

        g2d.fillOval(this.centreX, this.centreY, this.radius, this.radius);
        


        
    }

}
