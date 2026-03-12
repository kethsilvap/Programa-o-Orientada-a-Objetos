import java.util.Date;

public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private Date dataRetirada;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, Date dataRetirada, Date dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public void realizarEmprestimo() {

        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
        } else {
            livro.setDisponivel(false);

            System.out.println("Livro: " + livro.getTitulo());
            System.out.println();
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println();
            System.out.println("Genero: " + livro.getGenero());
            System.out.println();
            System.out.println("Usuario: " + usuario.getNome());
            System.out.println();
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println();
            System.out.println("Data de Retirada: " + dataRetirada);
            System.out.println();
            System.out.println("Data de Devolucao: " + dataDevolucao);
        }
    }
}