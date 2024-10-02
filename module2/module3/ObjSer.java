package module3;
import java.io.*;

class Person1 implements Serializable {
	
	int  age;
	 String name;
Person1(String name,int age)
{
this.name=name;
this.age=age;
}
public void display()
{
	System.out.println("Name:"+name+"\nAge"+age);
} 
}
class Employee extends Person1{
	private int empid;
Employee(String name,int age,int empid)
{
super(name,age);
this.empid=empid;
	}
public void display()
{
	System.out.println("Name:"+name+"\n Age:"+age+"\nEmpid:"+empid);
} 
}
 class ObjSer {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		  System.out.println("enter emp name");
		  String name=br.readLine();
		  System.out.println("enter emp age");
		  int age=Integer.parseInt(br.readLine());
		  System.out.println("enter emp code");
		  int code=Integer.parseInt(br.readLine());
		Employee emp=new Employee(name,age,code);
		try {
			FileOutputStream f11=new FileOutputStream("person.dat");
			ObjectOutputStream obj=new ObjectOutputStream(f11);
			obj.writeObject(emp);
			f11.close();
			}catch(IOException e)
				{
				System.out.println(e.getMessage());
				}
		//deserialize
		try {
			FileInputStream fin=new FileInputStream("person.dat");
			ObjectInputStream obj=new ObjectInputStream(fin);
			Employee q1=(Employee)obj.readObject();
			q1.display();
			fin.close();
			}
		catch(IOException e)
					{
				System.out.println(e.getMessage());
					}
		catch(ClassNotFoundException e)
		{
	System.out.println(e.getMessage());
		}
		
	}
}
