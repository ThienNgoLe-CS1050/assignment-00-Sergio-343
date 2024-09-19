import javax.swing.JOptionPane; 
public class Serio_Ramirez_Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable Declaration
		char middleInitial;
		String  firstName, lastName;
		double grossAnnualPay, taxRate, netAnnualPay;
		int age;
		
		//Reading Input
		firstName = JOptionPane.showInputDialog("Enter your first name");
		lastName = JOptionPane.showInputDialog("Enter your last name");
		String middleInitialStr = JOptionPane.showInputDialog("Enter your middle initial");
		middleInitial = middleInitialStr.charAt(0);
		age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("Enter gross pay"));
		taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter tax rate"));
		
		//Processing Data
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		
		//Displaying the output 
		System.out.print("Hello " + firstName + " " + middleInitial +  " " + lastName + "," +
						"\nYou are " + age + " years old now." + 
						"\nIt is amazing that you made $" + grossAnnualPay + 0 + " this year. With the tax" +
						"\nrate of " + taxRate + ", you can take home $" + netAnnualPay + 0 + ".");				
				     
		

	}

}

 