import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JScrollPane;
import java.awt.Color;


public class Tamias extends JFrame {  // NOPMD by Admin on 10/2/2013 8:45 μμ

	private JPanel contentPane;  // NOPMD by Admin on 10/2/2013 8:46 μμ
	String username;  // NOPMD by Admin on 10/2/2013 8:46 μμ
	private JTextField routeTextField;  // NOPMD by Admin on 10/2/2013 8:45 μμ
	private JTextField dayTextField;  // NOPMD by Admin on 10/2/2013 8:46 μμ
	private JTextField timeTextField;  // NOPMD by Admin on 10/2/2013 8:46 μμ

	/*  6) ---------------------getName_Method---------------------  */    
    public void getNameMethod(String username) {  // NOPMD by Admin on 10/2/2013 8:46 μμ
	this.username = username;
    }
	
	
	
	public Tamias() {  // NOPMD by Admin on 10/2/2013 8:46 μμ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");  // NOPMD by Admin on 10/2/2013 8:46 μμ
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(0, 4, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u039A\u03B1\u03BB\u03CE\u03C2 \u039F\u03C1\u03AF\u03C3\u03B1\u03C4\u03B5");  // NOPMD by Admin on 10/2/2013 8:46 μμ
		lblNewLabel.setBounds(583, 8, 118, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();  // NOPMD by Admin on 10/2/2013 8:46 μμ
		scrollPane_1.setBounds(0, 455, 763, 172);
		contentPane.add(scrollPane_1);
		
		final JTextArea announcementTextArea_1 = new JTextArea();  // NOPMD by Admin on 10/2/2013 8:45 μμ
		scrollPane_1.setViewportView(announcementTextArea_1);
		
		JScrollPane scrollPane = new JScrollPane();  // NOPMD by Admin on 10/2/2013 8:46 μμ
		scrollPane.setBounds(0, 160, 763, 234);
		contentPane.add(scrollPane);
		
		final JTextArea routeTextArea_1 = new JTextArea();
		scrollPane.setViewportView(routeTextArea_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u0391\u03BD\u03B1\u03BA\u03BF\u03B9\u03BD\u03CE\u03C3\u03B5\u03B9\u03C2");  // NOPMD by Admin on 10/2/2013 8:46 μμ
		lblNewLabel_1.setBounds(-7, 420, 771, 23);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);
		
		
		
		JLabel label = new JLabel("\u039C\u03AD\u03C1\u03B1");
		label.setBounds(9, 70, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u038F\u03C1\u03B1");
		label_1.setBounds(10, 102, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0394\u03C1\u03BF\u03BC\u03BF\u03BB\u03CC\u03B3\u03B9\u03BF"); 
		label_2.setBounds(248, 73, 72, 14);
		contentPane.add(label_2);
		
		routeTextField = new JTextField();
		routeTextField.setBounds(330, 67, 86, 20);
		contentPane.add(routeTextField);
		routeTextField.setColumns(10);
		
		dayTextField = new JTextField();
		dayTextField.setBounds(81, 71, 118, 20);
		contentPane.add(dayTextField);
		dayTextField.setColumns(10);
		
		timeTextField = new JTextField();
		timeTextField.setBounds(81, 99, 118, 20);
		contentPane.add(timeTextField);
		timeTextField.setColumns(10);
		
		final JLabel usernameLabel = new JLabel("");
		usernameLabel.setForeground(Color.RED);
		usernameLabel.setBounds(605, 29, 158, 14);
		contentPane.add(usernameLabel);
		
		final JLabel Print_Ticket_Label = new JLabel("");  // NOPMD by Admin on 10/2/2013 8:45 μμ
		Print_Ticket_Label.setForeground(Color.RED);
		Print_Ticket_Label.setBounds(248, 102, 249, 14);
		contentPane.add(Print_Ticket_Label);
		
		
		JButton btnNewButton_2 = new JButton("\u0391\u03BD\u03B1\u03BD\u03AD\u03C9\u03C3\u03B7 \u03A3\u03B5\u03BB\u03AF\u03B4\u03B1\u03C2");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {  // NOPMD by Admin on 10/2/2013 8:46 μμ
				
				// ---------------1)
				usernameLabel.setText(username);
				// ---------------2)
				announcementTextArea_1.setText("");
		        try 
		        {
		            Connection con = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql22538","sql22538","bF2*sC8!");  // NOPMD by Admin on 10/2/2013 8:45 μμ
		            PreparedStatement statement  = con.prepareStatement("select * from message"); 
		            ResultSet result = statement.executeQuery();   // NOPMD by Admin on 10/2/2013 8:45 μμ
		            result.last();
		          
		            for ( int i = 0 ; i != 10; i++){                  
		               announcementTextArea_1.append(("     ")+result.getString(2)+"\n") ;                   
		               result.previous();              
		            }
		        }catch (Exception y){
		        	y.printStackTrace();  // NOPMD by Admin on 10/2/2013 8:45 μμ
		        }       
				// ---------------3)
		        routeTextArea_1.setText("");
		        routeTextArea_1.append("Ημέρα:"+
		        ("\t")+"Κ. Λεωφ."+
		        ("\t")+"Διαδρομή"+                   
		        ("\t")+("\t")+ "Ωρα"+
		        ("\t")+"Θέσεις"+
		        ("\t")+"Κενές Θέσεις"+
		        ("\t")+"Κόστος"+
		        "\n"); 
		                
		       try {
		            Connection con_3 = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql22538","sql22538","bF2*sC8!");  // NOPMD by Admin on 10/2/2013 8:45 μμ
		            PreparedStatement statement_3  = con_3.prepareStatement("select * from Routes_Table ORDER BY `key_day` ASC");
		            ResultSet result2 = statement_3.executeQuery();   // NOPMD by Admin on 10/2/2013 8:45 μμ
		           
		            while (result2.next())
		            {
		                routeTextArea_1.append(
		                    result2.getString(3)+
		                   ("\t")+result2.getInt(1)+
		                   ("\t")+result2.getString(2)+                   
		                   ("\t")+result2.getInt(4)+
		                   ("\t")+result2.getInt(5)+
		                   ("\t")+result2.getInt(8)+
		                   ("\t")+result2.getInt(6)+
		                   "\n"); 
		           }
		            statement_3.close(); 
		       }catch (Exception y){
		    	   y.printStackTrace();  // NOPMD by Admin on 10/2/2013 8:45 μμ
		       }
		       
		       
		       
			}
				
				
				
			
		});
		btnNewButton_2.setBounds(292, 1, 174, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("\u0395\u03BA\u03C4\u03CD\u03C0\u03C9\u03C3\u03B7 \u0395\u03B9\u03C3\u03B7\u03C4\u03B9\u03C1\u03AF\u03BF\u03C5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // NOPMD by Admin on 10/2/2013 8:45 μμ
				
				String Day = dayTextField.getText();  // NOPMD by Admin on 10/2/2013 8:45 μμ
			       String Time = timeTextField.getText();
			       int time = Integer.parseInt(Time);  // NOPMD by Admin on 10/2/2013 8:45 μμ
			       String Route = routeTextField.getText();  // NOPMD by Admin on 10/2/2013 8:45 μμ
			       
			       String insert ;
			       int  Nea_thesi ;
			       
			       dayTextField.setText("");
			       timeTextField.setText("");     
			       routeTextField.setText("");   
			       
			       try 
			       {
			            Connection con_1 = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql22538","sql22538","bF2*sC8!");  // NOPMD by Admin on 10/2/2013 8:45 μμ
			            PreparedStatement statement_1  = con_1.prepareStatement("select * from Routes_Table");
			            ResultSet result = statement_1.executeQuery();  
			                             
			            while (result.next()){
			                if ( result.getString(3).equals(Day) && result.getInt(4)==time && result.getString(2).equals(Route))
			                {
			                    if ( result.getInt(8) > 1 ) {
			                        Nea_thesi = result.getInt(8) - 1 ;
			                        insert = "UPDATE Routes_Table SET KENES_THESIS="+Nea_thesi+" WHERE time="+result.getInt(4)+" and day ='"+result.getString(3)+"'  and  diadromi='"+result.getString(2)+"' " ;        
			                        statement_1.executeUpdate(insert); 
			                        Print_Ticket_Label.setText("Το Εισήτηριο Εκτυπώθηκε επιτυχως");
			                        //********************************************************************
			                        routeTextArea_1.setText("");
			        		        routeTextArea_1.append("Ημέρα:"+
			        		        ("\t")+"Κ. Λεωφ."+
			        		        ("\t")+"Διαδρομή"+                   
			        		        ("\t")+("\t")+ "Ωρα"+
			        		        ("\t")+"Θέσεις"+
			        		        ("\t")+"Κενές Θέσεις"+
			        		        ("\t")+"Κόστος"+
			        		        "\n"); 
			        		                
			        		            Connection con_3 = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql22538","sql22538","bF2*sC8!"); 
			        		            PreparedStatement statement_3  = con_3.prepareStatement("select * from Routes_Table ORDER BY `key_day` ASC");
			        		            ResultSet result2 = statement_3.executeQuery();   // NOPMD by Admin on 10/2/2013 8:45 μμ
			        		           
			        		            while (result2.next())
			        		            {
			        		                routeTextArea_1.append(
			        		                    result2.getString(3)+
			        		                   ("\t")+result2.getInt(1)+
			        		                   ("\t")+result2.getString(2)+                   
			        		                   ("\t")+result2.getInt(4)+
			        		                   ("\t")+result2.getInt(5)+
			        		                   ("\t")+result2.getInt(8)+
			        		                   ("\t")+result2.getInt(6)+
			        		                   "\n"); 
			        		           }
			        		            
			        		      
			        		     statement_1.close();
			                    }else {
			                        Print_Ticket_Label.setText("Ακυρο . Το Λεοφορίο ειναι πλήρες ");
			                    }                    
			                }else{
			                    Print_Ticket_Label.setText("Λάθος. Δεν υπάρχει τέτοιο δρομολόγιο ");
			                }
			           }
			        }catch (Exception y){
			        	y.printStackTrace();  // NOPMD by Admin on 10/2/2013 8:45 μμ
			        }    
				
				
				
			}
		});
		btnNewButton_1.setBounds(2, 40, 414, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
	}
}
