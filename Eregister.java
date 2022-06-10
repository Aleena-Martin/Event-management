import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
//import javax.swing.ImageIcon;
public class Eregister implements ActionListener
{       
 String[] branch={"CS","EC","EEE","MECH","CIVIL","EI"};
 String[] year={"1st year","2nd year","3rd year","4th year"};
 String[] gender={"male","female"};
 String[] event={"workshop","scrapbook","exhibition","panel discussion"};
 String[] status={"volunteer","participant"};
 String[] member={"yes","no"};
  JFrame f1,f2,f3;
 JLabel intraLabel=new JLabel("XTREME");
 JLabel nameLabel=new JLabel("NAME");
 JLabel branchLabel=new JLabel("BRANCH");
 JLabel yearLabel=new JLabel("YEAR");
 JLabel genderLabel=new JLabel("GENDER");
 JLabel emailLabel=new JLabel("EMAIL");
 JLabel contactLabel=new JLabel("CONTACT");
 JLabel eventLabel=new JLabel("EVENT");
 JLabel statusLabel=new JLabel("STATUS");
 //JLabel venueLabel=new JLabel("VENUE");
 JLabel memberLabel=new JLabel("MEMBER");
 JTextField nameTextField=new JTextField();
 JComboBox branchComboBox=new JComboBox(branch);
 JComboBox yearComboBox=new JComboBox(year);
 JComboBox genderComboBox=new JComboBox(gender);
 JTextField emailTextField=new JTextField();
 JTextField contactTextField=new JTextField();
 JComboBox eventComboBox=new JComboBox(event);
 JComboBox statusComboBox=new JComboBox(status);
 JComboBox memberComboBox=new JComboBox(member);
 JButton proceedButton=new JButton("PROCEED");
 JButton enterButton=new JButton("ENTER");
 ImageIcon i1=new ImageIcon("eventr1.png");
ImageIcon ieee=new ImageIcon("ieee.jpg");
 JLabel li = new JLabel(i1);
JLabel  l2=new JLabel(ieee);

Eregister()
 {
 createWindow();
 setLocationAndSize();
 addComponentsToFrame();
 actionEvent();
 }
public void createWindow()
{
   f1=new JFrame();
   f2=new JFrame();
   f3=new JFrame();
   f1.setVisible(true);
   f2.setVisible(false);
   f3.setVisible(false);
   f1.setTitle("HOME PAGE");
   f1.setSize(700,700);
   f2.setSize(500,500);
   f2.setBounds(40,60,1000,1000);
   f1.setBounds(40,40,1000,1000);
   f3.setBounds(40,40,1000,1000);
   li.setBounds(0,0,1000,1000);
  //f2.getContentPane().setBackground(Color.gray);
      f1.setLayout(null);
	f2.setLayout(null);
   f2.getContentPane().setLayout(null);
   f3.getContentPane().setBackground(Color.gray);
      f3.setLayout(null);
   f3.getContentPane().setLayout(null);
   f1.getContentPane().setBackground(Color.gray);
   f1.getContentPane().setLayout(null);
   f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f1.setResizable(true);
   f2.setResizable(true);
  }
public void setLocationAndSize()
{      
 emailLabel.setBounds(100,220,100,70);
emailLabel.setForeground(Color.black);
 intraLabel.setBounds(30,10,140,70);
intraLabel.setForeground(Color.white);
 nameLabel.setBounds(20,50,40,70);
nameLabel.setForeground(Color.white);
  branchLabel.setBounds(20,100,80,70);
branchLabel.setForeground(Color.white);
  yearLabel.setBounds(20,140,100,70);
yearLabel.setForeground(Color.white);
  genderLabel.setBounds(20,180,100,70);
genderLabel.setForeground(Color.white);
  contactLabel.setBounds(20,220,140,70);
contactLabel.setForeground(Color.white);
  eventLabel.setBounds(20,260,140,70);
eventLabel.setForeground(Color.white);
  statusLabel.setBounds(20,370,100,70);
statusLabel.setForeground(Color.white);
 memberLabel.setBounds(20,330,160,70);
memberLabel.setForeground(Color.white);
 emailTextField.setBounds(200,233,180,50);
 nameTextField.setBounds(180,73,165,23);
  branchComboBox.setBounds(180,113,165,23);
  yearComboBox.setBounds(180,153,165,23);
  genderComboBox.setBounds(180,193,165,23);
 contactTextField.setBounds(180,233,165,23);
 eventComboBox.setBounds(180,273,165,23);
  statusComboBox.setBounds(180,400,165,23);
 proceedButton.setBounds(200,360,120,40);
  enterButton.setBounds(220,450,120,35);
 memberComboBox.setBounds(180,330,165,40);
}
public void addComponentsToFrame()
{
 f1.add(emailLabel);
 f1.add(li);
f2.setContentPane(l2);
//f2.add(l2);
 f2.add(intraLabel);
 f2.add(nameLabel);
 f2.add(branchLabel);
 f2.add(yearLabel);
 f2.add(genderLabel);
 f2.add(contactLabel);
 f2.add(eventLabel);
 f2.add(statusLabel);
f2.add(memberLabel);

 f1.add(emailTextField);
 f2.add(nameTextField);
 f2.add(branchComboBox);
 f2.add(yearComboBox);
 f2.add(genderComboBox);
 f2.add(contactTextField);
 f2.add(eventComboBox);
 f2.add(statusComboBox);
f2.add(memberComboBox);
f1.add(proceedButton);
 f2.add(enterButton);
}
public void actionEvent()
{
 proceedButton.addActionListener(this);
 enterButton.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
try{
                // Class.forName("oracle.jdbc.driver.OracleDriver");  
              //  Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","chaidb");
                //PreparedStatement Pstatement=connection.prepareStatement("insert into participant values(?,?,?,?,?,?)");
                //PreparedStatement P2statement=connection.prepareStatement("insert into program values(?,?)");
 if(ae.getSource()==proceedButton)
{
 f2.setVisible(true);
f1.dispose();
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
if(ae.getSource()==enterButton)
{
                     Class.forName("oracle.jdbc.driver.OracleDriver");  
                     Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","chaidb");
                     PreparedStatement Pstatement=connection.prepareStatement("insert into participant values(?,?,?,?,?,?,?)");
                     PreparedStatement P2statement=connection.prepareStatement("insert into program values(?,?)");
                     Pstatement.setString(1,nameTextField.getText());
    	               Pstatement.setString(2,branchComboBox.getSelectedItem().toString());
			   Pstatement.setString(3,yearComboBox.getSelectedItem().toString());
                       Pstatement.setString(4,emailTextField.getText());
                      Pstatement.setString(5,statusComboBox.getSelectedItem().toString());
                      Pstatement.setString(6,contactTextField.getText()); 
                      Pstatement.setString(7,genderComboBox.getSelectedItem().toString());
                       Pstatement.executeUpdate();
                      P2statement.setString(1,eventComboBox.getSelectedItem().toString());
                      P2statement.setString(2,memberComboBox.getSelectedItem().toString());
                 	   P2statement.executeUpdate();
                       JOptionPane.showMessageDialog(null,"EVENT Registered Successfully");
                  }
}
catch (Exception e)
{
     e.printStackTrace();
}
}
public static void main(String[] args)
 {
 new Eregister();
 }

}