
package TopGun;

public class Tipo_Entrenamiento extends Avion{


	private boolean doble_mando;

   public Tipo_Entrenamiento (String id_avion, String mod_avion, int cap_avion, Piloto piloto, boolean doble_mando ) {

	   super(id_avion, mod_avion, cap_avion, piloto);

	   this.doble_mando = doble_mando;

   }

  public void configuraMando (String doble_mando) {
	  if (doble_mando.equalsIgnoreCase("Si")) {
		  this.doble_mando = true;
	  }else {
		  this.doble_mando = false;
	  }
  }

  public String dime_mando() {
		if(doble_mando) {
			return "Tipo de mando: Asistido incorporado";
		}else {
			return"Tipo de mando : Individual";
		}
	}


}
