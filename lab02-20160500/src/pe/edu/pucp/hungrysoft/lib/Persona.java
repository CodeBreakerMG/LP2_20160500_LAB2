/*
	Nombre: Colocar nombre
	Fecha: 22-04-21
*/
abstract class Persona implements IConsulta{
	private int idPersona;
	private String nombre;
	private String apellido;
	private String DNI;
	public Persona(){}
	public Persona(int idPersona, String nombre, String apellido, String DNI){
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
	}
	public int getIdPersona(){
		return idPersona;
	}
	public void setIdPersona(int idPersona){
		this.idPersona = idPersona;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public String getDNI(){
		return DNI;
	}
	public void setDNI(String DNI){
		this.DNI = DNI;
	}
	public abstract String consultarDatos();
}