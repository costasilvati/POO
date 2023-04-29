
public class Door {
	boolean open;
	String color;
	double width;
	double height;
	double dept;
	
	public void open() {
		this.open = true;
		System.out.println("A porta esta aberta");
	}
	
	public void close() {
		this.open = false;
		System.out.println("A porta esta fechada");
	}
	
	public boolean isOpen() {
		return this.open;
	}
	
	public void paint(String s) {
		this.color = s;
	}
	
}
