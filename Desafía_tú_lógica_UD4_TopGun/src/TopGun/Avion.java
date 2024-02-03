
package TopGun;

public class Avion {

	private String id_avion;
	private String mod_avion;
	private int cap_avion;
	private Piloto piloto; //Atributo que almacenará una referencia a un objeto de tipo “Piloto”



	public Avion(String id_avion, String mod_avion, int cap_avion, Piloto piloto) {
		this.id_avion = id_avion;
		this.mod_avion = mod_avion;
		this.cap_avion = cap_avion;
		this.piloto = piloto;
	}

	public String mostrar_avion() {
		return "Identificador de avión: " + id_avion + "\n" +
				"Modelo de avión: " + mod_avion + "\n" +
				"Capacidad del avión: " + cap_avion + "\n" +
				piloto.mostrar_piloto();
	}

		public void crear_avion(String id_avion, String mod_avion, int cap_Avion, Piloto piloto) {
			this.id_avion = id_avion;
			this.mod_avion = mod_avion;
			this.cap_avion = cap_Avion;
			this.piloto = piloto;
		}



}
