package com.sri;

public class Fibonaci_series {
 static int a1=0, a2=1, a3;
	public static void main(String[] args) {
System.out.println(a1);
System.out.println(a2);
for (int i = 0; i <50; i++) {
	if (i>25) {
		break;
	}
	a3=a1+a2;
	System.out.println(a3);
	//swapping numbers
	a1=a2;
	a2=a3;
	
}




	}

}
