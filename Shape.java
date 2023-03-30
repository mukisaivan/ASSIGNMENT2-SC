import javax.swing.JOptionPane;

public class Shape {
    int centreX;
    int centreY;

    public void perimeter() {
        
    }

    public void area() {
        
    }

    public void position() {
        this.centreX = Integer.parseInt(JOptionPane.showInputDialog("Enter centre X cordinate: "));
        this.centreY = Integer.parseInt(JOptionPane.showInputDialog("Enter centre Y cordinate: "));

        JOptionPane.showMessageDialog(null, "The position of the square is " + "(" + centreX + "," + centreY + ")");
        System.out.println("Position (" + centreX + "," + centreY + ")");
    }
 
}
