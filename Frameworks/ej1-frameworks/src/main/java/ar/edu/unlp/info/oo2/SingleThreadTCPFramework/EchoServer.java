package ar.edu.unlp.info.oo2.SingleThreadTCPFramework;

import java.io.PrintWriter;
import java.net.Socket;

public class EchoServer extends SingleThreadTCPServer {
   
    public void handleMessage(String message, PrintWriter out) {
        out.println(message);
    }

    public static void main(String[] args) {

        new EchoServer().startLoop(args);

    }

    @Override
    protected void onMessageReceived(String inputLine, Socket clientSocket) {
        System.out.println("Mensaje interceptado por hook: " + inputLine);
    }

    @Override
    protected boolean isCloseCommand(String inputLine) {
        return inputLine.equalsIgnoreCase("chau");
    }

}