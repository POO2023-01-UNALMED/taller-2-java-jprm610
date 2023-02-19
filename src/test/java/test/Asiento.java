package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    void cambiarColor(String color) {
        // Verificar si el color ingresado como parametro es uno de los colores permitidos.
        String[] colors = {"rojo", "verde", "amarillo", "negro", "blanco"};
        boolean validColor = false;
        for (String s : colors) {
            if (color.equals(s)) {
                validColor = true;
            }
        }

        // Si es un color permitido, cambiar el color del asiento.
        if (validColor) {
            this.color = color;
        }
    }
}
