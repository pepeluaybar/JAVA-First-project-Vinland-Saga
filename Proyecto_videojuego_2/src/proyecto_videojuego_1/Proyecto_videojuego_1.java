/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videojuego_1;

import java.util.Scanner;

public class Proyecto_videojuego_1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String jugador = pedirNombre();

        int vidas = 3;
        boolean seguirJugando = true;

        System.out.println("\n=== VINLAND SAGA: CAMINOS DE REDENCIÓN ===");
        System.out.println("Eres Thorfinn, hijo de Thors, el guerrero que renunció a la violencia.");
        System.out.println("Tras la muerte de Askeladd, buscas sentido en un mundo dominado por la guerra...");
        System.out.println("Elige con números y pulsa Enter para decidir tu destino.\n");

        while (seguirJugando) {
            boolean finalBueno = historiaPrincipal(jugador);

            if (!finalBueno) {
                vidas--;
                if (vidas > 0) {
                    System.out.println("\n💀 Has perdido una vida. Te quedan " + vidas + ".");
                    System.out.println("Regresando al inicio...\n");
                } else {
                    System.out.println("\n☠️ Has agotado tus vidas, " + jugador + ".");
                    System.out.println("Tu viaje termina aquí. Que los dioses te reciban con honor.");
                    break;
                }
            } else {
                // Si el jugador gana, se pregunta si quiere continuar
                if (preguntaSiNo("\n¿Quieres seguir jugando desde el principio? (SI/NO): ")) {
                    vidas = 3; // se reinician las vidas
                    System.out.println("\n🌄 Reemprendes tu viaje con fuerzas renovadas.\n");
                } else {
                    System.out.println("\n🏆 Has alcanzado la redención, " + jugador + ".");
                    System.out.println("Tu nombre será recordado en Vinland como el guerrero que halló la paz.");
                    seguirJugando = false;
                }
            }
        }

        System.out.println("\n=== FIN DEL JUEGO ===");
    }

    // === HISTORIA PRINCIPAL ===
    private static boolean historiaPrincipal(String jugador) {
        boolean terminado = false;

        while (!terminado) {
            mostrarOpcionesIniciales();
            int opcion = leerOpcionNumero(1, 5);

            switch (opcion) {
                case 1 -> { // Final malo
                    System.out.println("\nAtacas a los guardias del rey Canuto, ciego de ira.");
                    System.out.println("Tu furia te consume y tu destino se sella entre gritos de acero.");
                    asciiEspadas();
                    break;
                }

                case 2 -> { // Final bueno o malo
                    System.out.println("\nHuyes hacia el norte. La nieve cae sin cesar...");
                    System.out.println("Encuentras una granja abandonada con esclavos famélicos.");
                    System.out.println("1) Compartir tu comida");
                    System.out.println("2) Ignorarlos");
                    int eleccion = leerOpcionNumero(1, 2);
                    if (eleccion == 1) {
                        System.out.println("\nComparten contigo fuego y esperanza.");
                        System.out.println("FINAL BUENO: Has hallado compasión en medio del invierno.");
                        asciiFuego();
                        break;
                    } else {
                        System.out.println("\nPasas de largo... y mueres congelado solo.");
                        asciiCruz();
                        break;
                    }
                }

                case 3 -> { // Final bueno o malo
                    System.out.println("\nUn viajero te habla de una tierra sin guerras llamada Vinland.");
                    System.out.println("1) Seguirlo sin dudar");
                    System.out.println("2) Preguntarle quién es realmente");
                    int sub = leerOpcionNumero(1, 2);
                    if (sub == 1) {
                        System.out.println("\nEra un embaucador. Te vende como esclavo. FIN.");
                        break;
                    } else {
                        System.out.println("\nDice llamarse Einar, un antiguo esclavo libre. Te inspira esperanza.");
                        System.out.println("1) Acompañarlo");
                        System.out.println("2) Seguir tu camino solo");
                        int e2 = leerOpcionNumero(1, 2);
                        if (e2 == 1) {
                            System.out.println("\nEinar te enseña a cultivar la tierra. Aprendes el valor de la paz.");
                            System.out.println("FINAL BUENO: El trabajo y la amistad son tus nuevas armas.");
                            return true;
                        } else {
                            System.out.println("\nTe marchas solo... pero el vacío en tu pecho crece.");
                            break;
                        }
                    }
                }

                case 4 -> {
                    // Camino correcto (con acertijo)
                    return rutaCorrectaConPuzzle();
                }

                case 5 -> {
                    System.out.println("\nTe sientas frente al mar. El horizonte parece llamarte...");
                    System.out.println("1) Meditar sobre tus errores");
                    System.out.println("2) Lanzar una piedra al agua (volver al inicio sin perder vidas)");
                    int sub = leerOpcionNumero(1, 2);
                    if (sub == 1) {
                        System.out.println("\nLa calma te envuelve. FIN NEUTRO.");
                        return true;
                    } else {
                        System.out.println("\nEl sonido del agua te inspira a volver a empezar...");
                        return true; // sin penalizar (no se cuenta como final malo)
                    }
                }
            }
        }
        return false;
    }

    // === RUTA CORRECTA: incluye puzzle y 4 pasos ===
    private static boolean rutaCorrectaConPuzzle() {
        System.out.println("\nSigues el rastro de Leif Erikson...");
        System.out.println("Encuentras una puerta rúnica que bloquea el paso.");
        System.out.println("Para abrirla, debes resolver un acertijo.");

        if (!resolverAcertijo()) {
            System.out.println("\nLas runas brillan en rojo y el suelo tiembla...");
            System.out.println("Has fallado. La puerta se cierra y te hundes en la oscuridad.");
            return false;
        }

        System.out.println("\nLa puerta se abre con una luz dorada. Detrás, Leif te espera.");
        System.out.println("Te embarcas hacia Vinland. FIN BUENO: Has encontrado la paz.");
        asciiBarco();
        return true;
    }

    // === ACERTIJO ===
    private static boolean resolverAcertijo() {
        String respuestaCorrecta = "foca";
        int intentos = 3;

        System.out.println("\nAdivinanza:");
        System.out.println("\"Vivo en el agua y aplaudo sin manos. ¿Qué soy?\"");

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + " de " + intentos + ": ");
            String intento = sc.nextLine().trim().toLowerCase();
            if (intento.equals(respuestaCorrecta)) {
                System.out.println("✅ Correcto. Las runas se iluminan en azul.");
                return true;
            } else {
                System.out.println("❌ No es correcto.");
            }
        }
        return false;
    }

    // === UTILIDADES ===
    private static String pedirNombre() {
        String nombre;
        do {
            System.out.print("Introduce tu nombre de guerrero: ");
            nombre = sc.nextLine().trim();
        } while (nombre.isEmpty());
        return nombre;
    }

    private static boolean preguntaSiNo(String msg) {
        while (true) {
            System.out.print(msg);
            String r = sc.nextLine().trim().toUpperCase();
            if (r.equals("SI")) return true;
            if (r.equals("NO")) return false;
            System.out.println("Responde con SI o NO.");
        }
    }

    private static int leerOpcionNumero(int min, int max) {
         while (true) {
        String linea = sc.nextLine().trim();

        // Comprobamos que la línea contenga solo números
        boolean esNumero = true;
        for (int i = 0; i < linea.length(); i++) {
            if (!Character.isDigit(linea.charAt(i))) {
                esNumero = false;
                break;
            }
        }

        if (!esNumero || linea.isEmpty()) {
            System.out.print("No válido. Escribe un número: ");
            continue; // vuelve al inicio del bucle
        }

        int opcion = Integer.parseInt(linea); // ahora sí es seguro convertirlo

        if (opcion >= min && opcion <= max) {
            return opcion;
        } else {
            System.out.print("Número fuera de rango (" + min + "-" + max + "): ");
        }
    }
}
    private static void mostrarOpcionesIniciales() {
        System.out.println("\nElige tu siguiente acción:");
        System.out.println("1) Atacar a los guardias del Rey Canuto");
        System.out.println("2) Huir hacia el norte");
        System.out.println("3) Escuchar a un viajero sobre Vinland");
        System.out.println("4) Buscar la cabaña de Leif Erikson");
        System.out.println("5) Sentarte frente al mar");
    }

    // === ASCII ART ===
private static void asciiEspadas() {
    System.out.println(
        "               />_________________________________\n" +
        "      [########[]_________________________________>\n" +
        "               \\\n"
    );
}

private static void asciiCruz() {
    System.out.println(
        "              †\n" +
        "             / \\\\\\n" +
        "            /   \\\\\n"
    );
}

private static void asciiFuego() {
    System.out.println(
        "             (  )\n" +
        "              )(\n" +
        "             (  )\n" +
        "              )(\n"
    );
}

private static void asciiBarco() {
    System.out.println(
        "                     |    |    |\n" +
        "                    )_)  )_)  )_)\n" +
        "                   )___))___))___)\n" +
        "                  )____)____)_____) \n" +
        "             _____|____|____|____|_____\n" +
        "        ---------\\\\                   /---------\n" +
        "          ^^^^^ ^^^^^^^^^^^^^^^^^^^^^\n" +
        "               ^^^^      ^^^^     ^^^\n" +
        "                    ^^^^\n"
    );
}
}