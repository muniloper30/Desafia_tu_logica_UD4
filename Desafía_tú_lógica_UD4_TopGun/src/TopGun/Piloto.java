
package TopGun;

public class Piloto{

	private int id_piloto;
	private String nom_piloto;
	private int horas_vuelo;
	private String rango_piloto;


	public Piloto(int id_piloto,String nom_piloto, int horas_vuelo, String rango_piloto) {

		this.id_piloto = id_piloto;
		this.nom_piloto = nom_piloto;
		this.horas_vuelo = horas_vuelo;
		this.rango_piloto = rango_piloto;
	}

	// GETTER PARA MOSTRAR LOS DATOS DEL PILOTO //

	public String mostrar_piloto() {
		return  "Piloto: " + id_piloto + "\n" +
				"Nombre del piloto: " + nom_piloto + "\n" +
				"Horas de vuelo: " + horas_vuelo + "\n" +
				"Rango del piloto: " + rango_piloto ;
	}

	// SETTER PARA INTRODUCIR UN PILOTO POR PANTALLA //

	public void nuevo_piloto(int id_piloto, String nom_piloto, int horas_vuelo, String rango_piloto) {
		this.id_piloto = id_piloto;
		this.nom_piloto = nom_piloto;
		this.horas_vuelo = horas_vuelo;
		this.rango_piloto = rango_piloto;
	}

}
