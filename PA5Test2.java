import meggy.Meggy;

class PA5Test2 {

	public static void main(String[] args) {
		new function4().trigger();
	}

}

class function4 {
	public void trigger() {
		int x;
		byte y;
		y = (byte) 3;
		x = y;
		Meggy.setPixel((byte) x, y, Meggy.Color.BLUE);
	}
}