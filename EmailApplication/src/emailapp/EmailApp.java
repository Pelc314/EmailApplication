package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Email eml = new Email("Jan", "Kowalski");

	//	eml.setAlternateEmail("marek.nowak@wp.pl");
	//	System.out.println("Alternate Email: " + eml.getAlternateEmail());
		
		System.out.println(eml.showInfo());
	}

}
