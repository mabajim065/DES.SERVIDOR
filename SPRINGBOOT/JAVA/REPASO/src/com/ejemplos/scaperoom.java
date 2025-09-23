package com.ejemplos;

public class scaperoom extends juego {

    // variable miembro
    int tiempo = 0;
    int intentostotales = 0;
    List<puzzles> listapuzzles;

    // funcion que compruebe solucion
    /**
     * recoore todos los puzzles y comprueba que no se halla pasado de tiempo nide
     * intentos
     * 
     * @param solucion
     * @param index
     * @return
     */
    public boolean intentodesolucion(String solucion, int index) {
        boolean resuelto = false;
        if (index >= 0 && index < listapuzzles.size()) {
            puzzles puzzleactual = listapuzzles.get(index);
            if (puzzleactual.intentodesolucion(solucion)) {
                resuelto = true;
            }
        }
        return resuelto;
    }
}
