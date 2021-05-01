public class student
{
	String name;
	String age;
	String address;
	String gender;
	student(String name,String age,String address,String gender)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		this.gender=gender;
	}

	void info()
	{
		System.out.println("name    : "+this.name);
		System.out.println("age     : "+this.age);
		System.out.println("gender  : "+this.gender);
		System.out.println("address : "+this.address);	
	}
	
}