/*
	Nombre: Colocar nombre
	Fecha: 22-04-21
*/
class Bebida extends ItemVenta{
	private String marca;
	private double capacidad;
	private String unidadMedida;
	public Bebida(){}
	public Bebida(int idItemVenta, String marca, double capacidad, String unidadMedida, double precio){
		super(idItemVenta,precio);
		this.marca = marca;
		this.capacidad = capacidad;
		this.unidadMedida = unidadMedida;
	}
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public double getCapacidad(){
		return capacidad;
	}
	public void setCapacidad(double capacidad){
		this.capacidad = capacidad;
	}
	public String getUnidadMedida(){
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida){
		this.unidadMedida = unidadMedida;
	}
	@Override
	public String consultarDatos(){
		return marca + " " + capacidad + " " + unidadMedida + " - S/. " + getPrecio();
	}
}