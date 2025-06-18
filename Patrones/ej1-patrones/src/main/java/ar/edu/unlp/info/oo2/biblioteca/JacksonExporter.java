package ar.edu.unlp.info.oo2.sueldos;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class JacksonExporter implements Exporter{

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public String exportar(List<Socio> socios) {
        try {
            // Serializa la lista de socios a JSON en formato pretty print
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(socios);
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }
    }

}
