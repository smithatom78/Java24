package module2;

//Product class with product Id and product name as attributes  
class Product  
{  
int pro_Id;  
String pro_name;  
//Product class constructor  
Product(int pid, String n)  
{  
pro_Id = pid;  
pro_name = n;  
}  
public void display()  
{  
System.out.print("Product Id = "+pro_Id + "  " + " Product Name = "+pro_name);  
System.out.println();  
}  
}  
public class arrayObjectDemo  
{  
public static void main(String args[])  
{  
//create an array of product object   
Product[] obj = new Product[5] ;  
//create & initialize actual product objects using constructor  
obj[0] = new Product(23907,"Dell Laptop");  
obj[1] = new Product(91240,"HP 630");  
obj[2] = new Product(29823,"LG OLED TV");  
obj[3] = new Product(11908,"MI Note Pro Max 9");  
obj[4] = new Product(43590,"Kingston USB");  
//display the product object data  
System.out.println("Product Object 1:");  
obj[0].display();  
System.out.println("Product Object 2:");  
obj[1].display();  
System.out.println("Product Object 3:");  
obj[2].display();  
System.out.println("Product Object 4:");  
obj[3].display();  
System.out.println("Product Object 5:");  
obj[4].display();  
}  
}  