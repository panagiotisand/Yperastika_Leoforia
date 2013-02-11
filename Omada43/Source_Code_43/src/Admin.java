/*
 * login : http://www.phpmyadmin.co/index.php
    To connect to database use :
    Host: sql2.freesqldatabase.com
    Database user: sql22538
    Database password: bF2*sC8!

 
*/

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.sql.*;
import javax.swing.JScrollPane;


public class Admin extends JFrame {  // NOPMD by Admin on 10/2/2013 8:42 μμ
		
	private JPanel contentPane; 
	 String username;  // NOPMD by Admin on 10/2/2013 8:42 μμ
	 int routeCounter=0;   										//counter gia dimiourgia neon diadromwn  // NOPMD by Admin on 10/2/2013 8:42 μμ
	 int announcementCounter = 0;     							//counter gia dimiourgia newon anakoinwsewn  // NOPMD by Admin on 10/2/2013 8:42 μμ
	 Route[] routetArray = new Route[100];     					//pinakas gia dimiourgia diadromwn 
	 Announcement[] announcementArray = new Announcement[100]; 	//pinakas dia dimiourgia anakoinosewn  // NOPMD by Admin on 10/2/2013 8:42 μμ
	 private JTextField nameTextField; 
	 private JTextField dayTextField; 
	 private JTextField timeTextField; 
	 private JTextField routeTextField; 
	 private JTextField codeDayTextField;
	 private JTextField costTextField; 
	 private JTextField thesisTextField;
	 private JTextField sendAnnouncementTextField;  // NOPMD by Admin on 10/2/2013 8:43 μμ
	 //static JTextArea Announcement_TextArea;
/* ********************************************************************************************************* */		
/* ********************************************************************************************************* */		 
	 
	 /*  1) ---------------------getName_Method---------------------  */
	   public void getNameMethod(String username) { 
			this.username = username;
		}
  
   
/* ######################################################################################################### */		
/* ######################################################################################################### */			
/* ######################################################################################################### */		
/* ######################################################################################################### */	
	  
