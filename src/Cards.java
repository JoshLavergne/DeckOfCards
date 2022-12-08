
public class Cards {
	private int value;
	private String name;
	private String Suits;
	private String colour;
	// Lets use 52 Card

	public Cards(int i, String suits, String names, String colour) {
		// TODO Auto-generated constructor stub
		this.value = i;
		this.Suits =suits;
	    this.name = names;
	    this.colour = colour;
	    
	}

	public String suits() {
		return Suits;
	}
	public String names() {
		return names();
	}
	public String colour() {
		return colour;
		
	}

	public String printValue() {
		return (this.name+" | "+this.Suits+" | "+this.colour);
	}
	}
	

	//public void setName(String name) {
	//	this.name = name;
	//}


	
