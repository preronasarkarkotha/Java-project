import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class FrameOne extends JFrame implements MouseListener, ActionListener
{
	ImageIcon img,img1,icon;
	JLabel userLabel, passLabel,imgLabel,imgLabel1, success;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginBtn, exitBtn;
	JPanel panel;
	Color myColor;
	Font myFont;
	Welcome w;
	Cursor cursor;


	public FrameOne()
	{
		super(" Friends Hostel-Login Page");
		this.setSize(800,470);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.decode("#F2F2F2"));
		
		icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

		//myColor = new Color(31,190,214);
		myFont = new Font("Cambria", Font.BOLD, 20);
		
		
		
		userLabel = new JLabel("Username");
		userLabel.setBounds(590,150, 110, 20);
		userLabel.setFont(myFont);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(590,170, 160, 30);
		userTF.setBackground(Color.WHITE);
		panel.add(userTF);
		
		passLabel = new JLabel("Password");
		passLabel.setBounds(590, 220, 110, 20);
		passLabel.setFont(myFont);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(590, 240, 160, 30);
		passPF.setBackground(Color.WHITE);
		passPF.setEchoChar('*');
		panel.add(passPF);

		 // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(590,330,140, 30);
		loginBtn.setBackground(new Color(62,154,148));
		loginBtn.setOpaque(true);
		loginBtn.setForeground(Color.WHITE);
		loginBtn.addMouseListener(this);
		loginBtn.setCursor(cursor);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(590,370,140, 30);
		exitBtn.setBackground(new Color(162,26,22));
		exitBtn.setOpaque(true);
		exitBtn.setForeground(Color.WHITE);
		exitBtn.addMouseListener(this);
		exitBtn.setCursor(cursor);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		success = new JLabel("");
		success.setBounds(590,282,160,35);
		panel.add(success);
		
		img= new ImageIcon(getClass().getResource("/images/fo.jpg"));
		imgLabel= new JLabel(img);
		imgLabel.setBounds(0,0,612,470);
		panel.add(imgLabel);

		img1= new ImageIcon(getClass().getResource("/images/a.jpg"));
		imgLabel1= new JLabel(img1);
		imgLabel1.setBounds(611,0,188,470);
		panel.add(imgLabel1);

		this.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(new Color(62,154,148));
			loginBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(new Color(162,26,22));
			exitBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(new Color(62,154,148));
			loginBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(new Color(162,26,22));
			exitBtn.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(loginBtn.getText().equals(command))
		{

		String s1 = userTF.getText();
		String s2 = passPF.getText();
		
		if((s1.equals("trap_4")) ||(s1.equals("friends_hostel")) && s2.equals("admin123@"))
		{	
			
			success.setText("Successfully Logged In");
			showMessageDialog(null, "valid Username and password!");
			JOptionPane.showMessageDialog(this, "Welcome To Friends Hostel");
			
			FrameTwo ft= new FrameTwo();
			ft.setVisible(true);
			this.setVisible(false);
		}
		else
			{
				showMessageDialog(null, "Invalid Username or password!");
			}
		}
		else if(exitBtn.getText().equals(command))
		{
			System.exit(0);
		}

	}
}
