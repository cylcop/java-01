package com.cops;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo {
  public static final int CODE_LENGTH = 5;

  public static void main(String[] args) {
    System.out.println("Hello Module!!");
    List<String> list = new ArrayList<String>();
    list.add("test");
    method();
  }

  public static void method() {
    System.out.println("test1");
    System.out.println("test2");
    Date date = new Date();
  }
}
