package m1;
public class PassArray {
static void test(int v[])
 {
System.out.print("Number of args: " + v.length + " Contents: ");
for(int x : v)
	System.out.print(x + " ");
	System.out.println();
}
public static void main(String args[])
{int n1[] = { 10 };
int n2[] = { 1, 2, 3 };
int n3[] = { };
test(n1); // 1 arg
test(n2); // 3 args
test(n3); // no args}
}
}