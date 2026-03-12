public class EstrategiaPublicacaoLivro implements EstrategiaPublicacao {

    @Override
    public void publicar(String titulo) {
        System.out.println("Publicando livro: " + titulo);
    }
}