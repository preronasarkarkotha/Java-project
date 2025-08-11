import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Contribution extends JFrame {

    private Container c;
    private ImageIcon icon,icon1,icon2;
    private JLabel label,label1,label2,label3,label4;
    private Font f1,f2,f3;
    private JButton btn1, btn2, nBtn;
    private Cursor cursor;

    Contribution() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Friends Hostel");
        this.setSize(740, 900);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage()); 

 
        label = new JLabel("Contribution");
        label.setBounds(230, 55, 500, 65);
        c.add(label);
		
			
		label1 = new JLabel("OBJECT ORIENTED PROGRAMMING 1");
        label1.setBounds(150, 100, 500, 65);
        c.add(label1);
		
        label2 = new JLabel("(Final Project)");
        label2.setBounds(300, 140, 500, 65);
        c.add(label2);
		
      
        f1 = new Font("Times New Roman", Font.BOLD, 50);
        f2 = new Font("Times New Roman", Font.BOLD, 25); 
		f3 = new Font("Times New Roman", Font.PLAIN, 25);

        label.setFont(f1);
		c.add(label);
		
		label1.setFont(f2);
		c.add(label1);
		
		label2.setFont(f3);
		c.add(label2);
		
		
		
		
		icon1 = new ImageIcon("bb.png");
		label3 = new JLabel("TANZIM AHMED RUPOK  (22-46709-1)",icon1,JLabel.LEFT);
		label3.setBounds(150,280,500,220);
		c.add(label3);
		
		
		icon2 = new ImageIcon("gg.png");
		label4 = new JLabel("PRERONA SARKAR  (22-46383-1)",icon2,JLabel.LEFT);
		label4.setBounds(150,480,500,220);
		c.add(label4);
		
		
		
       
        cursor = new Cursor(Cursor.HAND_CURSOR);

        
        btn1 = new JButton("OK");
        btn1.setBounds(275, 780, 180, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        c.add(btn1);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

       
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {

        Contribution frame = new Contribution();
        frame.setVisible(true);
    }
}
