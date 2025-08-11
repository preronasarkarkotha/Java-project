import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameTwo extends JFrame implements MouseListener, ActionListener
{	
	ImageIcon img,icon;
	JLabel label,imgLabel;
	JButton backBtn,smBtn,stmBtn,exitBtn;
	JPanel panel;
	JComboBox combo;
	FrameOne fo;
	Cursor cursor;

	public FrameTwo()
	{
		super("Home Page");
		this.setSize(800,470);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.fo= fo;
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);

		icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());


		/*label = new JLabel("Selected Things: "+s1+" , "+s2);
		label.setBounds(40,40,300,30);
		label.setBackground(Color.CYAN);
		label.setOpaque(true);
		panel.add(label);*/

		

		/*String items[] = {"Student Management", "Stuff Management", "Student Details", "Stuff Details"};
		combo = new JComboBox(items);
		combo.setBounds(180, 90, 200, 30);
		panel.add(combo);*/

		// Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

		backBtn = new JButton("Back");
		backBtn.setBounds(500,360,80, 30);
		backBtn.setCursor(cursor);
		backBtn.setForeground(Color.WHITE);
		backBtn.setBackground(new Color(62,154,148));
		backBtn.addActionListener(this);
		panel.add(backBtn);

		smBtn = new JButton("Student Management");
		smBtn.setBounds(530,100,160,30);
		smBtn.setCursor(cursor);
		smBtn.setForeground(Color.WHITE);
		smBtn.setBackground(new Color(62,154,148));
		smBtn.addMouseListener(this);
		smBtn.addActionListener(this);
		panel.add(smBtn);

		stmBtn = new JButton("Stuff Management");
		stmBtn.setBounds(530,150,160,30);
		stmBtn.setCursor(cursor);
		stmBtn.setForeground(Color.WHITE);
		stmBtn.setBackground(new Color(62,154,148));
		stmBtn.addMouseListener(this);
		stmBtn.addActionListener(this);
		panel.add(stmBtn);

		/*sdBtn = new JButton("Student Details");
		sdBtn.setBounds(530,200,140,30);
		sdBtn.setCursor(cursor);
		sdBtn.setForeground(Color.WHITE);
		sdBtn.setBackground(new Color(62,154,148));
		sdBtn.addMouseListener(this);
		sdBtn.addActionListener(this);
		panel.add(sdBtn);

		stdBtn = new JButton("Stuff Details");
		stdBtn.setBounds(530,250,140,30);
		stdBtn.setCursor(cursor);
		stdBtn.setForeground(Color.WHITE);
		stdBtn.setBackground(new Color(62,154,148));
		stdBtn.addMouseListener(this);
		stdBtn.addActionListener(this);
		panel.add(stdBtn);*/

		exitBtn = new JButton("Exit");
		exitBtn.setBounds(610,360, 80, 30);
		exitBtn.setCursor(cursor);
		exitBtn.setForeground(Color.WHITE);
		exitBtn.setBackground(new Color(162,26,22));
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);

		img= new ImageIcon(getClass().getResource("/images/home.jpg"));
		imgLabel= new JLabel(img);
		imgLabel.setBounds(80,40,350,285);
		panel.add(imgLabel);

		
		this.add(panel);
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(backBtn.getText().equals(command))
		{
			FrameOne fo = new FrameOne();
			fo.setVisible(true);
			this.setVisible(false);
		}
		else if (smBtn.getText().equals(command))
		{	
			//String s3 = combo.getSelectedItem().toString();
			StudentManagement sm= new StudentManagement();
			sm.setVisible(true);
			this.setVisible(false);
		}
		else if (stmBtn.getText().equals(command))
		{
			StuffManagement sm1 = new StuffManagement();
			sm1.setVisible(true);
			this.setVisible(false);
		}
		else if(exitBtn.getText().equals(command))
		{
			System.exit(0);
		}
		else
		{

		}
	}

	public static void main(String args[])
	{
		
		
		Welcome w = new Welcome();
		w.setVisible(true);
	}
}