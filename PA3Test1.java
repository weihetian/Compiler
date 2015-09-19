import meggy.Meggy;

class PA3Test1 {
	public static void main(String[] args) {
		Meggy.delay(500);
		if (Meggy.checkButton(Meggy.Button.A)) {
		Meggy.setPixel((byte) 0, (byte) 2, Meggy.Color.RED);
		} else {
			Meggy.setPixel((byte) 0, (byte) 2, Meggy.Color.BLUE);	
		}

		while (Meggy.checkButton(Meggy.Button.B)) {
			Meggy.setPixel((byte) 12, (byte) 14, Meggy.Color.YELLOW);
		}
	}
}
