/*
	Nombre: Colocar nombre
	Fecha: 22-04-21
*/
import java.util.ArrayList;
class Cliente extends Persona{
	private Categoria categoria;
	public Cliente(){}
	public Cliente(int idPersona, String nombre, String apellido, String DNI, Categoria categoria){
		super(idPersona, nombre, apellido, DNI);
		this.categoria = categoria;
	}
	public Categoria getCategoria(){
		return categoria;
	}
	public void setCategoria(Categoria categoria){
		this.categoria = categoria;
	}
	@Override
	public String consultarDatos(){
		return getDNI() + " - " + getNombre() + " " + getApellido() + " - " + categoria;
	}
}