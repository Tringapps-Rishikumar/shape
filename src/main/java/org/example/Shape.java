package org.example;
import claculate.Calculate;
import java.util.logging.Level;

public class  Shape extends Calculate {
   public Shape(int choice) {
        if (choice == 1) {
            l.info("Enter your choice:\n1.Area of rectangle\n2.Area of triangle\n3.Area of circle\n");
            int a = bn.nextInt();
            l.log(Level.INFO, () ->"AREA OF YOUR SHAPE :" + area(a));
        } else if (choice == 2) {
            l.info("Enter your choice :\n1.Perimeter of rectangle\n2.Perimeter of Triangle\n3.Perimeter of Circle\n");
            int b = bn.nextInt();
            l.log(Level.INFO, () ->"PERIMETER OF YOUR SHAPE :" + perimeter(b));
        } else {
            l.info("enter the valid choice bro .......");
        }
    }

}
