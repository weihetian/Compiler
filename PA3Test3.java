import meggy.Meggy;

class PA3Test3 {

	public static void main(String[] args) {
		Meggy.setPixel((byte) 1, (byte) 1, Meggy.Color.WHITE);
		Meggy.delay(500);
		Meggy.setPixel((byte) (1 + 1 * 3), (byte) (-1 - 4 * -2), Meggy.Color.WHITE);
		
		if (1 == 2) {
			Meggy.setPixel((byte) 6, (byte) 6, Meggy.Color.WHITE);
		}
		
		if (true && false) {
			Meggy.setPixel((byte) 6, (byte) 6, Meggy.Color.YELLOW);
		}
		
		if (true && !false) {
			Meggy.setPixel((byte) 7, (byte) 7, Meggy.Color.WHITE);
		}
	}

}
