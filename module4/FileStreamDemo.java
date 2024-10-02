package module4;
import java.util.Scanner;
import java.io.*;
public class FileStreamDemo {

public static void main(String[] args) throws IOException{
Scanner s=new Scanner(System.in);
int n,i;
try {
File f=new File("number.txt");
if(f.exists()) {
System.out.println(f.getName()+" exists");
}
else
{
f.createNewFile();
System.out.println(f.getName()+" is created");
   }
System.out.println("Enter the number of inputs:");
n=s.nextInt();
FileOutputStream fout=new FileOutputStream("number.txt");
System.out.println("Enter the numbers");
for(i=0;i<n;i++)
{
int a=s.nextInt();
fout.write(a);
}
File fod=new File("odd.txt");
File fev=new File("even.txt");
if(fod.exists())
{
System.out.println(fod.getName()+" exists");
}
else
{
fod.createNewFile();
System.out.println(fod.getName()+" is created");
}
if(fev.exists())
{
System.out.println(fev.getName()+" exists");
}
else
{
fev.createNewFile();
System.out.println(fev.getName()+" is created");
}
FileInputStream fin=new FileInputStream("number.txt");
FileOutputStream fod1=new FileOutputStream("odd.txt");
FileOutputStream fev1=new FileOutputStream("even.txt");
int c;
System.out.println("\nNumbers in "+f.getName()+" : ");
while(( c=fin.read())!=-1)
{
System.out.print(c+"\t");
if(c%2==0)
fev1.write(c);
else
fod1.write(c);
}
FileInputStream fo2=new FileInputStream("odd.txt");
FileInputStream fe2=new FileInputStream("even.txt");
System.out.println("\nNumbers in "+fod.getName()+" : ");
while((c=fo2.read())!=-1)
{
System.out.println(c);
}
System.out.println("\nNumbers in "+fev.getName()+" : ");

while((c=fe2.read())!=-1)
{
System.out.println(c);
}

  }
catch(FileNotFoundException e)
{
System.out.println("File not found");
}
catch(Exception e1)
{
System.out.println(e1.getMessage());
}
}
}

