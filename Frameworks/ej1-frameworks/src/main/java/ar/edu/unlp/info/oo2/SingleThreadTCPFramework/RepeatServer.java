package ar.edu.unlp.info.oo2.SingleThreadTCPFramework;

import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer {

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.trim().split("\\s+");

        // Validación mínima
        if (args.length < 2) {
            out.println("Error: Se requieren al menos 2 argumentos: string_a_repetir, cantidad, [delimitador]");
            return;
        }

        String stringARepetir = args[0];
        String cantidadStr = args[1];
        String delimitador = args.length >= 3 ? args[2] : " ";

        // Validación de string
        if (stringARepetir == null || stringARepetir.isEmpty()) {
            out.println("Error: El primer argumento (string a repetir) no puede estar vacío.");
            return;
        }

        int cantidad;
        try {
            cantidad = Integer.parseInt(cantidadStr);
            if(cantidad <= 0) {
                out.println("Error: La cantidad debe ser un número entero mayor a 0.");
                return;
            }
        } catch (NumberFormatException e) {
            out.println("Error: El segundo argumento debe ser un número entero.");
            return;
        }

        String resultado = stringARepetir;
        for (int i = 1; i < cantidad; i++) {
            resultado += delimitador + stringARepetir;
        }

        out.println(resultado);
    }

    public static void main(String[] args) {
        new RepeatServer().startLoop(args);
    }
}
