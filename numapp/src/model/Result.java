package model;

public class Result {
	public void CheckLogic(Bean bean) {
		String num = bean.getNum();
		String[] strs = num.split(",");
		int[] nums = new int[strs.length];

		for(int i=0;i<strs.length;i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}

		int max = nums[0];
		int min = nums[0];
		int sum = nums[0];
		for(int i=1;i<nums.length;i++) {
			int v = nums[i];
			if(v > max) {
				max = v;
			}
			if(v < min) {
				min = v;
			}
			sum += nums[i];
		}

		bean.setMax(max);
		bean.setMin(min);
		bean.setSum(sum);
		bean.setEre(nums.length);

	}
}
