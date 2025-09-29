package hw_1;

import java.util.Scanner;

public class InitScanner {
    static Scanner sc;
    public static Scanner init() {
        sc = new Scanner(System.in);
        return sc;
    }
}
