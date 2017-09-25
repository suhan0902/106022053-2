package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int number1,number2,number3,sum;
	System.out.print("請輸入第一個整數");
	number1=input.nextInt() ;
    System.out.print("請輸入第二個整數");
    number2=input.nextInt();
    System.out.print("請輸入第三個整數");
    number3=input.nextInt();
    sum=number1+number2-number3;
    System.out.printf("%d+%d-%d=%d",number1,number2,number3,sum);
    input.close();
    }
}
