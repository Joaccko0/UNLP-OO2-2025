package main.java.ar.edu.unlp.info.oo2.file;

import java.time.LocalDate;

public interface FileComponent {

    public String prettyPrint();
    public String getNombre();
    public String getExtension();
    public int getSize();
    public LocalDate getCreacion();
    public LocalDate getModificacion();
    public String getPermisos();

}
