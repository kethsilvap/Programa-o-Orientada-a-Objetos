import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest {

    @Test
    public void testPublicacaoLivro() {

        Autor autor = new Autor("Alan Turing", "Inglês", true);

        EstrategiaPublicacao estrategia = new EstrategiaPublicacaoLivro();

        autor.setEstrategiaPublicacao(estrategia);

        assertNotNull(autor);
    }

    @Test
    public void testPublicacaoArtigo() {

        Autor autor = new Autor("Alan Turing", "Inglês", true);

        EstrategiaPublicacao estrategia = new EstrategiaPublicacaoArtigo();

        autor.setEstrategiaPublicacao(estrategia);

        assertNotNull(autor);
    }
}