// this is a Cat bean used to store attributes of each Cat object.
package ca.sheridancollege.imranfi.beans;


public class Cat{
	private String name;
	private int age;
	private String gender;
	private double price;
	private String desc;
	private String[] genders = {"male", "female"};
	
	public Cat() {
		super();
	}
	
	public Cat(String name, int age, String gender, double price, String desc, String[] genders) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.price = price;
		this.desc = desc;
		this.genders = genders;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", gender=" + gender + ", price=" + price + ", desc=" + desc
				+ "]";
	}
	public String[] getGenders() {
		return genders;
	}
	public void setGenders(String[] genders) {
		this.genders = genders;
	}
	
	
}