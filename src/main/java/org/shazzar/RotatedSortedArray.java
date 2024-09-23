package org.shazzar;

public class RotatedSortedArray {
  public static void main(String[] args) {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int[] num1 = {4, 5, 6, 7, 0, 1, 2};
    int[] num2 = {1};

    int target1 = 0;
    int target2 = 3;


    int res = RotatedSortedArray.search(num2, target1);
    System.out.println("Target res: " + res);
  }

  public static int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (int) Math.floor((right + left) / 2);
      if (nums[mid] == target) return mid;

      if (nums[left] <= nums[mid]) {
        if (nums[left] <= target && target < nums[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        // Otherwise, the right half must be sorted
        if (nums[mid] < target && target <= nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }
}
