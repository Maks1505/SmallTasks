package workplace;

public enum EnumWorkplaceComponent {
	TABLE(16), CHAIR(20), COMPUTER(110), MOUSE(12), SCREEN(98), KEYBOARD(25), CHANCELLERY(10), PRINTER(25), HEADPHONE(14), FAX(15), TELEPHONE(13);
	private int price;
	
	EnumWorkplaceComponent(int price) {
		this.price = price; 
	}
	
	public int getPrice() {
		return price;
	}
	
}
