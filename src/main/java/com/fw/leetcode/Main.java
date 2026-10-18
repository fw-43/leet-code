package com.fw.leetcode;

import com.fw.leetcode.problems.*;

public class Main {

  // spotless:off
  private final Problem[] problems = new Problem[] {
    null,
    new Problem1()
  };
  // spotless:on

  public Main(int no) {
    problems[no].run();
  }

  public static void main(String[] args) {
    try {
      if (args.length == 0) {
        throw new NumberFormatException();
      }
      int no = Integer.parseInt(args[0]);
      new Main(no);
    } catch (NumberFormatException e) {
      System.out.println("Invalid input");
      System.exit(0);
    }
  }
}
