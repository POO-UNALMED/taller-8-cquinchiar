package futbol;
public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	public Portero (String nombre,int edad,short goles, byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=goles;
		this.dorsal=dorsal;
	}
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion() +
				" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos;
	}public int compareTo(Object f) {
		int dif=0;
		if(this.golesRecibidos>=((Portero)f).golesRecibidos) {
			dif=this.golesRecibidos-((Portero)f).golesRecibidos;
		}else {
			dif=((Portero)f).golesRecibidos-this.golesRecibidos;
		}return dif;
	}public boolean jugarConLasManos() {
		return true;
	}
}
