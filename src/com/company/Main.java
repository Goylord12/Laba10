package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();


        String[] strMas = str.split(" +");
        System.out.println(strMas.length + " слов");

    }
}