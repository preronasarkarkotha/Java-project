import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;


public class StudentDetails extends JFrame implements MouseListener, ActionListener
{	
	JPanel panel;
    ImageIcon icon;
    JLabel label1;
    Font f1, f2, f3;
    JScrollPane scroll;
    JTable table;
    DefaultTableModel model;
    JButton btn1, btn2, btn3, btn4, btn5, nBtn;
    Cursor cursor;
    FrameTwo ft;

    String[] column = { "Student Name", "Phone Number","ID", "Father's Name", "Phone Number","Mother's Name","Phone Number","Address","University name","Email","Room","Payment"};
    String[] rows = new String[10];

	public StudentDetails()
	{
		super("Student Details");
		this.setSize(800,600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.ft= ft;
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.decode("#FFFFFF"));
		icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        sdlabel = new JLabel();
        sdlabel.setText("User Data");
        sdlabel.setBounds(200, 10, 400, 80);
        sdlabel.setFont(f1);
        panel.add(sdlabel);

        







	}
}