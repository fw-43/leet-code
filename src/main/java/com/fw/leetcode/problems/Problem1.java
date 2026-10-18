package com.fw.leetcode.problems;

import com.fw.leetcode.constants.Category;
import com.fw.leetcode.constants.Difficulty;
import com.fw.leetcode.constants.Status;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1 extends Problem {

  public Problem1() {
    super(1, "Two Sum", Category.HASH_TABLE, Difficulty.EASY, Status.DONE);
  }

  public void run() {
    printProperties();
    System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9)));
    System.out.println(Arrays.toString(twoSum(new int[] {3, 2, 4}, 6)));
    System.out.println(Arrays.toString(twoSum(new int[] {3, 3}, 6)));
  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int c = target - nums[i];
      if (map.containsKey(c)) {
        return new int[] {map.get(c), i};
      }
      map.put(nums[i], i);
    }
    return new int[] {};
  }
}
