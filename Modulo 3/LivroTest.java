import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    public void testLivroDisponivel() {

        Autor autor = new Autor("Jess", "Brasileira");

        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testGetTitulo() {

        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);

        assertEquals("Java Basico", livro.getTitulo());
    }

    @Test
    public void testGetGenero() {

        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);

        assertEquals("tecnologia", livro.getGenero());
    }

    @Test
    public void testGetAutor() {

        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);

        assertEquals("Jess", livro.getAutor().getNome());
    }
}