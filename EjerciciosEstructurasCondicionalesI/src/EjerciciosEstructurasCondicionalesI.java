import java.util.Scanner;

public class EjerciciosEstructurasCondicionalesI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*************************
		* IMPLEMENTA LOS SIGUIENTES PROGRAMAS UTILIZANDO 
		* ESTRUCTURAS CONDICIONALES
		**************************/
		//EjerciciosEstructurasCondicionalesI.diaSemana();
		//EjerciciosEstructurasCondicionalesI.mesAno();
		//EjerciciosEstructurasCondicionalesI.password();
		EjerciciosEstructurasCondicionalesI.usuPass();
		//dado el d�a num�rico devuelva el dia literal de la semana
	
	}
	public static void diaSemana() {
		int diaNum;
		String dia;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el d�a de la semana: ");
		diaNum=sc.nextInt();
		if(diaNum==1){
				dia="Lunes";
				System.out.println("El d�a de la semana introducido es: "+dia);
		}
		
			else if(diaNum==2){
				dia="Martes";
				System.out.println("El d�a de la semana introducido es: "+dia);
			}
			else if(diaNum==3){
				dia="Miercoles";
				System.out.println("El d�a de la semana introducido es: "+dia);
			}
			else if(diaNum==4){
				dia="Jueves";
				System.out.println("El d�a de la semana introducido es: "+dia);
			}
			else if(diaNum==5){
				dia="Viernes";
				System.out.println("El d�a de la semana introducido es: "+dia);
			}
			else if(diaNum==6){
				dia="S�bado";
				System.out.println("El d�a de la semana introducido es: "+dia);
			}
			else if(diaNum==7){
				dia="Domingo";
				System.out.println("El d�a de la semana introducido es: "+dia);
			}
			
		
		else{
			System.out.println("Introduzca un numero entre 1 y 7");
		}
		
	}
	
		public static void mesAno(){
		//dado el mes del a�o devuelva el n�mero de d�as q tiene
		
		int diaMes;
		String mes;
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero de mes: ");
		diaMes=sc.nextInt();
		if (diaMes==1){
			mes="31 d�as";
			System.out.println("El mes introducido tiene: "+mes);
		}
			else if(diaMes==2){
				mes="28 o 29 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==3){
				mes="31 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==4){
				mes="30 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==5){
				mes="31 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==6){
				mes="30 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==7){
				mes="31 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==8){
				mes="31 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==9){
				mes="30 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==10){
				mes="31 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==11){
				mes="30 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==12){
				mes="31 d�as";
				System.out.println("El mes introducido tiene: "+mes);
			}
		else{
			System.out.println("Introduzca un numero del 1 al 12");
		}
		
		}

		public static void password(){
			
			//Solicita al usuario un password, si no es '1234' escribe 'passwd incorrecto' si no 'Bienvenido'
			String password;
			String passControl="1234";
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduzca su contrase�a: ");
			password=sc.next();
			if (password.equals(passControl)){
				
				System.out.println("Bienvenido");
			}
			else {
				
				System.out.println("Contrase�a incorrecta");
			}
		}


		//Soliciata al usuario un usuario y passwd, si es 'admin' y '1234' mostrar 'Bienvenido', sino 'usuario o passwd incorrecto'
		
		public static void usuPass(){
			Scanner sc=new Scanner(System.in);
			String usuario;
			String usuaCorrec="admin";
			String password;
			String passCorrec="1234";
			
			do{
				
				System.out.println("Introduzca su usuario: ");
				usuario=sc.nextLine();
				System.out.println("Introduzca su contrase�a: ");
				password=sc.nextLine();
				//Si el usuario o la contrase�a son incorrectas, mensaje de error.
				if(!usuario.equals(usuaCorrec)||!password.equals(passCorrec))
					System.out.println("Usuario o Password incorrecto");
			
			}
			//Se ejecutar� el "do" mientras el usuario O la contrase�a sean incorrectas. si son correctas: "Bienve"
			while (!usuario.equals(usuaCorrec)||!password.equals(passCorrec));
				
			System.out.print("Bienve");
				
				
	}
				
			
}

	



