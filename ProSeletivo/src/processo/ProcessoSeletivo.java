package processo;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessoSeletivo {
	static ArrayList<Campus> campi = new ArrayList<Campus>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		novoCampus(sc);
		novoCampus(sc);

		mostrarCampi();
	}

	public static void novoCampus(Scanner sc) {
		Campus campus = new Campus();
		System.out.print("Informe o nome do campus: ");
		campus.setNome(sc.nextLine());
		System.out.print("Informe a sigla do campus: ");
		campus.setSigla(sc.nextLine());
		System.out.print("Informe o endereço do campus: ");
		campus.setEndereco(sc.nextLine());

		campi.add(campus);
	}

	private static void mostrarCampus(Campus campus) {
		System.out.print(campus.getNome());
		System.out.println(" - " + campus.getSigla());
	}

	public static void mostrarCampi() {
		int i = 0;
		for (Campus campus : campi) {
			System.out.print(i++ + " - ");
			mostrarCampus(campus);
		}
	}
}
