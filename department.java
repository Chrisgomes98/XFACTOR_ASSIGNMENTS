class department
{
	String name;
	String hod;
	department(String name,String hod)
	{
		this.name=name;
		this.hod=hod;
	}
	void info()
	{
		System.out.println("Department : "+this.name);
		System.out.println("HOD        : "+this.hod);
	}
}