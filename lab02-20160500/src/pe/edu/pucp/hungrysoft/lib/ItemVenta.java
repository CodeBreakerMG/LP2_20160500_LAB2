/*
	Nombre: Colocar nombre
	Fecha: 22-04-21
*/




abstract class ItemVenta implements IConsulta{
	private int idItemVenta;
	private double precio;
	public ItemVenta(){}
	public ItemVenta(int idItemVenta, double precio){
		this.idItemVenta = idItemVenta;
		this.precio = precio;
	}
	public int getIdItemVenta(){
		return idItemVenta;
	}
	public void setIdItemVenta(int idItemVenta){
		this.idItemVenta = idItemVenta;
	}
	public double getPrecio(){
		return precio;
	}
	public void setPrecio(double precio){
		this.precio = precio;
	}
	public abstract String consultarDatos();
}