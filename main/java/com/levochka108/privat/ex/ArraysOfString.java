package com.levochka108.privat.ex;

/**
 * Практика работы с массивом сторок
 */
public class ArraysOfString {
  public static void program(String[] args){
      int[] numbers = new int[5];
      numbers[0] = 108;
      String[] strings = new String[5];
      strings[0] = "Молоко";
      strings[1] = "Хлеб";
      strings[2] = "Банан";
      strings[3] = "Яблоки";
      strings[4] = "Сыр сулугуни";
      String text = String.format("%s и %s = хорошая еда",strings[1],strings[4]);
      System.out.println(text);

      for (String string  : strings ) {
          System.out.println(string);
      }
  }

}
