/*
	Nombre: Colocar nombre
	Fecha: 22-04-21
*/
class LineaOrdenVenta{
	private double subtotal;
	private int cantidad;
	private ItemVenta itemVenta;
	public LineaOrdenVenta(ItemVenta itemVenta, int cantidad){
		this.itemVenta = itemVenta;
		this.cantidad = cantidad;
	}
	public int getCantidad(){
		return cantidad;
	}
	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
	}
	public ItemVenta getItemVenta(){
		return itemVenta;
	}
	public void setItemVenta(ItemVenta itemVenta){
		this.itemVenta = itemVenta;
	}
	public double getSubtotal(){
		return subtotal;
	}
	public void calcularSubtotal(){
		this.subtotal = this.itemVenta.getPrecio() * this.cantidad;
	}
	public String generarImpresion(){
		return itemVenta.consultarDatos() + " - " + cantidad + " - S/. " + subtotal; 
	}
}