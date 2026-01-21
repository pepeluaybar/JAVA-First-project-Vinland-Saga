/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videojuego_1;

import java.util.Scanner;

public class Proyecto_videojuego_1 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== VINLAND SAGA: CAMINOS DE REDENCIÓN ===");
        System.out.println("Eres Thorfinn, hijo de Thors, el guerrero que renunció a la violencia.");
        System.out.println("Tras la muerte de Askeladd, buscas sentido en un mundo dominado por la guerra...");
        System.out.println("Elige con números y pulsa Enter para decidir tu destino.");
        historiaPrincipal();
    }

    private static void historiaPrincipal() {
        boolean terminado = false;
        while (!terminado) {
            // MOSTRAR OPCIONES INICIALES
            mostrarOpcionesIniciales(); 
            int opcion = leerOpcionNumero(1, 5);

            switch (opcion) {
                case 1 -> {
                    System.out.println("\nAtacas a los guardias del rey Canuto, ciego de ira.");
                    System.out.println("Tus dagas cortan el aire, pero tu alma se hunde más en la oscuridad.");
                    System.out.println("1) Seguir luchando");
                    System.out.println("2) Detenerte y rendirte");
                    System.out.println("9) Volver atrás");
                    int sub = leerOpcionNumero(1, 9);
                    switch (sub) {
                        case 1 -> {
                            System.out.println("\nTe lanzas contra ellos... y uno de tus antiguos camaradas te atraviesa el pecho.");
                            System.out.println("FINAL: Has muerto siguiendo la senda del odio.");
                            terminado = true;
                        }
                        case 2 -> {
                            System.out.println("\nDejas caer tu espada. Te apresan, pero por primera vez sientes paz.");
                            System.out.println("FINAL NEUTRO: A veces rendirse es comenzar de nuevo.");
                            terminado = true;
                        }
                        case 9 -> {
                            continue; // volver al inicio del while
                        }
                    }
                }

                case 2 -> {
                    System.out.println("\nHuyes hacia el norte. La nieve cae sin cesar.");
                    System.out.println("1) Buscar refugio en una granja abandonada");
                    System.out.println("2) Seguir caminando hasta el amanecer");
                    System.out.println("9) Volver atrás");
                    int sub = leerOpcionNumero(1, 9);

                    switch (sub) {
                        case 1 -> {
                            System.out.println("\nEncuentras una granja, pero dentro hay esclavos famélicos.");
                            System.out.println("1) Compartir tu comida");
                            System.out.println("2) Ignorarlos");
                            System.out.println("9) Volver atrás");
                            int eleccion = leerOpcionNumero(1, 9);
                            switch (eleccion) {
                                case 1 -> {
                                    System.out.println("\nCompartes lo poco que tienes. Ellos te salvan del frío.");
                                    System.out.println("FINAL BUENO (alternativo): Has hallado compasión en medio del invierno.");
                                    terminado = true;
                                }
                                case 2 -> {
                                    System.out.println("\nPasas de largo... y mueres congelado solo.");
                                    System.out.println("FINAL MALO: La indiferencia también mata.");
                                    terminado = true;
                                }
                                case 9 -> {
                                    continue; // volver al inicio del while
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("\nEl frío te vence antes de ver el amanecer. FIN.");
                            terminado = true;
                        }
                        case 9 -> {
                            continue; // volver al inicio del while
                        }
                    }
                }

                case 3 -> {
                    System.out.println("\nUn viajero te habla de una tierra sin guerras llamada Vinland.");
                    System.out.println("1) Seguirlo sin dudar");
                    System.out.println("2) Preguntarle quién es realmente");
                    System.out.println("9) Volver atrás");
                    int sub = leerOpcionNumero(1, 9);
                    switch (sub) {
                        case 1 -> {
                            System.out.println("\nEra un embaucador. Te vende como esclavo. FIN.");
                            terminado = true;
                        }
                        case 2 -> {
                            System.out.println("\nDice llamarse Einar, un antiguo esclavo libre. Te inspira esperanza.");
                            System.out.println("1) Acompañarlo");
                            System.out.println("2) Seguir tu camino solo");
                            System.out.println("9) Volver atrás");
                            int eleccion = leerOpcionNumero(1, 9);
                            switch (eleccion) {
                                case 1 -> {
                                    System.out.println("\nEinar te enseña a cultivar la tierra. Aprendes el valor de la paz.");
                                    System.out.println("FINAL: El trabajo y la amistad son tus nuevas armas.");
                                    terminado = true;
                                }
                                case 2 -> {
                                    System.out.println("\nTe marchas solo... pero el vacío en tu pecho crece.");
                                    System.out.println("FINAL MALO: La soledad no redime, solo consume.");
                                    terminado = true;
                                }
                                case 9 -> {
                                    continue; // volver al inicio del while
                                }
                            }
                        }
                        case 9 -> {
                            continue; // volver al inicio del while
                        }
                    }
                }

                case 4 -> {
                    // La función manejará su propio "terminado" o "volver atrás"
                    if (rutaCorrectaCuatroPasos()) {
                        terminado = true; // Si rutaCorrectaCuatroPasos devuelve true, termina el juego.
                    } else {
                        continue; // Si devuelve false (por Volver Atrás), vuelve al menú principal
                    }
                }

                case 5 -> {
                    System.out.println("\nTe sientas frente al mar. El horizonte parece llamarte...");
                    System.out.println("1) Meditar sobre tus errores");
                    System.out.println("2) Lanzar una piedra al agua");
                    System.out.println("9) Volver atrás");
                    int sub = leerOpcionNumero(1, 9);
                    switch (sub) {
                        case 1 -> {
                            System.out.println("\nSientes una calma profunda. El ciclo de odio se disuelve por un instante.");
                            System.out.println("FINAL NEUTRO: La paz interior es también una forma de victoria.");
                            terminado = true;
                        }
                        case 2 -> {
                            System.out.println("\nEl sonido del agua te devuelve recuerdos... decides levantarte y seguir.");
                            continue; // vuelve al inicio del while
                        }
                        case 9 -> {
                            continue; // vuelve al inicio del while
                        }
                    }
                }
            }
        }
    }

    // Camino correcto: búsqueda de Leif y Vinland. Retorna true si termina el juego, false si regresa.
    private static boolean rutaCorrectaCuatroPasos() {
        System.out.println("\nTe diriges a la vieja cabaña de Leif Erikson, tu viejo amigo.");
        System.out.println("Dentro hay una nota con runas grabadas en madera: 'Solo quien conoce la paz cruzará el mar'.");
        System.out.println("1) Interpretar las runas");
        System.out.println("2) Ignorarlas y seguir buscando pistas");
        System.out.println("9) Volver atrás");
        int p1 = leerOpcionNumero(1, 9);

        if (p1 == 9) return false; // Volver al menú principal

        switch (p1) {
            case 1 -> {
                System.out.println("\nLas runas te llevan a un muelle abandonado. Hay un barco cubierto por nieve.");
                System.out.println("1) Limpiar el barco");
                System.out.println("2) Buscar a Leif cerca del puerto");
                System.out.println("9) Volver atrás");
                int p2 = leerOpcionNumero(1, 9);
                
                if (p2 == 9) return false; // Volver al menú principal

                switch (p2) {
                    case 1 -> {
                        System.out.println("\nMientras limpias el barco, encuentras una figura tallada: una cruz nórdica.");
                        System.out.println("Un anciano se acerca: es Leif.");
                        System.out.println("1) Escucharlo con respeto");
                        System.out.println("2) Preguntarle sobre Vinland con impaciencia");
                        System.out.println("9) Volver atrás");
                        int p3 = leerOpcionNumero(1, 9);

                        if (p3 == 9) return false; // Volver al menú principal

                        switch (p3) {
                            case 1 -> {
                                System.out.println("\nLeif sonríe: 'Vinland no es solo una tierra, Thorfinn. Es lo que llevas dentro.'");
                                System.out.println("Introduce un número entre 1 y 10: Leif te prueba con un acertijo numérico.");
                                int num = leerNumeroCualquiera();

                                if (num < 5) {
                                    System.out.println("\nLeif niega con la cabeza: 'Aún te falta paciencia, hijo de Thors.'");
                                    System.out.println("FINAL: Aprendizaje fallido. Pero el viaje continúa...");
                                    return true;
                                } else {
                                    System.out.println("\nLeif asiente: 'Has aprendido lo esencial: contener la espada y abrir el corazón.'");
                                    System.out.println("FINAL BUENO: Thorfinn se embarca hacia Vinland, guiado por la paz.");
                                    return true;
                                }
                            }
                            case 2 -> {
                                System.out.println("\nTu impaciencia ofende a Leif. Se marcha en silencio.");
                                System.out.println("FINAL: Sin guía, pierdes el rumbo en el mar helado.");
                                return true;
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("\nBuscas por horas, pero el puerto está vacío. Pierdes la esperanza. FIN.");
                        return true;
                    }
                }
            }
            case 2 -> {
                System.out.println("\nTe alejas sin entender las runas... y el mar se cierra a tu destino. FIN.");
                return true;
            }
        }
        return false; // Por si acaso, si no se ha terminado o regresado, vuelvo al menú.
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
        }
    }

    private static int leerNumeroCualquiera() {
        // código original de leerNumeroCualquiera
         while (true) {
            String linea = sc.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.print("No es un número válido. Intenta otra vez: ");
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
}


                
               
    
    

