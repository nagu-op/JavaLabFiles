import javax.swing.*;
import java.awt.event.*;

class Calcnew implements ActionListener{
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bsub,bdiv,bmul,badd,bdec,beq,bclr;
    static double a = 0, b = 0, result = 0;
    static int oparator = 0;
    Calcnew(){
        f= new JFrame("Calculator");
        t= new JTextField();
        b1 = new JButton("1");
        b0 = new JButton("0");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4= new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        badd = new JButton("+");
        bmul = new JButton("*");
        bdec=new JButton(".");
        bsub = new JButton("-");

        bdiv = new JButton("/");
        bclr = new JButton("clr");
        beq = new JButton("=");

        t.setBounds(30,40,280,30);

        b7.setBounds(40,100,50,40);
        b8.setBounds(110, 100, 50 , 40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);


        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);

        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        bclr.setBounds(100,380,100,40);

        f.add(t);
        f.add(b0);
        f.add(b9);
        f.add(b8);
        f.add(b7);
        f.add(b6);
        f.add(b5);
        f.add(b4);
        f.add(b3);
        f.add(b2);
        f.add(b1);
        f.add(bmul);
        f.add(bsub);
        f.add(badd);
        f.add(bdiv);
        f.add(bclr);
        f.add(beq);
        f.add(bdec);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bclr.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bclr.addActionListener(this);
        beq.addActionListener(this);
        bdec.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b1){
            t.setText(t.getText()+"1");

        }

        if (e.getSource()==b2){
            t.setText(t.getText()+"2");

        }
        if (e.getSource()==b3){
            t.setText(t.getText()+"3");

        }
        if (e.getSource()==b4){
            t.setText(t.getText()+"4");

        }
        if (e.getSource()==b5){
            t.setText(t.getText()+"5");

        }

        if (e.getSource()==b6){
            t.setText(t.getText()+"6");

        }
        if (e.getSource()==b7){
            t.setText(t.getText()+"7");

        }

        if (e.getSource()==b8){
            t.setText(t.getText()+"8");

        }

        if (e.getSource()==b9){
            t.setText(t.getText()+"9");

        }

        if (e.getSource()==b0){
            t.setText(t.getText()+"0");

        }
        if (e.getSource()==bdec){
            t.setText(t.getText()+".");

        }
        if(e.getSource() == badd){
            a = Double.parseDouble(t.getText());
            oparator = 1;
            t.setText("");
        }
        if(e.getSource() == bsub){
             a = Double.parseDouble(t.getText());
             oparator = 2;
             t.setText("");
        }
        if (e.getSource() == bmul){
            a = Double.parseDouble(t.getText());
            oparator = 3;
            t.setText("");
        }
        if(e.getSource() == bdiv){
            a = Double.parseDouble(t.getText());
            oparator = 4;
            t.setText("");
        }
        if(e.getSource() == beq){
            b = Double.parseDouble(t.getText());
            switch(oparator){
                case 1: result = a+b;
                break;
                case 2: result = a-b;
                break;
                case 3: result = a*b;
                break;
                case 4: result = a/b;
                break; 
                default: result = 0;
            }
            t.setText("" + result);
            
        }
        if(e.getSource() == bclr){
            t.setText("");
        }
    }
    public static void main(String [] args  ){
        new Calcnew();

    }
}

