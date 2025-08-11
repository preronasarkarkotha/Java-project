import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Welcome extends JFrame {

    private Container c;
    private ImageIcon img,img2, icon, logo, welcome;
    private JLabel imgLabel,imgLabel1,imgLabel2;
    private Font f1,f2,f3;
    private JButton btn1, btn2,btn3,nBtn;
    private Cursor cursor;
    
    Welcome() {
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Friends Hostel");
        this.setSize(900, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE); 
 
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        img= new ImageIcon(getClass().getResource("/images/welcome.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(50,25,350,285);
        c.add(imgLabel);

        imgLabel1 = new JLabel("To");
        imgLabel1.setBounds(435,130,100,30);
        c.add(imgLabel1);
		
		img2= new ImageIcon(getClass().getResource("/images/fh.jpg"));
		imgLabel2 = new JLabel(img2);
        imgLabel2.setBounds(500,20,350,285);
        c.add(imgLabel2);
		
		/*imgLabel3 = new JLabel(" Hostel");
        imgLabel3.setBounds(470,200,300,20);
        c.add(imgLabel3);*/
		

     
        f1 = new Font("Times New Roman", Font.BOLD, 40);
        f3 = new Font("Times New Roman", Font.BOLD, 50);
		f2 = new Font("Times New Roman", Font.PLAIN, 25);
		
		
		imgLabel1.setFont(f1);
		
		
		c.add(imgLabel);
		
		c.add(imgLabel2);
		//c.add(imgLabel3);

       
        cursor = new Cursor(Cursor.HAND_CURSOR);

       
        btn1 = new JButton("Next >> >>");
        btn1.setBounds(620, 325, 180, 50);//605,325,200,50
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(new Color(62,154,148));
        c.add(btn1);

        

        btn2 = new JButton("Exit");
        btn2.setBounds(80, 325, 180, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(new Color(162,26,22));
        c.add(btn2);
        
        btn3 = new JButton("Contribution");
        btn3.setBounds(350, 325, 180, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(new Color(62,154,148));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);
		
		
		 btn1.addActionListener(
		new ActionListener()
		{
            public void actionPerformed(ActionEvent ae) 
			{

                setVisible(false);
                FrameOne fo = new FrameOne();
                fo.setVisible(true);
            }
        });



        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Contribution co = new Contribution();
                co.setVisible(true);

            }
        });

       
       
    }

    public static void main(String[] args) {

        Welcome frame = new Welcome();
        frame.setVisible(true);
		
    }
}

