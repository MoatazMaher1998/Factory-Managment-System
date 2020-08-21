package Pirahna;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputHelper {

		private boolean test;
		private String regex = "[0-9]+";

		
		
		public boolean checkForNumber(String line) { //check that if there number will be false
			
			for (int i = 0; i < line.length(); i++) {
				
				if (!Character.isLetter(line.charAt(i))) {
					return false;
				}

			}
			
			return true;
		}
		
		
		
		public boolean checkForLetter(String line) {
			
			 return(line.matches(regex)); //if there is no letter return true 
			
		}
		
		
		
		public boolean CheckEachTextField(JTextField field, String name, boolean which) { // true if letters only false if
																							// number only
			
			if (field.getText().equals("")) {
				Panel("empty", name, which); // this case the boolean not effective because it will check the string empty first
				return false;
			} 
			else if (which) { // check if there is number or not because we want it letters only
				test = checkForNumber(field.getText());
				if (test) { // that the textfield doesn't have numbers
					return true;
				} 
				else { 
					Panel("fill", name , which);
					return false;
				}

			} 
			else { // check if there is letters or not because we want it numbers only
				test = checkForLetter(field.getText());
				
				if(test) {
					return true;
				}
				
				else {
					Panel("fill", name, which);
					return false ;
				}
			}
		}

		
		private void Panel(String type, String name , boolean which) {

			if (type.equals("empty")) {
				
				JOptionPane.showMessageDialog(null, "Please enter the " + name + " Information");
				return;
			} 
			else if (which) {
				
				JOptionPane.showMessageDialog(null, "Please enter letters only in  " + name + " label");
				return;
			}
			else {
				
				JOptionPane.showMessageDialog(null, "Please enter numbers only in  " + name + " label");
				return;
			}

		}


}
