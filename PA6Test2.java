import meggy.Meggy;

class PA6Test2 {

	public static void main(String[] args) {
		new FUNCTION8().TRIGGER();
	}

}

class FUNCTION8 {
	public void TRIGGER() {
		Meggy.Color[] colors;
		byte i;
		
		i = (byte) 0;
		
		colors = new Meggy.Color[7];
		colors[0] = Meggy.Color.RED;
		colors[1] = Meggy.Color.BLUE;
		colors[2] = Meggy.Color.BLUE;
		colors[3] = Meggy.Color.WHITE;
		colors[4] = Meggy.Color.YELLOW;
		colors[5] = Meggy.Color.BLUE;
		colors[6] = Meggy.Color.ORANGE;
		
		while (i < colors.length) {
			Meggy.setPixel(i, i, colors[i]);
			i = (byte) (i + 1);
		}
	}
}