	public Admin() { 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

/* ######################################################################################################### */		
/* ######################################################################################################### */			
/* ######################################################################################################### */		
/* ######################################################################################################### */
			
				JLabel label = new JLabel("\u039A\u03B1\u03BB\u03CE\u03C2 \u039F\u03C1\u03AF\u03C3\u03B1\u03C4\u03B5"); 
				label.setBounds(609, 4, 89, 14);
				contentPane.add(label);
				
				JLabel lblNewLabel = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1"); 
				lblNewLabel.setBounds(0, 89, 46, 14);
				contentPane.add(lblNewLabel);
				
				JSeparator separator = new JSeparator(); 
				separator.setBounds(113, 34, 247, -3);
				contentPane.add(separator);
				
				JLabel label_1 = new JLabel("\u03A9\u03C1\u03B1"); 
				label_1.setBounds(0, 142, 46, 14);
				contentPane.add(label_1);
				
				JLabel label_2 = new JLabel("\u0398\u03AD\u03C3\u03B5\u03B9\u03C2"); 
				label_2.setBounds(441, 89, 46, 14);
				contentPane.add(label_2);
				
				JLabel label_3 = new JLabel("\u039C\u03AD\u03C1\u03B1"); 
				label_3.setBounds(0, 117, 46, 14);
				contentPane.add(label_3);
				
				JLabel label_4 = new JLabel("\u0394\u03B9\u03B1\u03B4\u03C1\u03BF\u03BC\u03AE");
				label_4.setBounds(202, 89, 72, 14);
				contentPane.add(label_4);
				
				JLabel label_5 = new JLabel("\u03A4\u03B9\u03AE \u0395\u03B9\u03C3\u03B9\u03C4\u03B7\u03C1\u03AF\u03BF\u03C5");
				label_5.setBounds(202, 142, 89, 14);
				contentPane.add(label_5);
				
				JLabel label_6 = new JLabel("\u039C\u03AD\u03C1\u03B1 \u039A\u03C9\u03B4\u03B9\u03BA\u03CC\u03C2");
				label_6.setBounds(202, 117, 89, 14);
				contentPane.add(label_6);
				
				nameTextField = new JTextField();
				nameTextField.setBounds(56, 86, 110, 20);
				contentPane.add(nameTextField);
				nameTextField.setColumns(10);
				
				dayTextField = new JTextField();
				dayTextField.setBounds(56, 114, 110, 20);
				contentPane.add(dayTextField);
				dayTextField.setColumns(10);
				
				timeTextField = new JTextField();
				timeTextField.setBounds(56, 139, 110, 20);
				contentPane.add(timeTextField);
				timeTextField.setColumns(10);
				
				routeTextField = new JTextField();
				routeTextField.setBounds(306, 86, 121, 20);
				contentPane.add(routeTextField);
				routeTextField.setColumns(10);
				
				codeDayTextField = new JTextField();
				codeDayTextField.setBounds(306, 114, 121, 20);
				contentPane.add(codeDayTextField);
				codeDayTextField.setColumns(10);
				
				costTextField = new JTextField();
				costTextField.setBounds(306, 139, 121, 20);
				contentPane.add(costTextField);
				costTextField.setColumns(10);
				
				thesisTextField = new JTextField();
				thesisTextField.setBounds(497, 86, 86, 20);
				contentPane.add(thesisTextField);
				thesisTextField.setColumns(10);
				
				JLabel lblNewLabel1 = new JLabel("\u0394\u03B9\u03B1\u03B4\u03C1\u03BF\u03BC\u03AD\u03C2 ");
				lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel1.setBounds(0, 183, 726, 23);
				contentPane.add(lblNewLabel1);
				
				sendAnnouncementTextField = new JTextField();
				sendAnnouncementTextField.setBounds(0, 468, 726, 24);
				contentPane.add(sendAnnouncementTextField);
				sendAnnouncementTextField.setColumns(10);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(0, 217, 726, 201);
				contentPane.add(scrollPane_1);
				
				final JTextArea routeTextArea1 = new JTextArea();
				scrollPane_1.setViewportView(routeTextArea1);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 503, 726, 153);
				contentPane.add(scrollPane);
				
				final JTextArea announcementTextArea1 = new JTextArea();  // NOPMD by Admin on 10/2/2013 8:42 μμ
				scrollPane.setViewportView(announcementTextArea1);
		
				
				final JLabel usernameLable = new JLabel("");
				usernameLable.setForeground(Color.RED);
				usernameLable.setBounds(608, 29, 118, 14);
				contentPane.add(usernameLable);
				
/* ######################################################################################################### */		
/* ######################################################################################################### */			
/* ######################################################################################################### */		
/* ######################################################################################################### */		
		
/*  1) ---------------------refresh_Button---------------------  */
		JButton refreshButton = new JButton("\u0391\u03BD\u03B1\u03BD\u03AD\u03C9\u03C3\u03B7 \u03A3\u03B5\u03BB\u03AF\u03B4\u03B1\u03C2");
		refreshButton.setBounds(247, 0, 201, 23);
		refreshButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {  // NOPMD by Admin on 10/2/2013 8:43 μμ
				// ---------------1)
				usernameLable.setText(username);
				// ---------------2)
				announcementTextArea1.setText("");
		        try 
		        {
		            Connection con = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql22538","sql22538","bF2*sC8!");  // NOPMD by Admin on 10/2/2013 8:42 μμ
		            PreparedStatement statement  = con.prepareStatement("select * from message");
		            ResultSet result = statement.executeQuery();   // NOPMD by Admin on 10/2/2013 8:43 μμ
		            result.last();
		          
		            for ( int i = 0 ; i != 10; i++){                  
		               announcementTextArea1.append(("     ")+result.getString(2)+"\n") ;                   
		               result.previous();              
		            }
		        }catch (Exception y){
		        	y.printStackTrace();  // NOPMD by Admin on 10/2/2013 8:43 μμ
		        }       
				// ---------------3)
		        routeTextArea1.setText("");
		        routeTextArea1.append("Ημέρα:"+
		        ("\t")+"Κ. Λεωφ."+
		        ("\t")+"Διαδρομή"+                   
		        ("\t")+("\t")+ "Ωρα"+
		        ("\t")+"Θέσεις"+
		        ("\t")+"Κενές Θέσεις"+
		        ("\t")+"Κόστος"+
		        "\n"); 
		                
		       try {
		            Connection con_3 = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql22538","sql22538","bF2*sC8!");  // NOPMD by Admin on 10/2/2013 8:43 μμ
		            PreparedStatement statement_3  = con_3.prepareStatement("select * from Routes_Table ORDER BY `key_day` ASC");
		            ResultSet result2 = statement_3.executeQuery();  
		           
		            while (result2.next())
		            {
		                routeTextArea1.append(
		                    result2.getString(3)+
		                   ("\t")+result2.getInt(1)+
		                   ("\t")+result2.getString(2)+                   
		                   ("\t")+result2.getInt(4)+
		                   ("\t")+result2.getInt(5)+
		                   ("\t")+result2.getInt(8)+
		                   ("\t")+result2.getInt(6)+
		                   "\n"); 
		           }
		       }catch (Exception y){
		    	   y.printStackTrace();  // NOPMD by Admin on 10/2/2013 8:43 μμ
		       }
		       
		       
		       
			}
		});
		contentPane.add(refreshButton);
		
		
		    
