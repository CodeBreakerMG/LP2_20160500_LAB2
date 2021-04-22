/*
	Nombre: Colocar nombre
	Fecha: 22-04-21
*/
class Plato extends ItemVenta{
	private String nombre;
	public Plato(){}
	public Plato(int idItemVenta, String nombre, double precio){
		super(idItemVenta, precio);
		this.nombre = nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	@Override
	public String consultarDatos(){
		return nombre + " - S/. " + getPrecio();
	}
}