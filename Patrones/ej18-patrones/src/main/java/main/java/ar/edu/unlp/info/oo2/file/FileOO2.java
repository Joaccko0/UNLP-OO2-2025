package main.java.ar.edu.unlp.info.oo2.file;

import java.time.LocalDate;

public class FileOO2 implements FileComponent{

    private String nombre;
    private String extension;
    private int size;
    private LocalDate creacion;
    private LocalDate modificacion;
    private String permisos;

    public FileOO2(String nombre, String extension, int size, LocalDate creacion, LocalDate modificacion, String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.size = size;
        this.creacion = creacion;
        this.modificacion = modificacion;
        this.permisos = permisos;
    }

    @Override
    public String prettyPrint() {
        return this.getNombre();
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getExtension() {
        return this.extension;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public LocalDate getCreacion() {
        return this.creacion;
    }

    @Override
    public LocalDate getModificacion() {
        return this.modificacion;
    }

    @Override
    public String getPermisos() {
        return this.permisos;
    }
}
