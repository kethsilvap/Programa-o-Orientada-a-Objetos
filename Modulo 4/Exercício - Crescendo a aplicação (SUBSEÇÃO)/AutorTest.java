import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testAutorUsuario() {

        Autor autor = new Autor("Alan Turing", "Inglês", true);

        assertEquals("Alan Turing", autor.getNome());
        assertEquals("Inglês", autor.getNacionalidade());
        assertTrue(autor.isUsuario());
    }

    @Test
    public void testAlterarTipoAutor() {

        Autor autor = new Autor("Jess", "Brasileira", false);

        autor.setUsuario(true);

        assertTrue(autor.isUsuario());
    }
}