package demo.rk;



class Person{
	String Name;
	int Age;
	
public Person(String Name,int Age) {
	this.Name=Name;
	this.Age=Age;
}
public void speak() {
	System.out.println(Name+" is "+Age+" years old");
}
}
class Student extends Person{
	String grade;
	
public Student(String Name,int Age,String grade) {
	super(Name,Age);
	this.grade=grade;
}
public void study() {
	System.out.println(Name+" is "+Age+"years old with "+grade+"+");
	
}
}  

public class People {

	public static void main(String[] args) {
		Student s=new Student("Ram",20,"B");
        s.speak();
        s.study();

	}

}
