package selenium_section36;

public class ChildEmiritess extends ParentAirCraft {
	public static void main(String[] args) {
		ChildEmiritess c= new ChildEmiritess();
		c.engine();
		c.safteyGuidelines();
		c.bodyColour();

	}
	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Red colour on the body");
		
	}

}
