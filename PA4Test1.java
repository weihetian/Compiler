import meggy.Meggy;

class PA4Test1 {

	public static void main(String[] args) {
		Meggy.setPixel((byte) 4, (byte) 4, Meggy.Color.BLUE);
		
		if (new function1().compares(3, 4)) {
			Meggy.setPixel(new function1().gets(2), (byte) 1, Meggy.Color.BLUE);
		}
	}

}

class function1 {
	public byte gets(int num) {
		return (byte) num;
	}
	
	public boolean compares(int a, int b) {
		return a < b;
	}
}

