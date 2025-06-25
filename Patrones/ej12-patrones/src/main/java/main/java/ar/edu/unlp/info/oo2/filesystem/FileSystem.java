package main.java.ar.edu.unlp.info.oo2.filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileSystem {

    private Directorio directorioBase;

    public FileSystem() {
        this.directorioBase = new Directorio("DirectorioBase", LocalDate.now());
    }

    public void agregarElemento(Elemento elemento) {
        this.directorioBase.agregarElemento(elemento);
    }

    //Retorna el espacio total ocupado, incluyendo todo su contenido.
    public int tamanoTotalOcupado() {
        return this.directorioBase.getTamanio();
    }

    //Retorna el archivo con mayor cantidad de bytes en cualquier nivel del filesystem
    public Archivo archivoMasGrande() {
        return this.directorioBase.archivoMasGrande();
    }

    //Retorna el archivo con fecha de creación más reciente en cualquier nivel del filesystem
    public Archivo archivoMasNuevo() {
        return this.directorioBase.archivoMasNuevo();
    }

    //Retorna el primer elemento con el nombre solicitado contenido en cualquier nivel del filesystem
    public Elemento buscar(String nombre) {
        return this.directorioBase.buscar(nombre);
    }

    //Retorna la lista con los elementos que coinciden con el nombre solicitado contenido en cualquier nivel del filesystem
    public List<Elemento> buscarTodos(String nombre) {
        List<Elemento> elementos = new ArrayList<Elemento>();
        this.directorioBase.buscarPorNombreLista(nombre, elementos);
        return elementos;
    }

    /*Retorna un String con los nombres de los elementos contenidos en todos los niveles del filesystem. De cada elemento
    debe retornar el path completo*/
    public String listadoDeContenido() {
        return this.directorioBase.listadoDeContenido("/");
    }
}
