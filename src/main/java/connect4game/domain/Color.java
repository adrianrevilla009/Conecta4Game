package main.java.connect4game.domain;

public enum Color {
    BLUE,
    GREEN;

    public static String getColor(Color color) {
        String colorName;
        switch (color) {
            case BLUE:
                colorName = "Blue";
                break;
            case GREEN:
                colorName = "Green";
                break;
            default:
                colorName = "No matching color";
                break;
        }
        return colorName;
    }

}
