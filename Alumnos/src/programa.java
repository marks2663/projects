
public class programa {
	public static void main(String[]args){
	Asignatura asig1;
	asig1=new Asignatura();
	asig1.setNombre("Programación");
	System.out.println(asig1);
	asig1.setHoras(170);	
	
	Alumno alum1=new Alumno();
	alum1.setNombre("marks");
	alum1.setNota(1,4.5);
	alum1.setNota(2,6);
	alum1.setNota(3,1);
	System.out.println("La nota media de "+alum1.getNombre()+" es: "+alum1.getNotaMedia());
	
	System.out.println(alum1.getNota(5));
	
	Profesor prof1=new Profesor("Aitor","Alkorta");
	//prof1.setNombre("Aitor");
	//prof1.setApel("Alkorta");
	System.out.println("Nombre profesor: "+prof1);
	
	
	prof1.setDni("72345667M");
	System.out.println("DNI: "+prof1.getDni());
	
	prof1.setAsignatura(asig1);
	System.out.println(prof1+" imparte: "+prof1.getAsignatura());
	
	
	System.out.println("\n***************************************************************");
	
	
	Asignatura asig2;
	asig2=new Asignatura();
	asig2.setNombre("Entornos");
	asig2.setHoras(200);
	System.out.println("\n"+asig2);
	
	
	Profesor prof2=new Profesor("Peru","Pasku");
	System.out.println("Nombre profesor: "+prof2);
	
	prof2.setDni("76755836J");
	System.out.println("DNI: "+prof2.getDni());
	
	prof2.setAsignatura(asig2);
	System.out.println(prof2+" imparte: "+prof2.getAsignatura());
	
	
	}
}
