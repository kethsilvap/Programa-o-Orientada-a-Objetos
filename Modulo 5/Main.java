public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("Alan Turing", "Inglês", true);

        EstrategiaPublicacao estrategiaLivro = new EstrategiaPublicacaoLivro();
        EstrategiaPublicacao estrategiaArtigo = new EstrategiaPublicacaoArtigo();

        autor.setEstrategiaPublicacao(estrategiaLivro);
        autor.publicar();

        autor.setEstrategiaPublicacao(estrategiaArtigo);
        autor.publicar();
    }
}