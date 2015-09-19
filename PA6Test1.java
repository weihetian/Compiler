import meggy.Meggy;

class PA6Test1 {

	public static void main(String[] args) {
		new FUNCTION7().TRIGGER();
	}

}

class FUNCTION7 {
	public void TRIGGER() {
		int[] nums;
		int i;
		nums = new int[255];
		i = 0;
		while (i < nums.length) {
			nums[i] = i;
			i = i + 1;
		}
		Meggy.setAuxLEDs(nums[254]);
	}
}