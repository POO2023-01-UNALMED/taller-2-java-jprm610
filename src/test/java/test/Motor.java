package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    void asignarTipo(String tipo) {
        // Verificar si el tipo ingresado como parámetro es uno de los tipos permitidos.
        String[] tipos = {"electrico", "gasolina"};
        boolean validTipo = false;
        for (String s : tipos) {
            if (tipo.equals(s)) {
                validTipo = true;
            }
        }

        // Si es un tipo permitido, cambiar el tipo del motor.
        if (validTipo) {
            this.tipo = tipo;
        }
    }
}
