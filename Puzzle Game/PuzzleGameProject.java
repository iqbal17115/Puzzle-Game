package puzzlegameproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PuzzleGameProject extends JFrame implements ActionListener {
    
    GridLayout grid;
    Container con;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,root;
    Font font;
    PuzzleGameProject(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(100, 100, 400, 400);
        grid=new GridLayout(4,4);
        this.setLayout(grid);
        con=this.getContentPane();
        font=new Font("Arial",Font.BOLD,30);
        this.setTitle("Puzzle Game");
       
        
        b1=new JButton("J");
        b2=new JButton("M");
        b3=new JButton("N");
        b4=new JButton("B");
        b5=new JButton("F");
        b6=new JButton("O");
        b7=new JButton("");
        b8=new JButton("H");
        b9=new JButton("I");
        b10=new JButton("A");
        b11=new JButton("D");
        b12=new JButton("L");
        b13=new JButton("K");
        b14=new JButton("C");
        b15=new JButton("E");
        root=new JButton("G");
        
        b1.setBackground(Color.yellow);
        b2.setBackground(Color.yellow);
        b3.setBackground(Color.yellow);
        b4.setBackground(Color.yellow);
        b5.setBackground(Color.yellow);
        b6.setBackground(Color.yellow);
        b7.setBackground(Color.GREEN);
        b8.setBackground(Color.yellow);
        b9.setBackground(Color.yellow);
        b10.setBackground(Color.yellow);
        b11.setBackground(Color.yellow);
        b12.setBackground(Color.yellow);
        b13.setBackground(Color.yellow);
        b14.setBackground(Color.yellow);
        b15.setBackground(Color.yellow);
        root.setBackground(Color.yellow);
        
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b4.setFont(font);
        b5.setFont(font);
        b6.setFont(font);
        b7.setFont(font);
        b8.setFont(font);
        b9.setFont(font);
        b10.setFont(font);
        b11.setFont(font);
        b12.setFont(font);
        b13.setFont(font);
        b14.setFont(font);
        b15.setFont(font);
        root.setFont(font);
        
        
        con.add(b1);
        con.add(b2);
        con.add(b3);
        con.add(b4);
        con.add(b5);
        con.add(b6);
        con.add(b7);
        con.add(b8);
        con.add(b9);
        con.add(b10);
        con.add(b11);
        con.add(b12);
        con.add(b13);
        con.add(b14);
        con.add(b15);
        con.add(root);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        root.addActionListener(this);
       
    }
    public static void main(String[] args) {
        
        PuzzleGameProject game=new PuzzleGameProject();
        game.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(b1.getText().equals("A") && b2.getText().equals("B") && b3.getText().equals("C") && b4.getText().equals("D") && b5.getText().equals("E") && b6.getText().equals("F") && b7.getText().equals("G") && b8.getText().equals("H") && b9.getText().equals("I")  && b10.getText().equals("J") && b11.getText().equals("K") && b12.getText().equals("L") && b13.getText().equals("M") && b14.getText().equals("N") && b15.getText().equals("O") && root.getText().equals("")){
            root.setBackground(Color.GREEN);
            b7.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(null, "Congratulations! You won the game!");
            
        }
        if(ae.getSource()== b1){
            if(b2.getText().equals("")){
                b2.setText(""+b1.getText());
                b1.setText("");
                b1.setBackground(Color.GREEN);
                b2.setBackground(Color.YELLOW);
            }
            if(b5.getText().equals("")){
                b5.setText(""+b1.getText());
                b1.setText("");
                b1.setBackground(Color.GREEN);
                b5.setBackground(Color.YELLOW);
            }
        }
        
        if(ae.getSource()== b2){
            if(b1.getText().equals("")){
                b1.setText(""+b2.getText());
                b2.setText("");
                b2.setBackground(Color.GREEN);
                b1.setBackground(Color.YELLOW);
            }
            if(b3.getText().equals("")){
                b3.setText(""+b2.getText());
                b2.setText("");
                b2.setBackground(Color.GREEN);
                b3.setBackground(Color.YELLOW);
            }
            if(b6.getText().equals("")){
                b6.setText(""+b2.getText());
                b2.setText("");
                b2.setBackground(Color.GREEN);
                b6.setBackground(Color.YELLOW);
            }
        }
        
        if(ae.getSource()== b3){
            if(b2.getText().equals("")){
                b2.setText(""+b3.getText());
                b3.setText("");
                b3.setBackground(Color.GREEN);
                b2.setBackground(Color.YELLOW);
            }
            if(b4.getText().equals("")){
                b4.setText(""+b3.getText());
                b3.setText("");
                b3.setBackground(Color.GREEN);
                b4.setBackground(Color.YELLOW);
            }
            if(b7.getText().equals("")){
                b7.setText(""+b3.getText());
                b3.setText("");
                b3.setBackground(Color.GREEN);
                b7.setBackground(Color.YELLOW);
            }
        }
        
        if(ae.getSource()== b4){
            if(b3.getText().equals("")){
                b3.setText(""+b4.getText());
                b4.setText("");
                b4.setBackground(Color.GREEN);
                b3.setBackground(Color.YELLOW);
            }
            if(b8.getText().equals("")){
                b8.setText(""+b4.getText());
                b4.setText("");
                b4.setBackground(Color.GREEN);
                b8.setBackground(Color.YELLOW);
            }
        }
        
        if(ae.getSource()== b5){
            if(b1.getText().equals("")){
                b1.setText(""+b5.getText());
                b5.setText("");
                b5.setBackground(Color.GREEN);
                b1.setBackground(Color.YELLOW);
            }
            if(b6.getText().equals("")){
                b6.setText(""+b5.getText());
                b5.setText("");
                b5.setBackground(Color.GREEN);
                b6.setBackground(Color.YELLOW);
            }
            if(b9.getText().equals("")){
                b9.setText(""+b5.getText());
                b5.setText("");
                b5.setBackground(Color.GREEN);
                b9.setBackground(Color.YELLOW);
            }
        }
        
        if(ae.getSource()== b6){
            if(b5.getText().equals("")){
                b5.setText(""+b6.getText());
                b6.setText("");
                b6.setBackground(Color.GREEN);
                b5.setBackground(Color.YELLOW);
            }
            if(b7.getText().equals("")){
                b7.setText(""+b6.getText());
                b6.setText("");
                b6.setBackground(Color.GREEN);
                b7.setBackground(Color.YELLOW);
            }
            if(b2.getText().equals("")){
                b2.setText(""+b6.getText());
                b6.setText("");
                b6.setBackground(Color.GREEN);
                b2.setBackground(Color.YELLOW);
            }
            if(b10.getText().equals("")){
                b10.setText(""+b6.getText());
                b6.setText("");
                b6.setBackground(Color.GREEN);
                b10.setBackground(Color.YELLOW);
            }
        }
        
        if(ae.getSource()== b7){
            if(b6.getText().equals("")){
                b6.setText(""+b7.getText());
                b7.setText("");
                b7.setBackground(Color.GREEN);
                b6.setBackground(Color.YELLOW);
            }
            if(b8.getText().equals("")){
                b8.setText(""+b7.getText());
                b7.setText("");
                b7.setBackground(Color.GREEN);
                b8.setBackground(Color.YELLOW);
            }
            if(b3.getText().equals("")){
                b3.setText(""+b7.getText());
                b7.setText("");
                b7.setBackground(Color.GREEN);
                b3.setBackground(Color.YELLOW);
            }
            if(b11.getText().equals("")){
                b11.setText(""+b7.getText());
                b7.setText("");
                b7.setBackground(Color.GREEN);
                b11.setBackground(Color.YELLOW);
            }
        }
        
        if(ae.getSource()== b8){
            if(b4.getText().equals("")){
                b4.setText(""+b8.getText());
                b8.setText("");
                b8.setBackground(Color.GREEN);
                b4.setBackground(Color.YELLOW);
            }
            if(b7.getText().equals("")){
                b7.setText(""+b8.getText());
                b8.setText("");
                b8.setBackground(Color.GREEN);
                b7.setBackground(Color.YELLOW);
            }
            if(b12.getText().equals("")){
                b12.setText(""+b8.getText());
                b8.setText("");
                b8.setBackground(Color.GREEN);
                b12.setBackground(Color.YELLOW);
            }
           
        }
        if(ae.getSource()== b9){
            if(b5.getText().equals("")){
                b5.setText(""+b9.getText());
                b9.setText("");
                b9.setBackground(Color.GREEN);
                b5.setBackground(Color.YELLOW);
            }
            if(b10.getText().equals("")){
                b10.setText(""+b9.getText());
                b9.setText("");
                b9.setBackground(Color.GREEN);
                b10.setBackground(Color.YELLOW);
            }
            if(b13.getText().equals("")){
                b13.setText(""+b9.getText());
                b9.setText("");
                b9.setBackground(Color.GREEN);
                b13.setBackground(Color.YELLOW);
            }
           
        }
        
        if(ae.getSource()== b10){
            if(b9.getText().equals("")){
                b9.setText(""+b10.getText());
                b10.setText("");
                b10.setBackground(Color.GREEN);
                b9.setBackground(Color.YELLOW);
            }
            if(b11.getText().equals("")){
                b11.setText(""+b10.getText());
                b10.setText("");
                b10.setBackground(Color.GREEN);
                b11.setBackground(Color.YELLOW);
            }
            if(b6.getText().equals("")){
                b6.setText(""+b10.getText());
                b10.setText("");
                b10.setBackground(Color.GREEN);
                b6.setBackground(Color.YELLOW);
            }
            if(b14.getText().equals("")){
                b14.setText(""+b10.getText());
                b10.setText("");
                b10.setBackground(Color.GREEN);
                b14.setBackground(Color.YELLOW);
            }
           
        }
        
        if(ae.getSource()== b11){
            if(b10.getText().equals("")){
                b10.setText(""+b11.getText());
                b11.setText("");
                b11.setBackground(Color.GREEN);
                b10.setBackground(Color.YELLOW);
            }
            if(b12.getText().equals("")){
                b12.setText(""+b11.getText());
                b11.setText("");
                b11.setBackground(Color.GREEN);
                b12.setBackground(Color.YELLOW);
            }
            if(b7.getText().equals("")){
                b7.setText(""+b11.getText());
                b11.setText("");
                b11.setBackground(Color.GREEN);
                b7.setBackground(Color.YELLOW);
            }
            if(b15.getText().equals("")){
                b15.setText(""+b11.getText());
                b11.setText("");
                b11.setBackground(Color.GREEN);
                b15.setBackground(Color.YELLOW);
            }
           
        }
        
        if(ae.getSource()== b12){
            if(b8.getText().equals("")){
                b8.setText(""+b12.getText());
                b12.setText("");
                b12.setBackground(Color.GREEN);
                b8.setBackground(Color.YELLOW);
            }
            if(b11.getText().equals("")){
                b11.setText(""+b12.getText());
                b12.setText("");
                b12.setBackground(Color.GREEN);
                b11.setBackground(Color.YELLOW);
            }
            if(root.getText().equals("")){
                root.setText(""+b12.getText());
                b12.setText("");
                b12.setBackground(Color.GREEN);
                root.setBackground(Color.YELLOW);
            }
        }
        if(ae.getSource()== b13){
            if(b9.getText().equals("")){
                b9.setText(""+b13.getText());
                b13.setText("");
                b13.setBackground(Color.GREEN);
                b9.setBackground(Color.YELLOW);
            }
            if(b14.getText().equals("")){
                b14.setText(""+b13.getText());
                b13.setText("");
                b13.setBackground(Color.GREEN);
                b14.setBackground(Color.YELLOW);
            }
           
        }
        if(ae.getSource()== b14){
            if(b13.getText().equals("")){
                b13.setText(""+b14.getText());
                b14.setText("");
                b14.setBackground(Color.GREEN);
                b13.setBackground(Color.YELLOW);
            }
            if(b15.getText().equals("")){
                b15.setText(""+b14.getText());
                b14.setText("");
                b14.setBackground(Color.GREEN);
                b15.setBackground(Color.YELLOW);
            }
            if(b10.getText().equals("")){
                b10.setText(""+b14.getText());
                b14.setText("");
                b14.setBackground(Color.GREEN);
                b10.setBackground(Color.YELLOW);
            }
           
        }
        
        
        
        if(ae.getSource()== b15){
            if(b14.getText().equals("")){
                b14.setText(""+b15.getText());
                b15.setText("");
                b15.setBackground(Color.GREEN);
                b14.setBackground(Color.YELLOW);
            }
            if(root.getText().equals("")){
                root.setText(""+b15.getText());
                b15.setText("");
                b15.setBackground(Color.GREEN);
                root.setBackground(Color.YELLOW);
            }
            if(b11.getText().equals("")){
                b11.setText(""+b15.getText());
                b15.setText("");
                b15.setBackground(Color.GREEN);
                b11.setBackground(Color.YELLOW);
            }
           
        }
        
        if(ae.getSource()== root){
            if(b15.getText().equals("")){
                b15.setText(""+root.getText());
                root.setText("");
                root.setBackground(Color.GREEN);
                b15.setBackground(Color.YELLOW);
            }
            if(b12.getText().equals("")){
                b12.setText(""+b15.getText());
                b15.setText("");
                b15.setBackground(Color.GREEN);
                b12.setBackground(Color.YELLOW);
            }
           
        }
    }
    
}
