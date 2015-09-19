import meggy.Meggy;

class PA5Test1 {

	public static void main(String[] args) {
		new function3().TRIGGER();
	}

}

class function3 {
	function3 func;
	
	public void TRIGGER() {
		byte x;
		byte y;
		
		func = this;
		x = (byte) 3;
		y = (byte) 3;
		
		Meggy.setPixel(x, y, Meggy.Color.BLUE);
	}
}