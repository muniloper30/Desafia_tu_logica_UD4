
package TopGun;

public class Tipo_Combate extends Avion{

	private boolean es_furtivo;

	   public Tipo_Combate (String id_avion, String mod_avion, int cap_avion, Piloto piloto, boolean es_furtivo ) {

		   super(id_avion, mod_avion, cap_avion, piloto);

		   this.es_furtivo = es_furtivo;

	   }

	   public void configurafurtivoo (String es_furtivo) {
			  if (es_furtivo.equalsIgnoreCase("Si")) {
				  this.es_furtivo = true;
			  }else {
				  this.es_furtivo = false;
			  }
		  }

		  public String dime_ataque() {
				if(es_furtivo) {
					return "Tipo de combate: Furtivo";
				}else {
					return"Tipo de combate: Normal";
				}
			}

}
