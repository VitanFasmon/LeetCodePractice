class Solution {
    public int countValuesInArray(int[] array, int value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter++;
            }
        }
        return counter;
    }

    public int removeElement(int[] nums, int val) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != val) {
                continue;
            }
            for (int j = nums.length - 1; j >= 0; j--) {
                int tempValue = nums[i];
                nums[i] = nums[j];
                nums[j] = tempValue;
                if (nums[i] != val) {
                    break;
                }
            }
        }
        return nums.length - countValuesInArray(nums, val);
    }
}