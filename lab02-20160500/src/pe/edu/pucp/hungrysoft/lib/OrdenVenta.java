/*
	Nombre: Colocar nombre
	Fecha: 22-04-21
*/
import java.util.ArrayList;
class OrdenVenta{
	private int idOrdenVenta;
	private double total;
	private Mesa mesa;
	private Mesero mesero;
	private Cliente cliente;
	private ArrayList<LineaOrdenVenta> lineasOrdenVenta;
	public OrdenVenta(){}
	public OrdenVenta(int idOrdenVenta){
		this.idOrdenVenta = idOrdenVenta;
		lineasOrdenVenta = new ArrayList<>();
	}
	public int getIdOrdenVenta(){
		return idOrdenVenta;
	}
	public void setIdOrdenVenta(int idOrdenVenta){
		this.idOrdenVenta = idOrdenVenta;
	}
	public double getTotal(){
		return total;
	}
	public void setTotal(double total){
		this.total = total;
	}
	public Mesa getMesa(){
		return mesa;
	}
	public void setMesa(Mesa mesa){
		this.mesa = mesa;
	}
	public Mesero getMesero(){
		return mesero;
	}
	public void setMesero(Mesero mesero){
		this.mesero = mesero;
	}
	public Cliente getCliente(){
		return cliente;
	}
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	public ArrayList<LineaOrdenVenta> getLineasOrdenVenta(){
		return lineasOrdenVenta;
	}
	public void setLineasOrdenVenta(ArrayList<LineaOrdenVenta> lineasOrdenVenta){
		this.lineasOrdenVenta = lineasOrdenVenta;
	}
	public void agregarLineaOrdenVenta(LineaOrdenVenta lov){
		lineasOrdenVenta.add(lov);
	}
	public void calcularSubtotalesyTotal(){
		this.total = 0.0;
		for(LineaOrdenVenta lov : lineasOrdenVenta){
			lov.calcularSubtotal();
			this.total += lov.getSubtotal();
		}
	}
	public String generarReporte(){
		String reporte = "------------------------------------------------------" + "\n";
		reporte += "Reporte Orden Nro. " + idOrdenVenta + "\n";
		reporte += "------------------------------------------------------" + "\n";
		reporte += "Mesa Nro. " + mesa.getIdMesa() + "\n";
		reporte += "Mesero: " + mesero.consultarDatos() + "\n";
		reporte += "Cliente: " + cliente.consultarDatos() + "\n";
		reporte += "------------------------------------------------------" + "\n";
		for(LineaOrdenVenta lov : lineasOrdenVenta){			
			reporte += lov.generarImpresion() + "\n";
		}
		reporte += "------------------------------------------------------" + "\n";
		reporte += "TOTAL : S/. " + total;
		return reporte;
	}
}