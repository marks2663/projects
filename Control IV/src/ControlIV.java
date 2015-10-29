import java.util.Scanner;

public class ControlIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cantPala();
		//sumaNum();
		//factorial();
		//numParImp();
	}
	public static void cantPala(){
		//pide palabras al usuario hasta que escriba "bye" y muestre la cantidad de palabras introducidas.
		String correcta="bye";
		String intr;
		Scanner sc=new Scanner(System.in);
		int cont=0;
		do{
			System.out.println("Introduzca una palabra: ");
			intr=sc.nextLine();
			if(intr.equals(correcta)){
				System.out.println("Palabra correcta.");
			}else{
				System.out.println("Palabra incorrecta, introduzca de nuevo.");
			}
			cont++;
		}while(!(correcta.equals(intr)));
		System.out.println("Has introducido "+cont+" palabras.");
	}

	public static void sumaNum(){
		//pide un n�mero al usuario y escribe la suma=1+2+3+4+num
		int num;
		int suma=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un n�mero: ");
		num=sc.nextInt();
		for (int i=1;i<=num;i++){
			suma=suma+i;
		}
		System.out.println("El factorial del numero introducido es: "+suma);
		
		
	}

	public static void factorial(){
		//realiza un programa que muestre el factorial de los diez primeros n�meros: 1!=1 2!=2 3!=6....
		int num;
		int fact=1;
		Scanner sc=new Scanner(System.in);
			for (int i=1;i<=10;i++){
			fact=fact*i;
			System.out.println("El factorial del numero "+i+" es: "+fact);
		}
		
	}

	public static void numParImp(){
		//realiza un programa que solicite n�meros hasta introducir 0 y muestre la cantidad de pares e impares y el total de n�meros introducidos
		int n=0;
		int itr;
		int par=0;
		int impar=0;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Introduzca un n�mero: ");
			itr=sc.nextInt();
			if (itr==n){
				System.out.println("El n�mero introducido es correcto.");
			}else{
				System.out.println("El n�mero introducido NO es correcto.");
			}
			if(itr%2==0){
				par++;
			}else{
				impar++;
			}
		}while(!(itr==n));
		System.out.println("Has introducido "+par+" n�meros PARES.");
		System.out.println("Has introducido "+impar+" n�meros IMPARES.");
	}
}
