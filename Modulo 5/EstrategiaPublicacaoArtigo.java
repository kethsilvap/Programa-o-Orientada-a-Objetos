public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao {

    @Override
    public void publicar(String titulo) {
        System.out.println("Publicando artigo: " + titulo);
    }
}