import meggy.Meggy;

class PA6Test3 {

	public static void main(String[] args) {
		new FUNCTION9().TRIGGER();
	}

}

class FUNCTION9 {
	public void TRIGGER() {
		int[] nums;
		int i;
		Meggy.Color[] colors;
		byte j;
		
		
		nums = new int[255];
		i = 0;
		while (i < nums.length) {
			nums[i] = i;
			i = i + 1;
		}
		Meggy.setAuxLEDs(nums[128]);
		
		
		
		j = (byte) 0;
		
		colors = new Meggy.Color[7];
		colors[0] = Meggy.Color.RED;
		colors[1] = Meggy.Color.BLUE;
		colors[2] = Meggy.Color.BLUE;
		colors[3] = Meggy.Color.WHITE;
		colors[4] = Meggy.Color.YELLOW;
		colors[5] = Meggy.Color.BLUE;
		colors[6] = Meggy.Color.ORANGE;
		
		while (j < colors.length) {
			Meggy.setPixel(j, j, colors[j]);
			j = (byte) (j + 1);
		}
	}
}