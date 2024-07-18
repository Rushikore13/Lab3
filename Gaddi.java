package demo.ptpl;
class Vehicle{
	String Brand;
	String Model;
	int Year;
	
public Vehicle(String Brand,String Model,int Year) {
	this.Brand=Brand;
	this.Model=Model;
	this.Year=Year;
}
public void drive() {
	System.out.println("The "+Brand+" in "+Model+" of "+Year);
}
}
class Car extends Vehicle{
	String color;
	
public Car(String color,String Brand,String Model,int Year) {
	super(Brand,Model,Year);
	this.color=color;
}
public void honk() {
	System.out.println(color+" "+Brand+" in "+Model+" of "+Year);
}
}

public class Gaddi {

	public static void main(String[] args) {
		
		Car myCar =new Car("Red","Ferarri","Spider",2002);
		myCar.drive();
		myCar.honk();

	}

}
