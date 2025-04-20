package org.example;

import java.math.BigDecimal;

public class BasicKoza5 {

  public static void main(String[] args) {
    String name = "齋藤翔伍";
    int number1 = 12345;
    double number2 = 100.23;
    boolean bool = true;
    BigDecimal number3 = BigDecimal.valueOf(10);
    BigDecimal number4 = BigDecimal.valueOf(15);

    System.out.println(number3.add(number4));
    System.out.println(number3.multiply(number4));
    System.out.println(bool);
  }

}
