import meggy.Meggy;

class PA5Test3 {

	public static void main(String[] args) {
		new FUNCTION6().TRIGGER();
	}

}

class FUNCTION6 {
	public void TRIGGER() {
		int x;
		byte y;
		y = (byte) 2;
		x = y;
		this.setPixel(x, y, Meggy.Color.BLUE);
	}
	
	public void setPixel(int x, int y, Meggy.Color color) {
		Meggy.setPixel((byte) x, (byte) y, color);
	}
}