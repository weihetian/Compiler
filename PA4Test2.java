import meggy.Meggy;

class PA4Test2 {

	public static void main(String[] args) {
		Meggy.setPixel(new function2().gets(2), (byte) 2, Meggy.Color.WHITE);
	}

}

class function2 {
	public byte gets(int no) {
		return (byte) no;
	}
	
	public boolean compares(int a, int b) {
		return a < b;
	}
}