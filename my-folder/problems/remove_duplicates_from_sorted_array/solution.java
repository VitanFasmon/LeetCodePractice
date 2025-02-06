class Solution {
    public int removeDuplicates(int[] nums) {
     if (nums.length == 0) return 0; 
        int i = 0; // Pointer for unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { 
                i++; // Move to the next unique position
                nums[i] = nums[j]; // Copy unique value
            }
        }

        return i + 1;
    }
}