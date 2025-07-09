package ar.edu.unlp.info.oo2.SingleThreadTCPFramework;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer{
    private Random random = new Random();

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.trim().split("\\s+");

        if (args.length != 3) {
            out.println("Error: Debes enviar exactamente 3 argumentos: letras, números, especiales");
            return;
        }

        String letras = args[0];
        String numeros = args[1];
        String especiales = args[2];

        if (letras.isEmpty() || numeros.isEmpty() || especiales.isEmpty()) {
            out.println("Error: Ninguno de los conjuntos puede estar vacío.");
            return;
        }

        String password = generarPassword(letras, numeros, especiales);
        out.println(password);
    }

    private String generarPassword(String letras, String numeros, String especiales) {
        List<Character> passwordChars = new ArrayList<>();

        // Agregar un número obligatorio
        passwordChars.add(randomCharFrom(numeros));

        // Agregar un caracter especial obligatorio
        passwordChars.add(randomCharFrom(especiales));

        // Rellenar con letras hasta completar 8 caracteres
        for (int i = 0; i < 6; i++) {
            passwordChars.add(randomCharFrom(letras));
        }

        // Mezclar los caracteres para que no estén siempre en el mismo orden
        Collections.shuffle(passwordChars);

        // Convertir a string
        StringBuilder sb = new StringBuilder();
        for (char c : passwordChars) {
            sb.append(c);
        }
        return sb.toString();
    }

    private char randomCharFrom(String s) {
        return s.charAt(this.random.nextInt(s.length()));
    }

    public static void main(String[] args) {
        new PasswordServer().startLoop(args);
    }
}
