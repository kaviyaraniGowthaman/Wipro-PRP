1. public class Example
{
public static void main(String[] args)
{
int n=25, max;
Scanner s = new Scanner(System.in);
int a[] = new int[n];
System.out.println("Enter the elements of array:");
for(int i = 0; i < n; i++)
{
a[i] = s.nextInt();
}
max = a[0];
for(int i = 0; i < n; i++)
{
if(max < a[i])
{
max = a[i];
}
}
System.out.println("Maximum value in the array is:"+max);
}
}


2.public class Example
{
public static void main(String[] args)
{
int n=25,c=0, max;
Scanner s = new Scanner(System.in);
int a[] = new int[n];
System.out.println("Enter the elements of array:");
for(int i = 0; i < n; i++)
{	
a[i] = s.nextInt();
}
max = a[0];
for(int i = 0; i < n; i++)
{
if(max < a[i])
{
max = a[i];
}
}
for(int i = 0; i < n; i++)
{
if(max == a[i])
{
C=c+1;
}
}
System.out.println(c);
}


3.package activity;
import java.util.*;
public class pyramid {
	
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the level of pyramid : ");
			int n=sc.nextInt();
			int p=1,s=n-1,num=1;
			while(p<=n){
				for(int i=1;i<=s;i++)
					System.out.print(" ");
				for(int i=1;i<=p;i++){
					if(num>9){
						num=num%9-1;
					}
					System.out.print(num);num++;
				}	
				int rev=num-2;
				for(int i=1;i<p;i++){
					if(rev<0){
						rev=9;
					}
					System.out.print(rev);rev--;
				}
				p++;System.out.print("\n");s--;
			}
		}

	}


4.public class ex4 {
	public static void main(String args[]){  
		  int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}	

}


5.import java.util.Scanner;
public class ex5 {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		   
		  System.out.print("Input first number: ");
		  int num1 = in.nextInt();
		   
		  System.out.print("Input second number: ");
		  int num2 = in.nextInt();
		   	
		  System.out.print("Input third number: ");
		  int num3 = in.nextInt();
		   
		  System.out.print("Input fourth number: ");
		  int num4 = in.nextInt();
		  
		  System.out.print("Enter fifth number: ");
		  int num5 = in.nextInt();
		  
		  System.out.print("Enter sixth number: ");
		  int num6 = in.nextInt();
		  
		  System.out.print("Enter seven number: ");
		  int num7 = in.nextInt();
		  
		  System.out.print("Enter eight number: ");
		  int num8 = in.nextInt();
		  
		  System.out.print("Enter ninth number: ");
		  int num9 = in.nextInt();
		  
		  System.out.print("Enter tenth number: ");
		  int num10 = in.nextInt();
		  
		  System.out.println("Average of ten5 numbers is: " + 
				   (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10);
	}
}




6.import java.util.*;
public class ex6 {
	static String removeDuplicate(char str[], int n)
    {	
        int index = 0;

        for (int i = 0; i < n; i++)
        {

            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            // If not present, then add it to
         // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 
    public static void main(String[] args)
    {
        char str[] = "malayalam".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }

}




7.package wipro;
import java.util.*;
public class as7 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		x=x*1000;
		float ans=(float)x/(float)3600;
		System.out.println(ans*y);
	}

}


8.package wipro;
import java.util.*;
public class as8 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		float ans=(float)x/(float)y;
		float result=ans*(float)18/(float)5;
		System.out.println((int)result+5);
	}
}


9.package wipro;
import java.util.*;
public class as9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int valid=x*80/100;
		int result=valid*45/100;
		System.out.println(result);
	}


10.least perfect square divisible by 21 36 66
 import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int number;
		for(int i=21;i<=(int)Math.pow(2,21);i++)
		{
		    int square_root=(int)Math.sqrt(i);
		    if((square_root*square_root == i)&&(i%21==0 && i%36==0 && i%66==0))
		    {	
		    System.out.println(i);
		    break;
		    }
		}
Output :

213444.
	}
}



11.Ravi and Kumar are working on as assignment. Ravi takes 6 hours to type 32 pages on a computer, while Kumar takes 5 hours to type 40 pages. How much time will they take, working together on two difference computers to type an assignment of 110 pages?

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int rh=6;
	    int rw=32;
	    int kh=5;
	    int kw=40;
	    float onehour_work=(rw/rh)+(kw/kh);
	    float work=110/(onehour_work);
	    System.out.print("Time taken by both to complete 110 pages : "+work+"hrs");
		
}
}
Output
Time taken by both to complete 110 pages : 8.5hrs



12.Check prime nor not
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int number=sc.nextInt();
	   int flag=0;
	   for(int i=1;i<=number;i++)
	   {
	       if(number%i==0)
	       {
	           flag+=1;
	       }
	   }
	   if(flag==2)
	   {
	       System.out.print("The given number is prime number");
	   }
	   else{
	       System.out.print("The given number is not prime number");
	   }
	   
	}
}  
Output:
13
The given number is prime number



13.package wipro;
import java.util.*;
public class area {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int l,b,d=23;
int p=206;
int s=p/2;
l=(s+d)/2;
b=l-d;
int area=l*b;

System.out.println(area);

}

}

}



14.package wipro;
import java.util.Scanner;

public class greatest {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
     int number1 = sc.nextInt();
     int number2 = sc.nextInt();
     int number3 = sc.nextInt();
     int gcdNumbers = greatest.findGCD(number1, number2, number3);
     System.out.println(gcdNumbers);
     sc.close();
  }
  public static int findGCD(int x, int y)
  {
     if(y == 0)
     {
        return x;
     }
     else
     {
        return findGCD(y, x % y);
     }
  }
  public static int findGCD(int x, int y, int z)
  {
     return findGCD(findGCD(x, y), z);
  }

}

15.
package wipro;
import java.util.*;
public class difference {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
int d=36;
n=d/9;
System.out.println(n);
}

}


