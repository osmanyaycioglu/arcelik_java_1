package com.arcelik.training.java.puzzle.p2;

import java.util.Scanner;

public class Puzzle2Run {

    public static void main(final String[] args) {
        Scanner scannerLoc = new Scanner(System.in);
        int value = scannerLoc.nextInt();
        if ((value > 10) && (value < 50)) {
            System.out.println("10 ile 50 arasında.");
        } else if (value > 50) {
            System.out.println("50 den büyük");
        } else if (value < 10) {
            System.out.println("10 dan küçük");
        }
    }
}
