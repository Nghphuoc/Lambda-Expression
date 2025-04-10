package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    String data = "Kạp Kạp";
    List<String> list = new ArrayList<>();

    list.add("Hello");
    list.add("C#");
    list.add("C++");
    list.add("Java");
    list.forEach(n -> System.out.println(n)); // sử dụng lambda trong list

    System.out.println("----------------------------");
    PrintTable p = (a) -> ("Cat say: " + a);
    System.out.println(
        p.printSpeak(data)); // single-line tự động hiểu dữ liệu cần trả về "Cat say: " + a

    System.out.println("----------------------------");
    PrintTable printTable = (a) -> {
      System.out.println("Xin Chào! " + a);
      System.out.println("Hello: " + a);
      return a; // when i use {} (multi-line block) (require return if method has return type)
    };
    printTable.printSpeak(data); // gọi lambda của đối tượng printTable
  }

}