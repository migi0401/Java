package app; //패키지명 선언

import base.Shape;
import derived.Circle;

public class GraphEidtor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
