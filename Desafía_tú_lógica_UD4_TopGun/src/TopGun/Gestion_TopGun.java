
package TopGun;



import javax.swing.JOptionPane;

public class Gestion_TopGun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		// PILOTOS DE TOPGUN //

		Piloto primerPiloto = new Piloto(1,"Pete Maverick",  10000, "Capitán");
		Piloto segundoPiloto = new Piloto(2,"Natasha Phoenix", 3000, "Teniente");
		Piloto tercerPiloto = new Piloto(3,"Bradley Rooster", 3500, "Teniente");



		// PILOTOS INTRODUCIDOS POR EL USUARIO //

		Piloto cuartoPiloto = new Piloto(0 ,"", 0 , "");
		cuartoPiloto.nuevo_piloto(Integer.parseInt(JOptionPane.showInputDialog("Introduce ID del piloto")),JOptionPane.showInputDialog("Nombre del Piloto"), Integer.parseInt(JOptionPane.showInputDialog("Introduce horas de vuelo")), JOptionPane.showInputDialog("Rango del piloto"));

		Piloto quintoPiloto = new Piloto(0,"",0,"");
		quintoPiloto.nuevo_piloto(Integer.parseInt(JOptionPane.showInputDialog("Introduce ID del piloto")),JOptionPane.showInputDialog("Nombre del piloto"), Integer.parseInt(JOptionPane.showInputDialog("Introduce horas de vuelo")), JOptionPane.showInputDialog("Rango del piloto"));



		//INFO PILOTOS MAVERIK Y ROOSTER4

		System.out.println("INFORMACIÓN DEL PILOTO -MAVERIK- Y EL PILOTO -ROOSTER- ");
		System.out.println(primerPiloto.mostrar_piloto());
		System.out.println();
		System.out.println(tercerPiloto.mostrar_piloto());
		System.out.println();



		//PILOTOS INTRODUCIDOS POR EL USUARIO

		System.out.println("INFORMACIÓN PILOTOS INTRODUCIDOS POR EL USUARIO");
		System.out.println(cuartoPiloto.mostrar_piloto());
		System.out.println();
		System.out.println(quintoPiloto.mostrar_piloto());
		System.out.println();



		// AVIONES DE TOPGUN //
		System.out.println("AVIONES DE TOP GUN");
		Tipo_Entrenamiento primerAvion = new Tipo_Entrenamiento ("IO-360-L2A", "Modelo Entrenamiento - Cessna Skyhawk", 4, segundoPiloto, true);
		Tipo_Entrenamiento segundoAvion = new Tipo_Entrenamiento ("T-7A", "Modelo Entrenamiento - Red Hawk", 3, tercerPiloto, true);
		Tipo_Combate tercerAvion = new Tipo_Combate ("F-22", "Modelo Combate: Lockheed Martin - Raptor", 2, primerPiloto, true);
		System.out.println(primerAvion.mostrar_avion());
		System.out.println();
		System.out.println(segundoAvion.mostrar_avion());
		System.out.println();
		System.out.println(tercerAvion.mostrar_avion());
		System.out.println();



		// AVIONES INTRODUCIDOS POR EL USUARIO //
		System.out.println("AVIONES INTRODUCIDOS POR EL USUARIO");
		String id_avion4 = JOptionPane.showInputDialog("Introduce Id avión: ");
		String mod_avion4 = JOptionPane.showInputDialog("Modelo del avión: ");
		int cap_avion4 = Integer.parseInt(JOptionPane.showInputDialog("Capacidad del avión: "));



		Tipo_Combate cuartoAvion = new Tipo_Combate(id_avion4, mod_avion4, cap_avion4,cuartoPiloto, false );
		cuartoAvion.configurafurtivoo(JOptionPane.showInputDialog("El avión es furtivo true/false"));

		System.out.println(cuartoAvion.mostrar_avion());
		System.out.println(cuartoAvion.dime_ataque());

		System.out.println();


		String id_avion5 = JOptionPane.showInputDialog("Introduce Id avión: ");
		String mod_avion5 = JOptionPane.showInputDialog("Modelo del avión: ");
		int cap_avion5 = Integer.parseInt(JOptionPane.showInputDialog("Capacidad del avión: "));

		Tipo_Entrenamiento quintoAvion = new Tipo_Entrenamiento(id_avion5, mod_avion5, cap_avion5, quintoPiloto, false);
		quintoAvion.configuraMando(JOptionPane.showInputDialog("Configura Mando del avión" ));

		System.out.println(quintoAvion.mostrar_avion());
		System.out.println(quintoAvion.dime_mando());



	}

}
