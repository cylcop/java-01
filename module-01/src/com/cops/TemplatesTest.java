package com.cops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemplatesTest {

  // 模板五：prsf
  private static final HelloIDEA HELLO_IDEA = new HelloIDEA();
  // psf
  public static final int NUM = 1;
  // psfi
  public static final int NUM2 = 0;
  // psfs
  public static final String NAMESPACE = "default";

  // 模板一：main / psvm
  public static void main(String[] args) {
    // 模板二：sout
    System.out.println("hello!");
    // soutp
    System.out.println("args = " + Arrays.deepToString(args));
    // soutm
    System.out.println("TemplatesTest.main");
    int num1 = 10;
    // soutv
    System.out.println("num1 = " + num1);
    int num2 = 15;
    // xxx.sout
    System.out.println(num2);

    // 模板三：fori
    String[] arr = new String[] {"张三", "李四", "王五"};
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println();
    // iter / fore
    for (String s : arr) {
      System.out.println(s);
    }
    System.out.println();
    // itar
    for (int i = 0; i < arr.length; i++) {
      String s = arr[i];
      System.out.println(s);
    }
    System.out.println();
    // 模板四：list.for
    List<String> list = new ArrayList<String>();
    list.add("Tom");
    list.add("Sum");
    list.add("Jame");
    for (String s : list) {
      System.out.println(s);
    }
    // list.fori 正序输出
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println();
    // list.forr 倒序输出
    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.println(list.get(i));
    }
  }

  public void method() {
    System.out.println("TemplatesTest.method");
  }

  public void testMethod() {
    System.out.println("test");
  }
}
