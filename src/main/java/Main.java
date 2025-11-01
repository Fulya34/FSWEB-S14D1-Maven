import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Rectangle;
import com.workintech.pool.Cuboid;
import com.workintech.developers.*;

public class Main {
    public static void main(String[] args) {

        // --- Cylinder Test ---
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        // --- Pool Test ---
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        // --- Developers Test ---
        System.out.println("----- DEVELOPERS -----");
        HRManager hr = new HRManager(1, "Ayşe", 15000, 2, 2, 1);
        JuniorDeveloper junior = new JuniorDeveloper(2, "Ali", 8000);
        MidDeveloper mid = new MidDeveloper(3, "Veli", 12000);
        SeniorDeveloper senior = new SeniorDeveloper(4, "Can", 18000);

        hr.work();
        junior.work();
        mid.work();
        senior.work();

        hr.addEmployee(junior);
        hr.addEmployee(mid);
        hr.addEmployee(senior);
    }
}

