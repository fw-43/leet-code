package com.fw.leetcode.problems;

import com.fw.leetcode.constants.Category;
import com.fw.leetcode.constants.Difficulty;
import com.fw.leetcode.constants.Status;
import java.util.HashSet;
import java.util.Set;

public class Problem36 extends Problem {

  private final char[][] test1 = {
    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
  };

  private final char[][] test2 = {
    {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
  };

  private final char[][] test3 = {
    {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
    {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
    {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
    {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
    {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
    {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
    {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
    {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
    {'.', '.', '4', '.', '.', '.', '.', '.', '.'},
  };

  public Problem36() {
    super(36, "Valid Sudoku", Category.HASH_TABLE, Difficulty.MEDIUM, Status.NOT_DONE);
  }

  public void run() {
    printProperties();
    System.out.println(isValidSudoku(test1));
    System.out.println(isValidSudoku(test2));
    System.out.println(isValidSudoku(test3));
  }

  public boolean isValidSudoku(char[][] board) {
    for (int y = 0; y < 9; y++) {
      for (int x = 0; x < 9; x++) {
        if (board[y][x] != '.') {
          if (!row(board, y)) return false;
          if (!column(board, x)) return false;
          if (!grid(board, x, y)) return false;
        }
      }
    }
    return true;
  }

  public boolean row(char[][] board, int y) {
    Set<Character> set = new HashSet<>();
    for (int x = 0; x < 9; x++) if (board[y][x] != '.' && !set.add(board[y][x])) return false;
    return true;
  }

  public boolean column(char[][] board, int x) {
    Set<Character> set = new HashSet<>();
    for (int y = 0; y < 9; y++) if (board[y][x] != '.' && !set.add(board[y][x])) return false;
    return true;
  }

  public boolean grid(char[][] board, int x, int y) {
    int yy = y / 3 * 3;
    int xx = x / 3 * 3;
    int yy1 = yy + 3;
    int xx1 = xx + 3;
    Set<Character> set = new HashSet<>();
    for (; yy < yy1; yy++) {
      xx = x / 3 * 3;
      for (; xx < xx1; xx++) {
        if (board[yy][xx] != '.' && !set.add(board[yy][xx])) return false;
      }
    }
    return true;
  }
}
