package org.example.modelViewPresenter.passiveView;

import org.example.modelViewPresenter.passiveView.domain.Cell;
import org.example.modelViewPresenter.passiveView.types.Color;

import java.util.ArrayList;
import java.util.List;

public abstract class BoardView {

    protected List<Color> colors;

    public BoardView() {
        this.colors = new ArrayList<>();
    }

    public void set(Color color) {
        assert this.colors.size() < Cell.ROWS * Cell.COLUMNS;

        this.colors.add(color);
    }

    public abstract void write();

}
