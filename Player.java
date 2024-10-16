import java.util.ArrayList;
import java.util.Scanner;

class Player {
    private String name;
    private char symbol; // X ou O

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
