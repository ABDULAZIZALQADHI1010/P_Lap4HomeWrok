import java.awt.*;

public class Q4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10,20,30);
        System.out.println(" expected location : "+box.getLocation()+" expected width : "+box.width+" expected height : "+box.height);
        box.add(0,0);
        System.out.println(" actual location : "+box.getLocation()+" actual width : "+box.width+" actual height : "+box.height);
    }
}
