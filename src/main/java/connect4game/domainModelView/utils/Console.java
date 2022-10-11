package main.java.connect4game.domainModelView.utils;

public class Console {
    private static Console instance = new Console();

    public static Console getInstance() {
        return instance;
    }

    public void write(String string) {
        System.out.print(string);
    }

    public void write(int integer) {
        System.out.print(integer);
    }

    public void write(char character) {
        System.out.print(character);
    }

    public void writeln() {
        System.out.println();
    }

    public void writeln(String string) {
        this.write(string);
        this.writeln();
    }

    public void writeln(int integer) {
        this.write(integer);
        this.writeln();
    }
}
