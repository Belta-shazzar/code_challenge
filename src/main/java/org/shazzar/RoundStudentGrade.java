package org.shazzar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoundStudentGrade {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
//    System.out.print("Enter a number: ");
//    int entered = sc.nextInt();
//    double slashed = (double) entered / 5;
//    System.out.println("The Slashed: " + slashed);
//
//    int result = (int) Math.round(slashed);
//    System.out.println("The result: " + result);
//    int fResult = result * 5;
//    System.out.println("The final result: " + fResult);
    List<Integer> grades = List.of(73, 67, 38, 33);
    List<Integer> newGrades = Solution.gradingStudents(grades);
    System.out.print("The new grades are: " + newGrades);
  }

  static class Solution {
    public static List<Integer> gradingStudents(List<Integer> grades) {
      // Write your code here
      List<Integer> roundedGrades = new ArrayList<>();
      for (int grade : grades) {

        if (grade >= 38 && grade != 100) {
          double slashed = (double) grade / 5;
          int rSlashed = (int) Math.round(slashed);
          int newGrade = rSlashed * 5;
          newGrade = newGrade < grade ? newGrade + 5 : newGrade;
          int enter = newGrade - grade < 3 ? newGrade : grade;
          roundedGrades.add(enter);
        } else {
          roundedGrades.add(grade);
        }
      }

      return roundedGrades;
    }
  }
}