/* ********************************************************************************************************* */		
/* ********************************************************************************************************* */			 
		
		/*  1) ---------------------Exit_Button---------------------  */
		JButton button = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		button.setBounds(0, 0, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // NOPMD by Admin on 10/2/2013 8:43 μμ
				  dispose();
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(button);
		
/* ********************************************************************************************************* */		
/* ********************************************************************************************************* */	
				
		/*  1) ---------------------Send_Announcement_Button---------------------  */
		JButton Send_Announcement_Button = new JButton("\u0393\u03C1\u03B1\u03C8\u03B5 \u039C\u03B9\u03B1 \u039D\u03B5\u03B1 \u0391\u03BD\u03B1\u03BA\u03BF\u03AF\u03BD\u03C9\u03C3\u03B7 & \u03A5\u03C0\u03BF\u03B2\u03BF\u03BB\u03AE \u0391\u03BD\u03B1\u03BA\u03BF\u03AF\u03BD\u03C9\u03C3\u03B7");  // NOPMD by Admin on 10/2/2013 8:42 μμ
		Send_Announcement_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // NOPMD by Admin on 10/2/2013 8:43 μμ
				try {
		            // -------------------1)
					String Send_Announcement =  sendAnnouncementTextField.getText();
			        sendAnnouncementTextField.setText("");
			        
			        announcementArray[announcementCounter] = new Announcement();
			        announcementArray[announcementCounter].setAnnText(Send_Announcement);
			        System.out.println("new announcement created : "+ announcementArray[announcementCounter].getAnnText());  // NOPMD by Admin on 10/2/2013 8:43 μμ
			        announcementCounter++;   
			        //-----		
					Connection con = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql22538","sql22538","bF2*sC8!");            
		            Statement  stmt = (Statement) con.createStatement();
		            PreparedStatement statement  = con.prepareStatement("select * from message");
		            ResultSet result = statement.executeQuery();   // NOPMD by Admin on 10/2/2013 8:42 μμ
		           
		            result.last();
		            int C = result.getInt(1); 
		            C++;        
		            String insert = "INSERT INTO message VALUES ("+C+",'"+Send_Announcement+"' )";
		            stmt.executeUpdate(insert);
		           // -------------------2)
		            announcementTextArea1.setText("");
		            
		            Connection con2 = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql22538","sql22538","bF2*sC8!");
		            PreparedStatement statement2  = con2.prepareStatement("select * from message");
		            ResultSet result2 = statement2.executeQuery();   // NOPMD by Admin on 10/2/2013 8:42 μμ
		            result2.last();
		          
		            for ( int i = 0 ; i != 10; i++){                  
		               announcementTextArea1.append(("     ")+result2.getString(2)+"\n") ;                   
		               result2.previous();              
		            }
		            
		            	            
			       
			       	
			    }catch (Exception y){
			    	y.printStackTrace();  // NOPMD by Admin on 10/2/2013 8:43 μμ
		        }
				
				
				
			}
		});
		
		Send_Announcement_Button.setBounds(0, 445, 726, 23);
		contentPane.add(Send_Announcement_Button);
		
