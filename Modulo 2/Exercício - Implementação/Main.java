import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("Jessica Felix", 40);

        Livro livro = new Livro("Java for Beginners", "Tecnologia", autor);

        Usuario usuario = new Usuario("Lucas Oliveira", 28);

        Date retirada = new Date();
        Date devolucao = new Date();

        Emprestimo emprestimo1 = new Emprestimo(livro, usuario, retirada, devolucao);

        emprestimo1.realizarEmprestimo();

        Emprestimo emprestimo2 = new Emprestimo(livro, usuario, retirada, devolucao);

        emprestimo2.realizarEmprestimo();
    }
}