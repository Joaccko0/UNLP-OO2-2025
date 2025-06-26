package main.java.ar.edu.unlp.info.oo2.file;

public class PermisosDecorator extends FileDecorator{
    public PermisosDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return this.component.prettyPrint() + " - " + this.getPermisos();
    }
}
