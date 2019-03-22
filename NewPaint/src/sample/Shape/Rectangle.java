package sample.Shape;

import javafx.scene.canvas.Canvas;

public class Rectangle extends Figure {
    @Override
    public void draw(Canvas canvas, double x1, double y1, double x2, double y2) {
        double width = x2-x1;
        double height = y2-y1;
        if (width >= 0 && height >=0) {
            canvas.getGraphicsContext2D().strokeRect(x1, y1, width, height);
        } else if (width < 0 && height < 0) {
            canvas.getGraphicsContext2D().strokeRect(x2, y2, Math.abs(width), Math.abs(height));
        } else if (width < 0) {
            canvas.getGraphicsContext2D().strokeRect(x1-Math.abs(width), y1, Math.abs(width), Math.abs(height));
        } else if (height < 0) {
            canvas.getGraphicsContext2D().strokeRect(x1, y1-Math.abs(height), Math.abs(width), Math.abs(height));
        }

    }
}
