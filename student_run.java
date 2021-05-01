import java.io.*;
import java.util.*;

class student_run
{
	ArrayList<student> studentbase;
	ArrayList<department> deptbase;
	student_run()
	{
		this.studentbase = new ArrayList<student>();
		this.deptbase = new ArrayList<department>();
	}
	void addstudent()throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name,age,gender,address");
		String name,age,gender,address;
		name=input.readLine();
		age=input.readLine();
		gender=input.readLine();
		address=input.readLine();
		student s=new student(name,age,gender,address);
		this.studentbase.add(s);
	}

	void liststudent()
	{
		for(student s: this.studentbase)
			s.info();
	}
	
	void adddepartment()throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of the  department");
		String name,hod;
		name=input.readLine();
		hod=input.readLine();
		department d=new department(name,hod);
		this.deptbase.add(d);
	}

	void listdepartment()
	{
		for(department d: this.deptbase)
			d.info();
	}

	void removestudent()throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name,age,gender,address to be removed");
		String name,age,gender,address;
		name=input.readLine();
		age=input.readLine();
		gender=input.readLine();
		address=input.readLine();
		 int index1 = -1;
		boolean flag=true;
                    for (student s1:studentbase)
                    {
                        index1 = index1 + 1;
                        if (s1.name.equals(name) && s1.gender.equals(gender) && s1.age.equals(age) && s1.address.equals(address))
                        {
				flag=false;
                            break;
                        }
                    }
                    if (flag)
                    {
                        System.out.println("No such student");
                    }
                    else
                    {
                        this.studentbase.remove(index1);
                        System.out.println("Student removed successfully");
                    }
		
	}
	
	void removedepartment()throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" enter the name of the department to be removed");
		String name,hod;
		name=input.readLine();
		hod=input.readLine();
		int index=-1;
		boolean flag=true;
		for (department d1:this.deptbase)
                    {
                        index = index + 1;
			System.out.println("to check "+d1.name+d1.hod+" "+name+hod);
                        if (d1.name.equals(name) && d1.hod.equals(hod))
                        {
			        this.deptbase.remove(index);
                        	System.out.println("Department removed successfully");
				flag=false;
				break;
                        }
                    }

                    if (flag)
                    {
                        System.out.println("No such department");
                    }
                   
	}
	
	public static void main(String args[])throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		Boolean flag=true;
		student_run sr=new student_run();
		while(flag)
		{
			int ch;
			System.out.println(" 1. Add student");
			System.out.println(" 2. List student");
			System.out.println(" 3. Add department");
			System.out.println(" 4. List department");
			System.out.println(" 5. Remove student");
			System.out.println(" 6. Remove department");
			System.out.println(" enter -1 to exit");
			
			ch=Integer.parseInt(input.readLine());
			
			switch(ch)
			{
				case 1:
					sr.addstudent();
					break;
				case 2:
					sr.liststudent();
					break;
				case 3:
					sr.adddepartment();
					break;
				case 4:
					sr.listdepartment();	
					break;
				case 5:
					sr.removestudent();
					break;
				case 6:
					sr.removedepartment();
					break;
				default:
					flag=false;
			}
				
		}
	}
}
