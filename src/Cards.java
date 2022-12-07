
public class Cards {
	private int value;
	private String name;
	private String suits;
	private String colour;
	// Lets use 52 Card

	public Cards(int i, String suits, String names, String colour) {
		// TODO Auto-generated constructor stub
		this.value = i;
		this.suits =suits;
	    this.name = names;
	    this.colour = colour;
	    
	
	}

	public String suits() {
		return suits;
	}
	public String names() {
		return names();
	}
	public String colour() {
		return colour;
		
	}

	public String printValue() {
		return (this.name+" of "+this.suits+": "+this.colour);
	}
	}
	

	//public void setName(String name) {
	//	this.name = name;
	//}


	
