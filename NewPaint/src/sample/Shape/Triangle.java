package sample.Shape;

import javafx.scene.canvas.Canvas;

public class Triangle extends Figure {

    @Override
    public void draw(Canvas canvas, double x1, double y1, double x2, double y2) {
        double xTopPoint = (x1+x2)/2;
        double yTopPoint = y1;

        double xRightPoint = x2;
        double yRightPoint = y2;

        double xLeftPoint = x1;
        double yLeftPoint = y2;
        canvas.getGraphicsContext2D().strokeLine(xTopPoint, yTopPoint, xRightPoint, yRightPoint);
        canvas.getGraphicsContext2D().strokeLine(xRightPoint, yRightPoint, xLeftPoint, yLeftPoint);
        canvas.getGraphicsContext2D().strokeLine(xLeftPoint, yLeftPoint, xTopPoint, yTopPoint);
    }
}
