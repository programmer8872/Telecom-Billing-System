//Name- Vishal Arora
public class assignment2 {
	
	public static void main(String args[]) {
		System.out.println("Welcome to the Vishal Telecom Company Billing System");
		Invoice Input = new Invoice();
		
		Input.setMinutesFromUser();
		Input.setDatesFromUser();
		Input.dateDisplay();
		Input.calculateInvoice();
        Input.displayInvoice();
		
		

	}

}
