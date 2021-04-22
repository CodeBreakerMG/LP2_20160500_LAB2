/*
	Nombre: Colocar nombre
	Fecha: 22-04-21
*/
class Mesa{
	private int idMesa;
	private int capacidadMax;
	public Mesa(){}
	public Mesa(int idMesa, int capacidadMax){
		this.idMesa = idMesa;
		this.capacidadMax = capacidadMax;
	}
	public int getIdMesa(){
		return idMesa;
	}
	public void setIdMesa(int idMesa){
		this.idMesa = idMesa;
	}
	public int getCapacidadMax(){
		return capacidadMax;
	}
	public void setCapacidadMax(int capacidadMax){
		this.capacidadMax = capacidadMax;
	}
}