import Car.Car;
public class Temp {
	
	public static void main(String[] args) {
		Car car1 = new Car("1.1","Ford");
		car1.honk();
		System.out.println("Brand car:" + car1.brand);
		System.out.println("Model car:"+ car1.modelName);
	}
}
