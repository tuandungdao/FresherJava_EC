package generics;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("ve hinh tron");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("ve hinh vuong");
    }
}

public class WildCard {
	public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw(); 
        }
    }

    public static void main(String args[]) {
        List<Square> list1 = new ArrayList<Square>();
        list1.add(new Square());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);
    }
}
