package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String names[] = {"Masha", "Dasha", "Sasha", "Tanya"};
        int i = new Random().nextInt(4);
        switch (i) {
            case 0:
                System.out.println(names[i] + ", good morning!");
                break;
            case 1:
                System.out.println(names[i] + ", good afternoon!");
                break;
            case 2:
                System.out.println(names[i] + ", good evening!");
                break;
            case 3:
                System.out.println(names[i] + ", get out!");
        }
    }
}
