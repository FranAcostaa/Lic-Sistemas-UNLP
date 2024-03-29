package ejercicio7;

import java.util.*;

public abstract class TestEstudiante {
	public static void ListaEstudiantes() {
		// Creo lista de estudiantes
		List<Estudiante> listaE = new ArrayList<Estudiante>();
		Estudiante e1 = new Estudiante("nom1",1);
		Estudiante e2 = new Estudiante("nom2",2);
		Estudiante e3 = new Estudiante("nom3",3);
		listaE.add(e1); listaE.add(e2); listaE.add(e3);
		
		// Copio a otra lista
		List<Estudiante> listaE2= new ArrayList<Estudiante>();
		listaE2.addAll(listaE);
		
		// Imprimo el contenido de ambas listas
		for(Estudiante e:listaE) {
			System.out.println(e);
		}
		for(Estudiante e:listaE2) {
			System.out.println(e);
		}
		
		// Modifico dato de algun estudiante
		listaE2.get(0).setNombre("Nombre1");
		
		// Vuelvo a imprimir
		for(Estudiante e:listaE) {
			System.out.println(e);
		}
		for(Estudiante e:listaE2) {
			System.out.println(e);
		}
//Al realizar un cambio en un estudiante, se ve reflejado en ambas listas, por lo tanto ambas listas contienen los mismos estudiantes
		
		// Agrego nuevo estudiante
		Estudiante e4 = new Estudiante("nom4",4);
		if (!listaE.contains(e4)) {
			listaE.add(e4);
		}
	}
}
