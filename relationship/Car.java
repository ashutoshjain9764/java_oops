package relationship;

public class Car
{
	public String company;
    public String model;
    public double price ;
   
    Engine e1;
    {
    e1=new Engine("Petrol","150cc","HardMetal",12456); //early binding 
    }
   public Car(String company,String model, double price)
    {
        this.company=company;
        this.model=model;
        this.price=price;
    }

   public Car(String fuel,String cc,String types, int id, String company,String model, double price)
   {
	   e1=new Engine(fuel,cc,types,id);
       this.company=company;
       this.model=model;
       this.price=price;
   }

  
    public void setEngine(String fuel,String cc,String type,int id )
    {
        e1=new Engine(fuel,cc,type,id);  //lazy binding
    }

	public void displayCar() {
		// TODO Auto-generated method stub
		System.out.println("Company  is :-  "+company);
        System.out.println("Model  is :-  "+model);
        System.out.println("Price   is :-  "+price);	
	}

}
