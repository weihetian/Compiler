import meggy.Meggy;

class PA2Test1 {
	public static void main(String[] args) {
		Meggy.setPixel((byte) 6, (byte) 2, Meggy.Color.GREEN);
		Meggy.setPixel((byte) 6, (byte) 2, Meggy.Color.YELLOW);
		Meggy.setPixel((byte) 6, (byte) 2, Meggy.Color.RED);
		Meggy.setPixel((byte) 6, (byte) 2, Meggy.Color.ORANGE);
		Meggy.setPixel((byte) 6, (byte) 2, Meggy.Color.GREEN);
		Meggy.setPixel((byte) 6, (byte) 2, Meggy.Color.BLUE);
		Meggy.setPixel((byte) 6, (byte) 2, Meggy.Color.WHITE);
	}
}
