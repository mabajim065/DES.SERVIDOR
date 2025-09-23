public class juego {

    // variables
    private String nombre;
    private int edadrecomendada = 0;
    private int duracion = 0;
    private float precio = 0.0f;

    // constructor vacio
    public juego() {
        this.nombre = "hundir la flota";
        this.edadrecomendada = 7;
        this.duracion = 30;
        this.precio = 19.99f;
    }

    // constructor con parametros
    /**
     * constructor que recibe todos los valores de las variables miembro de esta
     * clase y las asigna
     * 
     * @param nombre
     * @param edadrecomendada
     * @param duracion
     * @param precio
     */
    public juego(String nombre, int edadrecomendada, int duracion, float precio) {
        if (nombre.length() < 511 && !nombre.startsWith("!")) {
            this.nombre = nombre;
        }

        this.edadrecomendada = edadrecomendada;
        this.duracion = duracion;
        this.precio = precio;
    }
    // hacemos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadrecomendada() {
        return edadrecomendada;
    }

    public void setEdadrecomendada(int edadrecomendada) {
        this.edadrecomendada = edadrecomendada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // generamos los metodos toString
    @Override
    public String toString() {
        return "juego [nombre=" + nombre + ", edadrecomendada=" + edadrecomendada + ", duracion=" + duracion
                + ", precio=" + precio + "]";
    }
}
