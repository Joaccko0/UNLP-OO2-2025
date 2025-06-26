package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {

    private DatabaseProxy proxy;

    @BeforeEach
    public void setUp() {
        DatabaseRealAccess realDb = new DatabaseRealAccess();
        this.proxy = new DatabaseProxy(realDb);
    }

    @Test
    public void testAccessWithoutAuthenticationThrowsException() {
        assertThrows(RuntimeException.class, () -> {
            proxy.getSearchResults("select * from comics where id=1");
        });

        assertThrows(RuntimeException.class, () -> {
            proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
        });
    }

    @Test
    public void testSuccessfulAuthenticationEnablesAccess() {
        proxy.checkAccess("admin123");

        Collection<String> result = proxy.getSearchResults("select * from comics where id=1");
        assertTrue(result.contains("Spiderman"));
        assertTrue(result.contains("Marvel"));
    }

    @Test
    public void testInsertAndRetrieveNewRow() {
        proxy.checkAccess("admin123");

        int newId = proxy.insertNewRow(List.of("Patoruzú", "La flor"));
        Collection<String> result = proxy.getSearchResults("select * from comics where id=" + newId);

        assertEquals(2, result.size());
        assertTrue(result.contains("Patoruzú"));
        assertTrue(result.contains("La flor"));
    }

    @Test
    public void testFailedAuthenticationPreventsAccess() {
        proxy.checkAccess("wrong-password");

        assertThrows(RuntimeException.class, () -> {
            proxy.getSearchResults("select * from comics where id=1");
        });
    }
}
