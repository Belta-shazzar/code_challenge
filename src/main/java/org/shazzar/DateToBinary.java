package org.shazzar;

import java.util.Date;

public class DateToBinary {
  public static void main(String[] args) {
//    int decimal = 1900;
//    String binary = Integer.toBinaryString(decimal);
//    System.out.println("Binary representation of " + decimal + " is: " +
//    binary);
    String converted = convertDateToBinary("2000-08-25");
    System.out.println("The converted: " + converted);
  }

  public static String convertDateToBinary(String date) {
    String year = "";
    String month = "";
    String day = "";
    if (date.length() == 10 && (date.toCharArray()[4] == date.toCharArray()[7] && date.toCharArray()[7] == '-')) {
      year = Integer.toBinaryString(Integer.parseInt(date.substring(0, 4)));
      month = Integer.toBinaryString(Integer.parseInt(date.substring(5, 7)));
      day = Integer.toBinaryString(Integer.parseInt(date.substring(8, 10)));
    }
    return year + "-" + month + "-" + day;
  }
}
