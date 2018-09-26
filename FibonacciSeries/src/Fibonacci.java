
public class Fibonacci {
	public static int FibSer(int n)
	  {
	   if(n<=1)
	  return n;
	return FibSer(n-1)+FibSer(n-2);
	  }
	public static void main(String args[])
	  {
	   int n=7;
	   int fib=FibSer(n);
	   System.out.println(fib);
	}
}
