import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int c =0,aptos=0,noaptos=0;
		String rpta="S",estado="",nombre1="",nombre2="";
		float peso1=0,peso2=0,peso3=0,prom=0,porcentaje=0,prom_mayor=0,menor=0;

		while (rpta.equals("S") || rpta.equals("s")) {
			c++;
			System.out.println("Datos del registro: "+c);
			System.out.println("======================");
			
			System.out.print("Ingrese nombre del alummno: ");
			String nombre= sc.nextLine();
		
			System.out.print("Ingrese nota 1:");
			int nota1= sc.nextInt();
			System.out.print("Ingrese nota 2:");
			int nota2= sc.nextInt();
			System.out.print("Ingrese nota 3:");
			int nota3= sc.nextInt();
		
			System.out.print("Número de asistencias [1-12]: ");
			int asis= sc.nextInt();
			
			peso1=nota1*0.2f;
			peso2=nota2*0.3f;
			peso3=nota3*0.5f;
			prom=peso1+peso2+peso3;
			
			porcentaje=asis*100/12;
			
			if (prom>=13 && porcentaje>=70) {
				estado="Obtiene certificado";
				aptos++;
			}else {
				estado="Sin certificado";		
				noaptos++;
			}
			
			System.out.println("Estado: "+ estado);
			
			sc.nextLine();
			
			System.out.println("RESULTADO");
			System.out.println("=========");
			System.out.println("Promedio: "+prom);
			System.out.println("Asistencia: "+porcentaje+"%");
			System.out.println("Estado: "+estado);
			System.out.println("¿Desea continuar?");
			rpta=sc.nextLine();
			
			if (c==1) {
				menor = prom;
				nombre2 = nombre;
			}	
				
			if (prom > prom_mayor) {
				prom_mayor = prom;
				nombre1 = nombre;
			}
			if (prom < menor) {
				menor = prom;
				nombre2 = nombre;
			}
		}
					
			
	
		
		System.out.println("RESUMEN");
		System.out.println("=======");
		System.out.println("Número de participantes: "+c);
		System.out.println("Mayor promedio: "+prom_mayor+" Pertenece a: "+nombre1);
		System.out.println("Menor promedio: "+menor+" Pertenece a: "+nombre2);
		System.out.println("Número de alumnos certificados: "+aptos);
		System.out.println("Número de alumnos sin certificado: "+noaptos);
	}

}


