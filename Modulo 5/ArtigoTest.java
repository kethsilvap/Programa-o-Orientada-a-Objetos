import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testCriarArtigo() {

        Autor autor = new Autor("Alan Turing", "Inglês", false);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void testAlterarPublicacao() {

        Autor autor = new Autor("Alan Turing", "Inglês", false);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", false);

        artigo.setPublicado(true);

        assertTrue(artigo.isPublicado());
    }
}