import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int c=1,multi=1;
		String mensaje="";
		System.out.print("Ingrese un número: ");
		int n=sc.nextInt();
		
			if(n>7) 
				mensaje="el número es superior a 7";
				
			while(c<=n) {
				multi=multi*c;
			c++;
			}
			
			if(n<=7)
				mensaje="El factorial de "+n+" es "+multi;
				System.out.println(mensaje);
		
		
	}

}
