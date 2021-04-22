/*
	Nombre: Colocar nombre
	Fecha: 22-04-21
*/
class Mesero extends Persona{
	private double sueldo;
	public Mesero(){}
	public Mesero(int idPersona, String nombre, String apellido, String DNI, double sueldo){
		super(idPersona, nombre, apellido, DNI);
		this.sueldo = sueldo;
	}
	public double getSueldo(){
		return sueldo;
	}
	public void setSueldo(double sueldo){
		this.sueldo = sueldo;
	}
	@Override
	public String consultarDatos(){
		return getDNI() + " - " + getNombre() + " " + getApellido();
	}
}