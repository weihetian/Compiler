import meggy.Meggy;

class PA3Test2 {

	public static void main(String[] args) {
		Meggy.delay(1000);
		while (Meggy.checkButton(Meggy.Button.B)) {
			if (!Meggy.checkButton(Meggy.Button.B)) {
				Meggy.setPixel((byte) 4, (byte) 7, Meggy.Color.WHITE);
			} else {
				Meggy.setPixel((byte) 5, (byte) 7, Meggy.Color.BLUE);
			}
			Meggy.setPixel((byte) 12, (byte) 14, Meggy.Color.YELLOW);
			if (true) {
				Meggy.setPixel((byte) 5, (byte) 5, Meggy.Color.WHITE);
			}
		
			if (false) {
				Meggy.setPixel((byte) 5, (byte) 5, Meggy.Color.YELLOW);
			}
		}
	}

}
