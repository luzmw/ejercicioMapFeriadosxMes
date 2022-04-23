package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Registrar en un mapa feriados por meses. Ingresar por teclado y luego mostrar los resultados
        /*
        public static void main(String[] args) {
		Map<String, Integer> goleadores = new HashMap<String, Integer>();
		goleadores.put("Jug1", 1);
		goleadores.put("Jug2", 3);
		Integer golesJug1 = goleadores.get("Jug1");
		golesJug1++;
		goleadores.put("Jug1", golesJug1);

		Set<String> nombres = goleadores.keySet();
		for (String nombre : nombres) {
			System.out.println("Jugador: " + nombre + " -> goles: " + goleadores.get(nombre));
		}
	}
	// ejemplo for e iteraator en set

	for (String setItem : cadenas) {
			System.out.println(setItem);
		}
		// recorrido del set (forma 2)
		Iterator<String> it = cadenas.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
         */

        Map<Integer, List<Integer>> feriadosXMes = new HashMap<Integer, List<Integer>>();
        Scanner sc = new Scanner(System.in);
        Integer mes = 0;
        Integer feriado = 0;
        List<Integer> diasAgregados = new ArrayList<Integer>();

        System.out.println("ingrese el número de mes, para salir ingrese 0");
        mes = sc.nextInt();

        while (mes != 0) {
            System.out.println("ingrese el feriado , para salir ingrese 0");
            feriado = sc.nextInt();
            while (feriado != 0) {

                diasAgregados = feriadosXMes.get(mes);
                if (diasAgregados == null) {
                    diasAgregados = new ArrayList<Integer>();
                }
                diasAgregados.add(feriado);
                feriadosXMes.put(mes, diasAgregados);

                System.out.println("ingrese el feriado , para salir  0");
                feriado = sc.nextInt();


            }
            System.out.println("ingrese el número de mes, para salir ingrese 0");
            mes = sc.nextInt();
        }

        for (Integer keymes : feriadosXMes.keySet()) {
            System.out.println("mes: " + feriadosXMes.get(keymes));
            List<Integer> listferiados = feriadosXMes.get(keymes);
            for (Integer itemferiado : listferiados) {
                System.out.println(itemferiado);
            }
        }

    }
}


