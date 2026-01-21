# Vinland Saga - Proyectos de videojuego

Este repositorio contiene **dos versiones** de un juego narrativo en consola inspirado en *Vinland Saga*. Cada proyecto propone decisiones que llevan a finales buenos, neutros o malos, con el objetivo de explorar la redención de Thorfinn.

## Proyecto_videojuego_1

**Qué es:**
Un juego de decisiones por texto (sin sistema de vidas) donde eliges acciones y el juego termina al llegar a un final. Incluye una ruta correcta en cuatro pasos con una prueba numérica.

**Cómo se juega / ganar:**
- El menú principal ofrece 5 rutas. Varias llevan a finales malos o neutros, y puedes volver atrás en algunos puntos.
- La ruta considerada “correcta” es **Buscar la cabaña de Leif Erikson** (opción 4), que abre una secuencia de 4 pasos.
- Para ganar el final bueno en esa ruta:
  1. Interpreta las runas.
  2. Limpia el barco.
  3. Escucha a Leif con respeto.
  4. En el acertijo numérico (1–10), introduce un número **mayor o igual que 5**.

**Fin del proyecto:**
Guiar a Thorfinn hacia la paz interior y el viaje a Vinland, explorando la redención a través de decisiones y consecuencias.

## Proyecto_videojuego_2

**Qué es:**
Una versión más completa del juego, con **nombre del jugador**, **sistema de vidas (3)**, rutas con finales buenos/malos, y arte ASCII. Incluye una ruta correcta con acertijo.

**Cómo se juega / ganar:**
- Tienes 3 vidas. Un final malo consume una vida y reinicia la historia.
- Se considera “ganar” cuando llegas a un final bueno o neutral (no pierdes vidas) y decides no reiniciar.
- Principales rutas ganadoras:
  - **Ruta 4 (Leif Erikson):** resuelve el acertijo de la puerta con la respuesta **“foca”** en hasta 3 intentos.
  - **Ruta 2 (huida al norte):** comparte tu comida con los esclavos.
  - **Ruta 3 (viajero):** pregunta quién es → acompáñalo (Einar).
  - **Ruta 5 (mar):** meditar o lanzar la piedra lleva a un cierre pacífico sin perder vidas.

**Fin del proyecto:**
Refinar la experiencia de la historia con más rejugabilidad, un sistema de vidas y un cierre que premie la compasión y la búsqueda de paz.

## Ejecución (opcional)

Cada proyecto es un proyecto Java (NetBeans/Ant). Puedes abrir la carpeta correspondiente y ejecutar la clase `Proyecto_videojuego_1` desde el IDE.

- `Proyecto_videojuego_1/src/proyecto_videojuego_1/Proyecto_videojuego_1.java`
- `Proyecto_videojuego_2/src/proyecto_videojuego_1/Proyecto_videojuego_1.java`
