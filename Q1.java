import java.awt.Rectangle;
public class Q1 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(50,50,600,600);
        double pr=.5*(r.getHeight()*r.getWidth());
        System.out.println("perimeter = "+pr);
    }
}