package main.java.connect4game.domainView.views;

import main.java.connect4game.domainView.Types.Color;

public class ColorView {
    public void write(Color color) {
            String colorName;
            switch (color) {
                case BLUE:
                    colorName = "Blue";
                    break;
                case GREEN:
                    colorName = "Green";
                    break;
                default:
                    colorName = "";
                    break;
            }
        System.out.println(colorName);
    }
}
