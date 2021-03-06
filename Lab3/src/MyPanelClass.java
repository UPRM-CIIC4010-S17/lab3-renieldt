import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.GRAY);
                        g.fillRect(x1,  y1,  width + 1,  height + 1);
                        
//                        //Draw a border
//                        g.setColor(Color.CYAN);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw a second border
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1 + 3, y1 + 3, width - 6, height - 6);
//                        
//                        //Draw lines
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Draw second line
//                        g.setColor(Color.RED);
//                        g.drawLine(x1, y2, x2, y1);
                        
                        //Draw Oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval(x1 + 70, y1 + 70, 55, 55);
                        
            }
}