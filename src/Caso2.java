import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int c=1 ,sum=0;
		
		System.out.print("Ingrese número: ");
		int num= sc.nextInt();
		
		while (c <= num) {
			sum+=c; // suma = suma + c;
			c++;
			
			
		}
		
		System.out.println("La sumatoria es: "+sum);
		

	}

}
