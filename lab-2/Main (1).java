/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 class Mother{
    	public static void show() {
		System.out.println("Hello World mother");
	}
}
class Child extends Mother {
    public static void show() {
		System.out.println("Hello juet");
	}
}


public class Main
{
    
    
    
	public static void main(String[] args) {
		System.out.println("Hello World main");
		Mother m= new Mother ( );
m.show( ); // show of Mother is called
Child ch=new Child ( );
System.out.println("Hello World Child");
ch. show ( );
		
		Mother m1=new Child ( );
		m1.show();
	}
}

