package leetCodeProblems;

public class TwoSum {

	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		int target = 6;
		twoSum(array, target);
		
		

	}
	public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.printf("[%d,%d]", i,j);
                }
            }
        }
        return new int[]{};
    }

}
