
public class Alumno {

	private String nombre;
	private static final int NUM_EVAL=3;
	public double[] lstNotas=new double[NUM_EVAL];
	private double notaMedia;
	private int eval=lstNotas.length;
	
	private static int contAlumnos=0;

	
	public Alumno(){
		//System.out.println("Alumno Creado");
		for (int i=0;i<lstNotas.length;i++){
			lstNotas[i]=-1;
		}
		contAlumnos++;

	}
	public Alumno(String nombre) {
		this.nombre=nombre;
		contAlumnos++;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public static int getContAlumnos() {
		return contAlumnos;
	}	
	public static void setContAlumnos(int contAlumnos) {
		Alumno.contAlumnos = contAlumnos;
	}
	public double getNota(int eval){
		if(eval>=1 && eval<=NUM_EVAL){
			return lstNotas[eval-1];	
		}else{
			//-1 significa error
			return -1;
		}
		
	}
	public void setNota(int eval, double nota){
			if((nota>=0 && nota<=10) && (eval>=1 && eval<=NUM_EVAL)){
				lstNotas[eval-1]=nota;
			}
	}
	
	public void setNota1(double nota1){
		this.lstNotas[0]=nota1;
	}
	public double getNota1(){
		return lstNotas[0];
	}
	
	public void setNota2(double nota2){
		this.lstNotas[1]=nota2;
	}
	public double getNota2(){
		return lstNotas[1];
	}
	
	public void setNota3(double nota3){
		this.lstNotas[2]=nota3;
	}
	public double getNota3(){
		return lstNotas[2];
	}
	
	public double getNotaMedia(){

		double suma=0;		
				for (int i=0;i<lstNotas.length;i++){
			suma=suma+lstNotas[i];
		}
		return suma/NUM_EVAL;
	}
	public String toString(){
		return nombre+" "+getNotaMedia();
	}
	
}
