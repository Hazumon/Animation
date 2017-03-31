package animation;

/**
 *
 * @author zerellgardner
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Animation {
    int x = 70;
    int y = 70;
    
   
  
    public static void main(String[] args) {
        Animation gui = new Animation();
        gui.go();
    }
    
    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyDrawPanel drawPanel = new MyDrawPanel();
      //  ClassPicture pic = new ClassPicture();
        
        frame.getContentPane().add(drawPanel);
      //  frame.getContentPane().add(BorderLayout.NORTH, pic);
        frame.setSize(300,300);
        frame.setVisible(true);
        
        for (int i = 0; i <150; i++){
            x++;
            y++;
            
            drawPanel.repaint();
            try{
                Thread.sleep(25);
            }
            catch(Exception ex){}
            }
    }
    
    class MyDrawPanel extends JPanel{
        public void paintComponent (Graphics g){
            g.setColor(Color.black);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            
            g.setColor(Color.green);
            g.fillOval(x,y, 40,40);
        }
    
    
}
}
