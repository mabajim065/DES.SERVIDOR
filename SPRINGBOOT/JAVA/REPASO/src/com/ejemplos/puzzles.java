public class puzzles {

    int dificultad = 0;
    String instrucciones = "";
    boolean resuelto;
    String solucion = "";
    int intentos = 0;
    int tiempotardado = 0;

    // constructor vacio
    public puzzles() {
        this.dificultad = 1;
        this.instrucciones = "resuelve el puzzle";
        this.resuelto = false;
        this.solucion = "solucion";
    }

    // constructor con parametros
    public puzzles(int dificultad, String instrucciones, String solucion) {
        this.dificultad = dificultad;
        this.instrucciones = instrucciones;
        this.resuelto = false;
        this.solucion = solucion;
    }

    // hacemos los getters y setters
    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getTiempotardado() {
        return tiempotardado;
    }

    public void setTiempotardado(int tiempotardado) {
        this.tiempotardado = tiempotardado;
    }
    // metodo que recibe un intento de solucion y devuelve true si es correcta o
    // false si no lo es

    public boolean intentodesolucion(String intento) {
        if (intento.equalsIgnoreCase(this.solucion)) {
            this.resuelto = true;
        } else {
            this.resuelto = false;
        }
        return this.resuelto;
    }
    // si falla al intentar solucionarlo le quitamos un intento
    public void fallodeintento() {
        if (this.intentos > 0) {
            this.intentos--;
        }
    }   else {
            System.out.println("no te quedan intentos");
        }
    }
