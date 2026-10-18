package com.fw.leetcode.problems;

public abstract class Problem {

  public Integer no;
  public String title;
  public String category;
  public String difficulty;
  public String status;

  public Problem(Integer no, String title, String category, String difficulty, String status) {
    this.no = no;
    this.title = title;
    this.category = category;
    this.difficulty = difficulty;
    this.status = status;
  }

  public void printProperties() {
    System.out.println("=".repeat(70));
    System.out.printf("Problem %s: %s%n", no, title);
    System.out.printf("Category: %s%n", category);
    System.out.printf("Difficulty: %s%n", difficulty);
    System.out.printf("Status: %s%n", status);
    System.out.println("=".repeat(70));
  }

  public abstract void run();
}
