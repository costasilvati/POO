
public class House {
	String color;
	Door door1;
	Door door2;
	Door door3;
	
	public int qHowDoorIsOpen() {
		int c =0;
		if(this.door1.isOpen()) {
			c++;
		}
		if(this.door2.isOpen()) {
			c++;
		}
		if(this.door3.isOpen()) {
			c++;
		}
		return c;
	}
}
