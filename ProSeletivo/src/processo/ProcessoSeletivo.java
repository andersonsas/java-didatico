package processo;

import java.util.ArrayList;
//import java.util.Scanner;

public class ProcessoSeletivo {
	static ArrayList<Campus> campi = new ArrayList<Campus>();

	public static void main(String[] args) {
		Campus manausCentro = new Campus();
		Campus manausZonaLeste = new Campus();

		campi.add(manausCentro);
		campi.add(manausZonaLeste);
		campi.add(new Campus());
		campi.add(new Campus());
		campi.add(new Campus());

		System.out.println("Tamanho do vetor Campi: " + campi.size());

		manausCentro.nome = "Campus Manaus Centro";
		manausCentro.sigla = "CMC";
		manausCentro.endereco = "7 de Setembro, Centro";

		manausZonaLeste.nome = "Campus Manaus Zona Leste";
		manausZonaLeste.sigla = "CMZL";
		manausZonaLeste.endereco = "Av. Cosme Fereira";

		campi.get(2).nome = "Campus Manaus Distrito Industrial";
		campi.get(2).sigla = "CMDI";
		campi.get(2).endereco = "Av. Rodrigo Otávio";

		// System.out.println(campi.get(2));

		campi.forEach(item -> System.out.println(item.sigla));
	}

	public static void novoCampus() {
		/*
		 * Scanner scannerNome = new Scanner(System.in); Scanner scannerSigla = new
		 * Scanner(System.in); Scanner scannerEndereco = new Scanner(System.in);
		 * 
		 * Campus campus = new Campus(); System.out.print("Informe o nome do campus: ");
		 * campus.nome = scannerNome.nextLine();
		 * System.out.print("Informe a sigla do campus: "); campus.sigla =
		 * scannerSigla.next(); System.out.print("Informe o endereco do campus: ");
		 * campus.endereco = scannerEndereco.next(); campi.add(campus);
		 */
	}

	private static void mostrarCampus(Campus campus) {

	}

	public static void mostrarCampi(Campus campus) {
		int i = 0;
		for (Campus c : campi) {
			System.out.print(i++);
			System.out.print(" ");
			mostrarCampus(c);
		}
	}

}
