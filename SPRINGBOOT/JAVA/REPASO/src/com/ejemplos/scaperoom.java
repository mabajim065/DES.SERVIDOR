package com.ejemplos;

import java.util.List;

public class ScapeRoom extends Juego {

    int tiempoMaxTotal;
    int intentosTotales;
    List<Puzzle> listaPuzles;

    /**
     * Recorre todos los puzles y comprueba que no se haya
     * pasado de tiempo ni de intentos y esten todos resueltos
     * 
     * @return true si esta resuelto y false en caso contrario
     */

    boolean comprobarSolucion() {

        boolean resuelto = false;
        int sumatiempos = 0;

        for (Puzzle puzzle : listaPuzles) {
            // primero comprobamos que todos los puzzles estan resueltos
            // con que uno de los puzzles no este resuelto ya devolvemos false
            if (!puzzle.isResuelto()) {
                return false; // si alguno no esta resuelto devolvemos false
            }

            // si todos los puzzles estan resueltos comprobamos que no se haya
            // pasado de tiempo ni de intentos
            if (puzzle.isResuelto() || puzzle.getIntentos() < 0)
                return false; // si alguno no esta resuelto devolvemos false

            // vamos sumando todos los tiempos
            sumatiempos += puzzle.getTiempoTardado();

        }

        /*
         * una vez fuera del bucle , con la suma de todos los tiempos calculada
         * comprobamos si se ha pasado comparandola con el tiempo maximo
         */
        if (sumatiempos > this.tiempoMaxTotal)
            return false; // si se ha pasado de tiempo devolvemos false

        // si llega aqui es que se ha resuelto todo correctamente
        return true; // si todos estan resueltos devolvemos true
    }

    public boolean comprobrarSolucionStream() {

        boolean todosresueltos = listaPuzles.stream().allMatch(p -> p.isResuelto() && p.getIntentos() >= 0);
        // ahora igual pero con los intentos
        boolean todosConintentos = listaPuzles.stream().allMatch(p -> p.getIntentos() >= 0);

    }
}