//@Hoque, Aug/29/2017: A Java based graphics template for students of CSCI 4631/5631
import java.awt.*;
import java.awt.image.*;   // For BufferedImage
import javax.swing.*;      // To display the outcome
import java.awt.Color;    // For color

public class DrawJGraph {

	public static void main(String[] args) {

		BufferedImage img = new BufferedImage(720, 480, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = img.createGraphics();
        g2d.setBackground(Color.WHITE);  // Creating a white background
        g2d.fillRect(0, 0, 720, 480);

        g2d.setColor(Color.RED);
        g2d.drawLine(10, 5, 350, 320);   // Draw line #1 with RED color

        g2d.setColor(Color.BLUE);        // Draw a BLUE colored circle
        g2d.drawOval(100, 50, 200, 200); //Oval (X, Y, r, r) => Cirle [Note: Draws the outline of an oval. The result is a circle or ellipse that fits within the rectangle specified by the x, y, width, and height arguments.]

        int pix= img.getRGB(10, 5);         // Read the color at (x, y) [color of the 1st line]
        Color pixcolor = new Color(pix);    // Convert the color value into Color Structure
        System.out.println(pixcolor.getRed());    // Demo: showing how to get the R.G.B.A values
        System.out.println(pixcolor.getGreen());
        System.out.println(pixcolor.getBlue());
        System.out.println(pixcolor.getAlpha());

        g2d.setColor(pixcolor);        // Use the read color at (10,5) which was the color of the drawn line #1
        g2d.drawLine(100, 50, 300, 50); // Draw Line #2 with the same color


        Icon icon = new ImageIcon(img);
        JLabel label = new JLabel(icon);

        JFrame myFrame = new JFrame("Java Frame");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.getContentPane().add(label);
        myFrame.pack();
        myFrame.setVisible(true);

	}

}
