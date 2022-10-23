package main.java.connect4game.modelViewController.withComposite.types;

import java.util.ArrayList;
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

    public static List<Color> getColors() {
        return Arrays.stream(Color.values()).toList();
    }

    public boolean isNull() {
        return this == Color.NULL;
    }

    public static List<Color> getAll() {
        List<Color> colors = new ArrayList<>(Arrays.asList(Color.values()));
        colors.remove(Color.NULL);
        return colors;
    }

    public static Color getByName(String name) {
        return Color.valueOf(name);
    }
}
