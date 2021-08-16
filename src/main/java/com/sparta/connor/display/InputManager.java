package com.sparta.connor.display;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {

    private final Scanner scanner = new Scanner(System.in);
    private int input;

    public int getUserInput() {

        input = -1;

        try {

            if(isInputValidType())
                input = scanner.nextInt();
        } catch (InputMismatchException i) {
            i.printStackTrace();
        }
        scanner.nextLine();

       return input;
    }

    private boolean isInputValidType() {
        return scanner.hasNextInt();
    }

    private boolean isSortSelectionValid(int input) {
        if(input >= 1 && input  <= 6) {
          return true;
        }
        return false;

    }

    public int getSortSelection() {
        input = -1;

        do {

            input = getUserInput();

        } while(!isSortSelectionValid(input));

        return input;
    }

    public int getArraySelection() {
        input= -1;

        do {

            input = getUserInput();

        } while(!isArraySelectionValid(input));

        return input;

    }

    private boolean isArraySelectionValid(int input) {
        if(input >= 1) {
            return true;
        }
        return false;
    }

}
