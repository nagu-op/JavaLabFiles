import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class TrafficLight extends JPanel implements ActionListener{
    private JRadioButton r1;
    private JRadioButton r2;
    private JRadioButton r3;
    private Color red_c;
    private Color yellow_c;
    private Color green_c;
    public TrafficLight(){
        setBounds(0,0,640,480);
        r1 = new JRadioButton("red");
        r2 = new JRadioButton("yellow");
        r3 = new JRadioButton("green");
        red_c = getBackground();
        yellow_c = getBackground();
        green_c = getBackground();
        // r1.setSelected(true);
        // red_c = Color.red;
        // yellow_c = getBackground();
        // green_c = getBackground();
        ButtonGroup gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        gp.add(r3);
        add(r1);
        add(r2);
        add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){

        if(r1.isSelected() == true){
            red_c = Color.red;
            yellow_c = getBackground();
            green_c = getBackground();
        }
        else if(r2.isSelected() == true){
            red_c = getBackground();
            yellow_c = Color.yellow;
            green_c = getBackground();
        }
        else if(r3.isSelected() == true){
            red_c  = getBackground();
            yellow_c = getBackground();
            green_c = Color.green;
        }
        repaint();



    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(50,50,50,50);
        g.drawOval(50,110,50,50);
        g.drawOval(50,170,50,50);
        g.setColor(red_c);
        g.fillOval(50, 50, 50, 50);
        g.setColor(yellow_c);
        g.fillOval(50, 110, 50, 50);
        g.setColor(green_c);
        g.fillOval(50, 170, 50, 50);

    }
}

class Test{
    public static void main(String []args){
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(640,480);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TrafficLight t = new TrafficLight();
        f.add(t);
        

    }
}