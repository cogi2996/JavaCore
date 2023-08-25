package Car;
import Vehicle.Vehicle;
public class Car extends Vehicle{
	public String modelName;
	public Car(String modelName,String brand){
		super(brand);
		this.modelName = modelName;
	}
	
}
