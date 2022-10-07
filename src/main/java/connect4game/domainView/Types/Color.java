package main.java.connect4game.domainView.Types;

public enum Color {
    BLUE,
    GREEN,
    NULL;

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

    public static Color getColorByName(String colorName) {
        Color color;
        switch (colorName) {
            case "Blue":
                color = BLUE;
                break;
            case "Green":
                color = GREEN;
                break;
            default:
                color = NULL;
                break;
        }
        return color;
    }

}
