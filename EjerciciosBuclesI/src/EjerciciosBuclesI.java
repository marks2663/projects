import java.util.Scanner;

public class EjerciciosBuclesI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//asteristic();
		//numAster();
		//numAsc();
		//numAscNNeg();
		//entPos();
		//dosNum();
		//cuadrado();
		//cuadr2();
		//numCero();
		//sumaNum();
		
	}
	public static void asteristic(){
		//dibujar 10 asteriscos
		for (int i=0; i<10; i++){
			System.out.print("*");
		}
	}
	public static void numAster(){
		//pide un n�mero y dibuje esa cantidad de asteriscos
		int rep;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nIntroduzca el numero de asteristicos: ");
		rep=sc.nextInt();
		for (int i=0;i<rep;i++){
			System.out.print("*");
		}
		
	}
	public static void numAsc(){
		//pide un n�mero y escribe ascendentemente los enteros entre el 0 y dicho n�mero
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nIntroduzca un numero: ");
		num=sc.nextInt();
		for (int i=0; i<=num;i++){
			System.out.print(i+" ");
		}
	}
	public static void numAscNNeg(){
		//mejora el ejercicio anterior comprobando que el n�mero introducido no sea negativo
		int num;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("\nIntroduzca un numero: ");
		num=sc.nextInt();
			if (!(num>=0)){
				System.out.println("No se admiten n�meros negativos.");
			}
		}while (!(num>=0));
		
		for (int i=0;i<=num;i++){
			System.out.print(i+" ");
		}
	}
	public static void entPos(){
		//mejora el ejercicio anterior solicitando el n�mero hasta que el usuario introduzca un entero positivo
		int num;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("\nIntroduzca un numero: ");
		num=sc.nextInt();
		
		}while (!(num>=0));
			
		for (int i=0;i<=num;i++){
			System.out.print(i+" ");
		}
	}
	public static void dosNum(){
		//pide al usuario dos n�meros y muestra los la s�rie de enteros entre el menor y el mayor.
		Scanner sc=new Scanner(System.in);

		int num1=0;
		int num2=0;
		int numMay;
		int numMen;
		System.out.println("Introduzca el primer numero: ");
		num1=sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		num2=sc.nextInt();
		if (num1>num2){
			numMay=num1;
			numMen=num2;
		}
		else{
			numMay=num2;
			numMen=num1;
		}
	
		for(int i=numMen;i<=numMay;i++){
			System.out.print(i+" ");
		}
	}
	public static void cuadrado(){
		//solicita un n�mero y genera un cuadrado que de lado tenga el n�mero de asteriscos introducidos por el usuario.
		Scanner sc=new Scanner(System.in);

		
		int lineas;
		System.out.println("Introduzca el tama�o del lado: ");
		lineas=sc.nextInt();
		
		for(int i=0;i<lineas;i++){
				for(int c=0;c<lineas;c ++){
					System.out.print("* ");
				}
			System.out.print("\n");
		}
 
	}
	public static void cuadr2(){
		//mejora el programa anterior solicitando un n�mero y el car�cter con el que vas a dibujar el cuadrado
		
		Scanner sc=new Scanner(System.in);
		char car;
		int lineas;
		System.out.println("Introduzca el tama�o del lado de un cuadrado: ");
		lineas=sc.nextInt();
		System.out.println("Introduzca un caracter: ");
		car=sc.next().charAt(0);
		
		for(int i=0;i<lineas;i++){			//saltos de linea
			
			for(int j=0;j<lineas;j++){		//lineas+caracter
				
				System.out.print(car+" ");
			}
			
		System.out.print("\n");
		
		}
		
	}
	public static void numCero(){
		//solicita n�meros hasta que se introduzca un cero, muestra como resultado la cantidad de enteros introducida.
		Scanner sc=new Scanner(System.in);
		int numIntr;
		int num = 0;
		
		do {
			System.out.println("Introduzca un numero: ");
			numIntr=sc.nextInt();
			if (numIntr!=num){
				System.out.println("N�mero introducido incorrecto");
			}
		}while(numIntr!=num);
		
		System.out.println("N�mero introducido correcto");
		
		System.out.println("----------------------Fin---------------------------");
	}
	public static void sumaNum(){
		//solicita n�meros hasta que se introduzca un cero, muestra como resultado la suma de los n�meros introducidos.
		Scanner sc=new Scanner(System.in);
		int numIntr;
		int num = 0;
		int suma=0;
		do {
			System.out.println("Introduzca un numero: ");
			numIntr=sc.nextInt();
			suma=suma+numIntr;
		}while(numIntr!=num);
		System.out.println("La suma de los numeros introducidos es: "+ suma);
	}
	
}
