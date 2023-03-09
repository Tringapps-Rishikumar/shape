package shapemain;

import org.example.Shape;

import java.util.Scanner;
import java.util.logging.Logger;

public class Shapemain {
    public static void main(String[] args) {
        Logger l=Logger.getLogger("shape");
        Scanner bn = new Scanner(System.in);
        l.info("finding in area and perimeter:");
        l.info("enter the choice: \n1.Area \n2.Perimeter");
        int no = bn.nextInt();
        Shape s = new Shape(no);

    }


}