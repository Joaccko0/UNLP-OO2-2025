package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{

    private boolean authenticated;
    private DatabaseRealAccess realDatabase;

    public DatabaseProxy(DatabaseRealAccess database) {
        this.realDatabase = database;
        this.authenticated = false;
    }

    public void checkAccess(String pass) {
        if("admin123".equals(pass)) {
            this.authenticated = true;
        }
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if(!this.authenticated) {
            throw new RuntimeException("Acceso Denegado");
        }
        return this.realDatabase.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if(!this.authenticated) {
            throw new RuntimeException("Acceso Denegado");
        }
        return this.realDatabase.insertNewRow(rowData);
    }
}
