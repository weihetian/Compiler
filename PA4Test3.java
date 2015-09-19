import meggy.Meggy;

class PA4Test3 {
	public static void main(String[] args) {
		if (3 < 4) {
			Meggy.setPixel((byte) 7, (byte) 4, Meggy.Color.BLUE);
			Meggy.toneStart(Meggy.Tone.Fs3, 200);
			Meggy.setPixel((byte) 6, (byte) 4, Meggy.Color.WHITE);
			Meggy.setPixel((byte) 5, (byte) 3, Meggy.Color.RED);
			Meggy.toneStart(Meggy.Tone.E3, 600);
			Meggy.toneStart(Meggy.Tone.Cs3, 700);
		}
	}
}
