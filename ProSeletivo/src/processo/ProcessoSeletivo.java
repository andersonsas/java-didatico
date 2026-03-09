package processo;

import java.util.ArrayList;
import java.util.Scanner;

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

		novoCampus();

		campi.get(2).nome = "Campus Manaus Distrito Industrial";
		campi.get(2).sigla = "CMDI";
		campi.get(2).endereco = "Av. Gov. Danilo de Matos Areosa";

		mostrarCampi();
	}

	public static void novoCampus() {
		Scanner sc = new Scanner(System.in);

		Campus campus = new Campus();
		System.out.print("Informe o nome do campus: ");
		campus.nome = sc.nextLine();
		System.out.print("Informe a sigla do campus: ");
		campus.sigla = sc.nextLine();
		System.out.print("Informe o endereço do campus: ");
		campus.endereco = sc.nextLine();

		sc.close();
		campi.add(campus);
	}

	private static void mostrarCampus(Campus campus) {
		System.out.print(campus.nome);
		System.out.println(" - " + campus.sigla);

	}

	public static void mostrarCampi() {
		int i = 0;
		for (Campus campus : campi) {
			System.out.print(i++ + " - ");
			mostrarCampus(campus);
		}
	}
}
