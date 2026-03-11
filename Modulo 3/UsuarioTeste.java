import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testCriarUsuario() {

        Usuario usuario = new Usuario("Gabriel", 21);

        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSetNome() {

        Usuario usuario = new Usuario("Gabriel", 21);
        usuario.setNome("Carlos");

        assertEquals("Carlos", usuario.getNome());
    }

    @Test
    public void testSetIdade() {

        Usuario usuario = new Usuario("Gabriel", 21);
        usuario.setIdade(30);

        assertEquals(30, usuario.getIdade());
    }
}