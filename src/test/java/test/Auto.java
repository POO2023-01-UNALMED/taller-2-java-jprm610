package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos() {
        return asientos.length;
    }

    String verificarIntegridad() {
        // Verificar registro del motor
        if (registro != motor.registro) {
            return "Las piezas no son originales";
        }
        
        // Verificar registros de los asientos
        for (Asiento asiento : asientos) {
            if (registro != asiento.registro) {
                return "Las piezas no son originales";
            }
        }

        return "Auto original";
    }
}