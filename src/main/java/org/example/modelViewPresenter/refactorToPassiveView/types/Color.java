package org.example.modelViewPresenter.refactorToPassiveView.types;

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
}
