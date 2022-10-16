package main.java.connect4game.domainModel.basic.domain;

import main.java.connect4game.domainModel.basic.utils.Console;

import java.util.Arrays;
import java.util.List;

public enum Color {
    GREEN,
    BLUE,
    NULL;

    public static Color get(int ordinal){
        assert ordinal >= 0 && ordinal < Color.NULL.ordinal();

        return Color.values()[ordinal];
    }

    void write() {
        String string = this.name();
        if (this.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }

    boolean isNull() {
        return this == Color.NULL;
    }

    static List<Color> getColors() {
        return Arrays.stream(Color.values()).toList();
    }
}
