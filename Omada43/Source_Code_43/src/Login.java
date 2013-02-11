import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Login extends JFrame { // NOPMD by Admin on 10/2/2013 8:47 μμ

	private JPanel contentPane;  // NOPMD by Admin on 10/2/2013 8:47 μμ
	private JTextField usernameTextField;   // NOPMD by Admin on 10/2/2013 8:47 μμ
	private JPasswordField passwordPasswordField;  // NOPMD by Admin on 10/2/2013 7:00 μμ
	JButton exitButton;  // NOPMD by Admin on 10/2/2013 8:47 μμ

	/*---------------------Method - connect to databashe and check Username and Password-----*/
	public int connectionMethod(String Username , String Password)     // NOPMD by Admin on 10/2/2013 8:47 μμ
    {	
        try 
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql22538","sql22538","bF2*sC8!");  // NOPMD by Admin on 10/2/2013 8:47 μμ
            PreparedStatement statement  = con.prepareStatement("select * from Login_Table");  // NOPMD by Admin on 10/2/2013 8:47 μμ
            ResultSet result = statement.executeQuery();  // NOPMD by Admin on 10/2/2013 8:47 μμ
            
            while (result.next())
            {
            	if ( result.getString(2).equals(Username) && result.getString(3).equals(Password) && result.getInt(1)==1)
            	{
                    return 1;  // NOPMD by Admin on 10/2/2013 7:00 μμ
                }
            	else if ( result.getString(2).equals(Username) && result.getString(3).equals(Password) && result.getInt(1)==2)
            	{
                    return 2;  // NOPMD by Admin on 10/2/2013 8:48 μμ
                }
            }
            statement.close(); 
       } catch (Exception ex2) {
    	   ex2.printStackTrace();  // NOPMD by Admin on 10/2/2013 7:00 μμ
       }
       return 0;
    }
	
	
	
	public Login() {  // NOPMD by Admin on 10/2/2013 8:48 μμ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		/*  1) ---------------------Login_Button---------------------  */
		JButton loginButton = new JButton("\u0395\u03AF\u03C3\u03BF\u03B4\u03BF\u03C2");  // NOPMD by Admin on 10/2/2013 8:47 μμ
		loginButton.setBounds(71, 160, 89, 23);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  // NOPMD by Admin on 10/2/2013 8:47 μμ
				
				try {
		            String username = usernameTextField.getText(); 
		            String Password = passwordPasswordField.getText();
		                
		            int key = connectionMethod(username,Password);
		            if ( key == 0) {
				 JOptionPane.showMessageDialog(null, "Username and Password Wrong","User Login",JOptionPane.ERROR_MESSAGE);
		            }else {
		                if ( key == 1 ) {
		                    Admin admin = new Admin();
		                    admin.getNameMethod(username);						
		                    admin.setVisible(true) ;
		                }else { 
		                    Tamias tamias = new Tamias();
		                    tamias.getNameMethod(username);
		                    tamias.setVisible( true ) ;
		                }
		           }
		        } catch (Exception ex1) { 
		        	 ex1.printStackTrace();  // NOPMD by Admin on 10/2/2013 8:47 μμ
		        } 
				
				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(loginButton);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(190, 76, 105, 20);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordPasswordField = new JPasswordField();
		passwordPasswordField.setBounds(190, 107, 105, 20);
		contentPane.add(passwordPasswordField);
		
		/*  2) ---------------------Exit_Button---------------------  */
		exitButton = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		exitButton.addActionListener(new ActionListener() {
			final public void actionPerformed(ActionEvent arg0) {					  // NOPMD by Admin on 10/2/2013 8:47 μμ
				System.exit(0);
			}
		});
		exitButton.setBounds(190, 160, 89, 23);
		contentPane.add(exitButton);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(71, 79, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(71, 110, 75, 14);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("\u039A\u03B1\u03BB\u03CE\u03C2 \u039F\u03C1\u03AF\u03C3\u03B1\u03C4\u03B5");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 7, 383, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0395\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE \u0391\u03B3\u03BF\u03C1\u03AC \u0395\u03B9\u03C3\u03B9\u03C4\u03B7\u03C1\u03B9\u03C9\u03BD \u03A5\u03C0\u03B5\u03C1\u03B1\u03C3\u03C4\u03B7\u03BA\u03CE\u03BD \u039B\u03B5\u03C9\u03C6\u03BF\u03C1\u03AF\u03C9\u03BD");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 32, 383, 23);
		contentPane.add(lblNewLabel_2);
	}
}
