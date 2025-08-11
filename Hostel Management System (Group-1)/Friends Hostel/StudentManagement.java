import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class StudentManagement extends JFrame implements ActionListener
{
	ImageIcon img,icon;
	JLabel titleLabel,titleLabel1,fnLabel,lnLabel,phnLabel,rmLabel,unLabel,pLabel,imgLabel;
	JTextField fnTf,lnTf,phnTf,rmTf,unTf, payTf;
	JButton addBtn,updateBtn,deleteBtn,clearBtn,backBtn,exitBtn;
	JPanel panel;
	JComboBox combo1,combo2,combo3;
	Color myColor;
	Font myFont,myFont1;
	JTable table;
	JScrollPane scroll;
	DefaultTableModel model;
	FrameTwo ft;
	Cursor cursor;
	String[] columns = {"First name","Last name","Phone Number","Room","University Name","Payment"};
	String[] rows = new String[10];
	

public StudentManagement()
	{
		super("Friends Hostel-Student Management");
		this.setSize(800,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.ft= ft;
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        myFont = new Font("Cambria", Font.BOLD, 20);
		myFont1 = new Font("Cambria", Font.BOLD, 15);
		
		
		titleLabel = new JLabel("Student Form");
		titleLabel.setBounds(300,6,250,50);
		titleLabel.setFont(myFont);
		panel.add(titleLabel);

		titleLabel1 = new JLabel("Student Details");
		titleLabel1.setBounds(300,230,250,50);
		titleLabel1.setFont(myFont);
		panel.add(titleLabel1);
		
		fnLabel = new JLabel("First Name :");
		fnLabel.setBounds(40,50,100,30);
		fnLabel.setFont(myFont1);
		panel.add(fnLabel);

		lnLabel = new JLabel("Last Name :");
		lnLabel.setBounds(40,100,100,30);
		lnLabel.setFont(myFont1);
		panel.add(lnLabel);
		
		phnLabel = new JLabel("Phone Number :");
		phnLabel.setBounds(40,150, 130,30);
		phnLabel.setFont(myFont1);
		panel.add(phnLabel);

		rmLabel = new JLabel("Room No :");
		rmLabel.setBounds(40,200,100,30);
		rmLabel.setFont(myFont1);
		panel.add(rmLabel);

		unLabel= new JLabel("University Name :");
		unLabel.setBounds(430,50,130,30);
		unLabel.setFont(myFont1);
		panel.add(unLabel);

		pLabel = new JLabel("Payment :");
		pLabel.setBounds(430,100,100,30);
		pLabel.setFont(myFont1);
		panel.add(pLabel);
		
		fnTf = new JTextField();
		fnTf.setBounds(170,52,150,30);
		fnTf.setFont(myFont1);
		panel.add(fnTf);
		
		lnTf = new JTextField();
		lnTf.setBounds(170,102,150,30);
		lnTf.setFont(myFont1);
		panel.add(lnTf);
		
		phnTf = new JTextField();
		phnTf.setBounds(170,152,150,30);
		phnTf.setFont(myFont1);
		panel.add(phnTf);

		rmTf = new JTextField();
		rmTf.setBounds(170,200,120,30);
		rmTf.setFont(myFont1);
		panel.add(rmTf);

		unTf= new JTextField();
		unTf.setBounds(580,52,120,30);
		unTf.setFont(myFont);
		panel.add(unTf);

		payTf= new JTextField();
		payTf.setBounds(580,102,120,30);
		payTf.setFont(myFont);
		panel.add(payTf);

		/*String items[] = {"AC","NON-AC"};
		combo1 = new JComboBox(items);
		combo1.setBounds(170,200,120,30);
		panel.add(combo1);

		String items1[] = {"AIUB","IUB","NSU","UIU","BRAC","U-LAB"};
		combo2 = new JComboBox(items1);
		combo2.setBounds(580,52,120,30);
		panel.add(combo2);
		
		String items2[]= {"AC-7000","NON_AC-3500"};
		combo3 =new JComboBox(items2);
		combo3.setBounds(580,102,120,30);
		panel.add(combo3);*/

		cursor = new Cursor(Cursor.HAND_CURSOR);

        addBtn = new JButton("Add");
		addBtn.setBounds(600,150,100,30);
		addBtn.setForeground(Color.WHITE);
		addBtn.setBackground(new Color(62,154,148));
		addBtn.setFont(myFont1);
		panel.add(addBtn);

		updateBtn = new JButton("Update");
		updateBtn.setBounds(340,600,100,30);
		updateBtn.setForeground(Color.WHITE);
		updateBtn.setBackground(new Color(62,154,148));
		updateBtn.setFont(myFont1);
		panel.add(updateBtn);
        
		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(470,600,100,30);
		deleteBtn.setForeground(Color.WHITE);
		deleteBtn.setBackground(new Color(62,154,148));
		deleteBtn.setFont(myFont1);
		panel.add(deleteBtn);

		
		clearBtn = new JButton("Clear");
		clearBtn.setBounds(600,200,100,30);
		clearBtn.setForeground(Color.WHITE);
		clearBtn.setBackground(new Color(62,154,148));
		clearBtn.setFont(myFont1);
		panel.add(clearBtn);

		backBtn = new JButton("Back");
		backBtn.setBounds(70,600,80,30);
		backBtn.setCursor(cursor);
		backBtn.setBackground(new Color(62,154,148));
		backBtn.setForeground(Color.WHITE);
		//backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);

		exitBtn = new JButton("Exit");
		exitBtn.setBounds(630,600,80,30);
		exitBtn.setCursor(cursor);
		exitBtn.setBackground(new Color(162,26,22));
		exitBtn.setForeground(Color.WHITE);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
	
		table = new JTable();
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setFont(myFont1);
		table.setBackground(Color.WHITE);
		table.setRowHeight(40);
		
		
		scroll = new JScrollPane(table);
        scroll.setBounds(20,300,740,265);		
        panel.add(scroll);

        addBtn.addActionListener(this);
        clearBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		
		
		table.addMouseListener(new MouseAdapter()
		{
			
			public void mouseClicked(MouseEvent me)
			{   
			
			    int numOfRow = table.getSelectedRow();
				String f_name = model.getValueAt(numOfRow,0).toString();
				String l_name = model.getValueAt(numOfRow,1).toString();
				String phn_no = model.getValueAt(numOfRow,2).toString();
				String rm_no = model.getValueAt(numOfRow,3).toString();
				String un_name= model.getValueAt(numOfRow,4).toString();
				String payment = model.getValueAt(numOfRow,5).toString();
				
				fnTf.setText(f_name );
			    lnTf.setText(l_name);
			    phnTf.setText(phn_no);
				rmTf.setText(rm_no);
				unTf.setText(un_name);
				payTf.setText(payment);
				
			
			}
		});
		
		img= new ImageIcon(getClass().getResource("/images/sm.jpg"));
		imgLabel= new JLabel(img);
		imgLabel.setBounds(200,50,350,285);
		panel.add(imgLabel);
		
         this.add(panel);
		 
		 
	}
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==backBtn)
		{
			FrameTwo ft = new FrameTwo();
			ft.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==addBtn)
		{
			rows[0] = fnTf.getText();
			rows[1] = lnTf.getText();
			rows[2] = phnTf.getText();
			rows[3] = rmTf.getText();
			rows[4] = unTf.getText();
			rows[5] = payTf.getText();
			model.addRow(rows);
			
		}
		
		else if (ae.getSource()==clearBtn)
		{
			fnTf.setText("");
			lnTf.setText("");
			phnTf.setText("");
			rmTf.setText("");
			unTf.setText("");
			payTf.setText("");
			
		}
		
		else if (ae.getSource()==deleteBtn)
		{
			int numOfRow = table.getSelectedRow();
			
			
			if(numOfRow>=0)
			{
				model.removeRow(numOfRow);
				
			}
			
			else
			{
				
            JOptionPane.showMessageDialog(null,"No row has been selected ");			
			
			}	
			
		}
		
       	else if (ae.getSource()==updateBtn)
	  	 {
		  int numOfRow = table.getSelectedRow(); 
		  
		  String f_name = fnTf.getText();
	      String l_name = lnTf.getText();
		  String phn_no = phnTf.getText();
		  String rm_no = rmTf.getText();
		  String un_name= unTf.getText();
		  String payment = payTf.getText();
		  
		  model.setValueAt(f_name,numOfRow,0);
		  model.setValueAt(l_name,numOfRow,1);
	      model.setValueAt(phn_no,numOfRow,2);
	      model.setValueAt(rm_no,numOfRow,3);
	      model.setValueAt(un_name,numOfRow,4);
	      model.setValueAt(payment,numOfRow,5);
		}
		else if (ae.getSource()==exitBtn)
		{
			System.exit(0);
		}
	}


     public static void main(String[] args) 
	   {

        	StudentManagement sm = new StudentManagement();
       	 	sm.setVisible(true);
		}
}	
