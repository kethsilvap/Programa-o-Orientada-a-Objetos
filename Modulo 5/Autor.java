public class Autor extends Pessoa implements PublicavelInterface {

    private String nacionalidade;
    private boolean usuario;
    private EstrategiaPublicacao estrategiaPublicacao;

    public Autor(String nome, String nacionalidade, boolean usuario) {
        super(nome, 0);
        this.nacionalidade = nacionalidade;
        this.usuario = usuario;
    }

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    @Override
    public void publicar() {

        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar(this.getNome());
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public boolean isUsuario() {
        return usuario;
    }
}