/* ********************************************************************************************************* */		
/* ********************************************************************************************************* */			
		/*  1) ---------------------New_Route_Button---------------------  */
		
		JButton button_1 = new JButton("\u039D\u03AD\u03BF \u0394\u03C1\u03BF\u03BC\u03BF\u03BB\u03CC\u03B3\u03B9\u03BF");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // NOPMD by Admin on 10/2/2013 8:43 μμ
				
				// Pernoune ta dedomena tis neas diadromis apo ta TextField
			       int Name_int = Integer.parseInt(nameTextField.getText());
			       int Cost_int = Integer.parseInt(costTextField.getText());
			       int Time_int = Integer.parseInt(timeTextField.getText());
			       int thesi_int = Integer.parseInt(thesisTextField.getText());
			       int Key_Day_int = Integer.parseInt(codeDayTextField.getText());
			       String Day = dayTextField.getText();
			       String Route = routeTextField.getText();
			     
			        routetArray[routeCounter]= new Route();
			        routetArray[routeCounter].setAll(Name_int ,Time_int , thesi_int ,Day ,Cost_int, Route );
			         System.out.println("new route created ");  // NOPMD by Admin on 10/2/2013 8:43 μμ
			         System.out.println("detail : ");  // NOPMD by Admin on 10/2/2013 8:43 μμ
			       
			       System.out.println("Ονομα Λεωφορίου : " + routetArray[routeCounter].getBusName() );  // NOPMD by Admin on 10/2/2013 8:43 μμ
			       System.out.println("Ωρα : " + routetArray[routeCounter].getTime() );         // NOPMD by Admin on 10/2/2013 8:43 μμ
			       System.out.println("Θέσεις : " + routetArray[routeCounter].getSeats() );         
			       System.out.println("Μερα : " + routetArray[routeCounter].getDay() );      
			       System.out.println("Τιμη εισιτιριου : " + routetArray[routeCounter].getTicketPrice() );
			       System.out.println("Διαδρομη : " + routetArray[routeCounter].getRoute() );
			       routeCounter++;
			    
			  
			       nameTextField.setText("");
			       costTextField.setText("");     
			       timeTextField.setText("");  
			       routeTextField.setText("");
			       thesisTextField.setText("");     
			       codeDayTextField.setText("");  
			       dayTextField.setText("");
			       
			       // Pernae ta tin Nea diadromi stin basi dedomenon
			       try 
			       {
			           Connection con = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql22538","sql22538","bF2*sC8!");
			           PreparedStatement statement  = con.prepareStatement("select * from Routes_Table");
			                      
			           String insert = "INSERT INTO Routes_Table VALUES ("+Name_int+" , '"+Route+"' ,'"+Day+"' ,"+Time_int+" , "+thesi_int+" ,"+Cost_int+" , "+Key_Day_int+" ,"+thesi_int+"  )";
			           statement.executeUpdate(insert);
			           
			                 
			          }catch (Exception y){
			        	  System.out.println(y);
			        }
				
			       
			}
		});
		button_1.setBounds(0, 55, 583, 23);
		contentPane.add(button_1);
		
		


	
	}
}
