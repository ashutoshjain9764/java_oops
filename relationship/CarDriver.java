package relationship;
import java.util.*;
public class CarDriver 
{
	public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
		Car c1=new Car("TATA", "NEXA",960000);
        c1.displayCar();
        c1.e1.displayEngine();
        
        Car c2=new Car("CNG","560cc","plastic ",678,"TATA", "NEXA",960000);
        c1.displayCar();
        c2.e1.displayEngine();
        
        System.out.println("Enter the Fuel");
        String fuel=sc.nextLine();
        System.out.println("Enter the Types");
        //nextLine();
        String types=sc.next();
        System.out.println("Enter the id");
        int id=sc.nextInt();
        System.out.println("Enter the cc");
        sc.nextLine();
        String cc=sc.nextLine();
        c1.setEngine(fuel, cc, types,id);
        c1.e1.displayEngine();


    }
}
