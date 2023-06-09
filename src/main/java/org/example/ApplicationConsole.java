package org.example;

import java.util.Scanner;

public class ApplicationConsole {

    private final Scanner scanner;

    public ApplicationConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public String readLine() {
        return scanner.nextLine();
    }

}
