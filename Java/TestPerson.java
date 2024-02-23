package homework;
import java.util.Scanner;

class Person {
	private String name;
	private String gender;
	private int age;
	
	Person(){	
	
}
	Person(String newName, String newGender, int newAge){
	name = newName;
	age = newAge;
	gender = newGender;
}
 public int getage() {
	return this.age;
 }
 public String getname() {
	return this.name;
}
 public String getgender() {
	return this.gender;
}
 public void setname(String name) {
	this.name = name;
}
 public void setgender(String gender) {
	this.gender = gender;
}
 public void setage(int age) {
	this.age = age;
}

}

public class TestPersonWithLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person[] p = new Person[5];
			for(int i = 0; i< p.length; i++) {
				p[i] = new Person();
				System.out.print("Name: " );
				String name = input.next();
				
				System.out.print("Age: ");
				int age = input.nextInt();
				
				System.out.print("Gender: ");
				String gender = input.next();			
				
				p[i].setage(age);
				p[i].setname(name);
				p[i].setgender(gender);
			}
				double sum = 0;
				for(int j = 0; j<p.length; j++) {
					 sum += p[j].getage();
				}
				double average = (double) sum/p.length;
				System.out.println("The average age is: " + average );
				
	}
}
