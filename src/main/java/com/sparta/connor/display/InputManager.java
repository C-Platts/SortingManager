package com.sparta.connor.display;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {

    Scanner scanner = new Scanner(System.in);

    public int getUserInput() {

        int input = -1;
        boolean exit = false;

        try {
            input = scanner.nextInt();
        } catch (InputMismatchException i) {
            i.printStackTrace();
        }

       return input;
    }

}
