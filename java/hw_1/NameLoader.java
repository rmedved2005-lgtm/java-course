package hw_1;

import java.util.Scanner;

public class NameLoader {
    private final Scanner sc;

    public NameLoader(Scanner sc) {
        this.sc = sc;
    }

    public String loadName(){
        return sc.nextLine().trim();
    }

}
