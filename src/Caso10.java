import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float boni=0,desc=0;
		int c=0;
		String rpta="S",nombre1="",nombre2="",nombre3="";
		float sueldoB=0,sueldoN=0,alcanzado=0,Smenor=0,Smayor=0,Tmayor=0;
		int n=0;
		while (rpta.equals("S") || rpta.equals("s")) {
			c++;
			System.out.println("Datos del registro: "+ c);
			System.out.println("======================");
		
			System.out.println("Empleado: ");
			String empleado=sc.nextLine();
		
			System.out.println("Horas trabajadas: ");
			float horasT=sc.nextFloat();
		
			System.out.println("Tarifa por hora: ");
			float tarifaH = sc.nextFloat();
		
			System.out.println("Minutos de tardanza: ");
			float minT= sc.nextFloat();
			
			sueldoB= horasT*tarifaH;
			
			if (horasT<=50) 
				boni=0;
			else if (horasT>50 && horasT<=60)
				boni=sueldoB*0.02f;
			else if (horasT>60 && horasT<=70)
				boni=sueldoB*0.08f;
			else if (horasT>70 && horasT<=80)
				boni=sueldoB*0.13f;
			else if (horasT>80)
				boni=sueldoB*0.15f;
			
		
			if(minT<=15)
				desc=0;
			else if (minT>15 && minT<=30)
				desc=sueldoB*((0.3f/100)*minT);
			else if (minT>30)
				desc=sueldoB*((0.5f/100)*minT);
			
			sueldoN=sueldoB+boni-desc;
			alcanzado=horasT*100/80;
			sc.nextLine();
			
			System.out.println("RESULTADO");
			System.out.println("=========");
			System.out.println("Sueldo Bruto: "+sueldoB);
			System.out.println("Bonificacion: "+boni);
			System.out.println("Descuento: "+desc);
			System.out.println("Sueldo Neto: "+sueldoN);
			System.out.println("% Alcanzado: "+alcanzado+"%");
			
			System.out.println("¿Desea continuar?");
			rpta=sc.nextLine();
			
			if (c==1) {
				Smenor = sueldoN;
				nombre2 = empleado;
			}	
				
			if (sueldoN > Smayor) {
				Smayor = sueldoN;
				nombre1 = empleado;
			}
			if (sueldoN < Smenor) {
				Smenor = sueldoN;
				nombre2 = empleado;
			}
			
			if (minT > Tmayor) {
				Tmayor=minT;
				nombre3=empleado;
			}
			
		
			if (alcanzado>90)
				n=n+1;
		}
		
		System.out.println("-------------------");
		System.out.println("---R E S U M E N---");
		System.out.println("-------------------");
		System.out.println("Número de empleados: "+c);
		System.out.println("Sueldo neto mayor: "+Smayor+" pertenece a: "+nombre1);
		System.out.println("Sueldo neto menor: "+Smenor+" pertenece a: "+nombre2);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: "+nombre3+"("+Tmayor+" min)");
		System.out.println("Cantidad de empleados con mas del 90% de la meta:"+n);
	}

}
