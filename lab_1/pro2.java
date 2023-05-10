/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		int i,j=0;
		int x=5;
		int e=0;
		for(i=0;i<6;i++,x--,e++){
		    j=0;
		    for(;j<8;j++){
		        if((j>=x&&j<=8-x)&&(e%2==j%2)){
		        System.out.print(" *");
		    }
		    else{
		        System.out.print("  ");
		    }
		        
		    }
		    System.out.println(" ");
		}
		 j=0;
	     x=0;
		 e=0;
		for(i=0;i<6;i++,x++,e++){
		    for(j=0;j<9;j++){
		        if((j>=x&&j<=8-x)&&(e%2==j%2)){
		        System.out.print(" *");
		    }
		    else{
		        System.out.print("  ");
		    }}
		    System.out.println(" ");
		}
	    
	}
}

