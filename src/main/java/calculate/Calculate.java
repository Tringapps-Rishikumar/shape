package calculate;

import java.util.Scanner;
import java.util.logging.Logger;

 public class Calculate{
    protected Logger l=Logger.getLogger("shape ");
    protected Scanner bn = new Scanner(System.in);
    protected int lentri1;
    protected int lentri2;
    protected int lentri3;
    protected int heitri;
    protected int bretri;
    protected int lenrect;
    protected int widrect;
    protected int radcircle;
    protected int perimeter(int shape) {
        if (shape == 1) {
            l.info("enter the length and width of Rectangle :");
            lenrect = bn.nextInt();
            widrect = bn.nextInt();
            return (2 * (lenrect + widrect));//p=2(length*width)


        }
        if (shape == 2) {
            l.info("enter the length1,length2,length3 of  Triangle");
            lentri1 = bn.nextInt();
            lentri2 = bn.nextInt();
            lentri3 = bn.nextInt();
            return lentri1 * lentri2 * lentri3;//p=length1*length2*length3


        }
        if (shape == 3) {
            l.info("Enter the radius of circle");
            radcircle = bn.nextInt();
            return (int) (2 * Math.PI * radcircle);//p=2*pi*r


        }
        else{
            l.info("enter valid choice bro");
        }
        return 0;
    }
    protected int area(int shape) {
        if (shape == 1) {
            l.info("Enter the length and width of a Rectangle");
            lenrect = bn.nextInt();
            widrect = bn.nextInt();
            return lenrect * widrect;//a=width*length


        }
        if (shape == 2) {
            l.info("Enter the breadth and height of a Triangle");
            bretri = bn.nextInt();
            heitri = bn.nextInt();
            return ((bretri * heitri) / 2);//(height*base)/2


        }
        if (shape == 3) {
            l.info("Enter the radius for a circle");
            radcircle = bn.nextInt();
            return ((int) (Math.PI * radcircle * radcircle));//pi*r*r


        }
        return 0;
    }


}

