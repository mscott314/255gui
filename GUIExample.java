import javax.swing.*; // importing swing objects, like panels, buttons etc.
import javax.swing.border.LineBorder;
import java.awt.*; // this will help with styling some of the components

public class GUIExample {

	public static void main(String[] args) {

		
		
		JFrame myFrame = new JFrame(); // Create the main window (frame) can also place window title in JFrame("title");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // determine window 'X' behavior. (window exits when clicking X)
		
		myFrame.setTitle("GUI Window Title"); // set title for the window
		myFrame.setSize(500,300); // set frame size
		myFrame.setResizable(false); // set frame to not be resizable
		myFrame.setLocationRelativeTo(null); // open window in the middle of screen

		
		
		JPanel myPanel = new JPanel(); // create a box within the frame to place components. box can styled.
		myPanel.setBackground(new Color(0xeeeeee)); // set a background color for the box
		myPanel.setLayout(null); // set a layout type for inside the panel object, this will be null so you can use absolute positioning with setBounds() method.
		myPanel.setBounds(0,0,500,300); // position components, x position, y position, width, height
		//myPanel.setBorder(new LineBorder(new Color(0xff0000), 1)); // create a border
		myFrame.add(myPanel); // add the panel to the frame.
		
		
		JMenuBar myBar = new JMenuBar(); // create a menu bar
		myPanel.add(myBar); // add the bar to the panel
		myBar.setBounds(2,2,490,20); // position the menubar
		myBar.setBorderPainted(true); // optional border styling
		//myBar.setBackground(new Color(0xdddddd)); // background styling
		
			JMenu myMenu1 = new JMenu("A menu"); // create a dropdown menu to go into the menu bar
			myBar.add(myMenu1); // add the dropdown menu to the menu bar
			
				JMenuItem myItem1a = new JMenuItem(); // create menu item object
				myItem1a.setText("New"); // set a text for the menu item
				myMenu1.add(myItem1a); // add the menu item to the menu
				
				JMenuItem myItem2a = new JMenuItem();
				myItem2a.setText("Open File ...");
				myMenu1.add(myItem2a);
				
				JMenuItem myItem3a = new JMenuItem();
				myItem3a.setText("Save As ...");
				myMenu1.add(myItem3a);
				
			JMenu myMenu2 = new JMenu("Another Menu");
			myBar.add(myMenu2);
			
				JMenuItem myItem1b = new JMenuItem();
					JCheckBox myCheck = new JCheckBox("Toggle option"); // create a checkbox
					myMenu2.add(myCheck); // add the checkbox to the menu
					//myCheck.setSelected(true); // set the default to be checked or unchecked
					
				myItem1b.setText("Another Menu Item");
				myMenu2.add(myItem1b);
				
				JMenuItem myItem2b = new JMenuItem();
				myItem2b.setText("Set Preferences");
				myMenu2.add(myItem2b);
				
				JMenuItem myItem3b = new JMenuItem();
				myItem3b.setText("Properties ...");
				myMenu2.add(myItem3b);
				
			JMenu myMenu3 = new JMenu("Created By ...");
			myBar.add(myMenu3);
				
				JMenuItem myItem1c = new JMenuItem();
				myItem1c.setText("Matthew Scott");
				myMenu3.add(myItem1c);
					
				JMenuItem myItem2c = new JMenuItem();
				myItem2c.setText("Lindsay Jordan");
				myMenu3.add(myItem2c);
					
				JMenuItem myItem3c = new JMenuItem();
				myItem3c.setText("Oshen Shrestha");
				myMenu3.add(myItem3c);
				
				JMenuItem myItem4c = new JMenuItem();
				myItem4c.setText("Sidney Blasiol");
				myMenu3.add(myItem4c);
		
		
		
		
		JTextArea myArea = new JTextArea(); // create a textarea
		myArea.setBounds(50,50,300,30); // position the text area
		myArea.setText("GUI Project Example"); // set text for the text area
		myArea.setEditable(false); // set whether or not the are can be edited by user 
		myArea.setBackground(new Color(0xeeeeee)); // set background color
		myArea.setForeground(new Color(0x373628)); // set foreground color
		myArea.setFont(new Font("Arial", Font.BOLD, 20)); // set font
		myArea.setToolTipText("Hover Text For Title"); // hover over tooltip text
		myPanel.add(myArea); // add the text area to the panel
		
		
		
		JLabel myLabel1 = new JLabel(); // create a label	
		myLabel1.setText("Username: "); // set the text for the label
		myLabel1.setBounds(30,100,100,20); // set a position for the label
		myPanel.add(myLabel1); // add the label to the panel
		
		JTextField myField1 = new JTextField(); // create a text field	
		myField1.setBounds(100,100,200,20);		// set a position for the text field
		myPanel.add(myField1); // add the field to the panel
		
		JLabel myLabel2 = new JLabel();
		myLabel2.setText("Password: ");
		myLabel2.setBounds(30,130,100,20);
		myPanel.add(myLabel2);
		
		JPasswordField myField2 = new JPasswordField(); // create a password field (text entered will be hidden by default)
		myField2.setBounds(100,130,200,20);		// set the position of the password field	
		myPanel.add(myField2); // add the password field to the panel
		
		JButton myButton1 = new JButton(); // create a button object
		myButton1.setText("Confirm"); // set the button text
		myButton1.setBounds(100, 170, 100, 20);
		myPanel.add(myButton1); // add the button to the panel
		
		JButton myButton2 = new JButton();
		myButton2.setText("Cancel");
		myButton2.setBounds(200, 170, 100, 20);
		myPanel.add(myButton2);
		
		String[] comboArray = { "Select Language", "- English", "- Spanish", "- French" }; // create an array of strings to populate the combo box
		JComboBox<String> myCombo = new JComboBox<String>(comboArray); // create a dropdown menu box object and set the array inside of it
		myCombo.setBounds(310, 100, 150,20); // set the position of the combo box
		myPanel.add(myCombo); // add the combo box to the panel
		
		
		
		myFrame.setVisible(true); // make the frame (window) visible. Seems like this needs to be placed at the bottom after all components
		// myFrame.pack(); // fit the window to the components.
		

	}

}
