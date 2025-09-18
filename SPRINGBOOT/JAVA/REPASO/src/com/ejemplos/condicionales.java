public class condicionales {
    public static void main(String[] args) throws Exception {
        int edad = 18;
        String marca = "Ford";
        float potencia = 200f;

        // Solo podra conducir si es mayor de edad y el coche es de menos de 140 cv
        if (edad >= 18 || marca == "peugout" && potencia < 140) {
            System.out.println("Enhorabuena puedes conducir" + marca);
        } else {
            // la x: es como si no existiera , similar a un comentario
            System.out.println("No puedes conducir");

            int dia = 5;

            switch (dia) {
                case 1:
                    System.out.println("lunes");
                    break;
                case 2:
                    System.out.println("martes");
                    break;
                case 3:
                    System.out.println("miercoles");
                    break;
                case 4:
                    System.out.println("jueves");
                    break;
                default:
                    System.out.println("fiestaaaa");
                    break;
            }
        }
    }
}
