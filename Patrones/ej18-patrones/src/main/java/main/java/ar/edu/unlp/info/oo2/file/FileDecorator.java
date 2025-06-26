package main.java.ar.edu.unlp.info.oo2.file;

import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent{

    protected FileComponent component;

    public FileDecorator(FileComponent component) {
        this.component = component;
    }

    @Override
    public String prettyPrint() {
        return this.component.prettyPrint();
    }

    @Override
    public String getNombre() {
        return this.component.getNombre();
    }

    @Override
    public String getExtension() {
        return this.component.getExtension();
    }

    @Override
    public int getSize() {
        return this.component.getSize();
    }

    @Override
    public LocalDate getCreacion() {
        return this.component.getCreacion();
    }

    @Override
    public LocalDate getModificacion() {
        return this.component.getModificacion();
    }

    @Override
    public String getPermisos() {
        return this.component.getPermisos();
    }
}
