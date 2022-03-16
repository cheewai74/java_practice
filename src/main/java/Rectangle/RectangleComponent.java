package Rectangle;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent{

    public void paintComponent(Graphics g){

        // RecoverGraphics2D
        // Using a cast to recover the Graphics 2D obj from the Graphics parameter
        // of the paintComponent method.
        Graphics2D g2 = (Graphics2D) g;

        // Construct a rectangle and draw it
        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);

        // More rectangle 15 units jto the right and 25 units down
        box.translate(15, 25);

        // Draw moved rectangle
        g2.draw(box);

    }

}
