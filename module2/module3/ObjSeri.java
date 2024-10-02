package module3;
import java.io.*;
import java.util.*;
	class MyPerson implements Serializable
	{
		int  age;
		String name;
   	  MyPerson (String name,int age)
		{
		this.name=name;
		this.age=age;
		}
	  public void display()
		{
			System.out.println("My Name is "+name+"\nI am "+age+" Years old");
		} 
	}
	 class ObjSeri {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			  System.out.println("enter emp name");
			  String name=sc.nextLine();
			  System.out.println("enter emp age");
			  int age=sc.nextInt();
				MyPerson p=new MyPerson(name,age);
			//Serialize
				try {
				FileOutputStream f11=new FileOutputStream("person.txt");
				ObjectOutputStream obj=new ObjectOutputStream(f11);
				obj.writeObject(p);
				f11.close();
				 System.out.println("Object Serialized");
				}
				catch(IOException e)
					{
					System.out.println(e.getMessage());
					}
			//deserialize
			try {
				FileInputStream fin=new FileInputStream("person.txt");
				ObjectInputStream obj=new ObjectInputStream(fin);
				MyPerson p1=(MyPerson)obj.readObject();
				System.out.println("Object DeSerialized");
				p1.display();
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
