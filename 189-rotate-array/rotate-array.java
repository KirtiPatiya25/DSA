class Solution {
  public void rotate(int[] nums, int k) {
    if (nums == null || nums.length == 0) {
            return;
        }

        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
  }
}