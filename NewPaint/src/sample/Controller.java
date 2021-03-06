package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import sample.Shape.*;

public class Controller {

    public void initialize(){
        colorPen.setValue(Color.BLACK);
    }

    double x1;
    double y1;
    double x2;
    double y2;

    @FXML
    Canvas myCanvas;

    @FXML
    ColorPicker colorPen;


    Figure figure;
    Line line = new Line();
    Rectangle rectangle = new Rectangle();
    Circle circle = new Circle();
    Triangle triangle = new Triangle();


    public void colorSetPen(ActionEvent actionEvent) {
        myCanvas.getGraphicsContext2D().setStroke(colorPen.getValue());//контур - circuit
    }
    public void clearAll(ActionEvent actionEvent) {
        myCanvas.getGraphicsContext2D().clearRect(0,0,600,528); //как лучше?
    }




    public void drawLine(ActionEvent actionEvent) {
        figure = line;
    }
    public void drawRectangle(ActionEvent actionEvent) {
        figure = rectangle;
    }
    public void drawCircle(ActionEvent actionEvent) {
        figure = circle;
    }
    public void drawTriangle(ActionEvent actionEvent) {
        figure = triangle;
    }




    public void mousePressed(MouseEvent mouseEvent) {
        x1 = mouseEvent.getX();
        y1 = mouseEvent.getY();
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        x2 = mouseEvent.getX();
        y2 = mouseEvent.getY();
        figure.draw(myCanvas, x1, y1, x2, y2);
    }



}
