import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Filme {
    private String nome;
    private String nomeDiretor;
    private Date dataNascimentoDiretor;
    private String nacionalidadeDiretor;
    private List<Ator> atores;
    private String enderecoGravacao;
    private String tempoFilmagem;
    private Date dataInicio;
    private Date dataFim;
    private String genero;
    private String sinopse;

    public Filme(String nome, String nomeDiretor, Date dataNascimentoDiretor, String nacionalidadeDiretor, List<Ator> atores, String enderecoGravacao, String tempoFilmagem, Date dataInicio, Date dataFim, String genero, String sinopse) {
        this.nome = nome;
        this.nomeDiretor = nomeDiretor;
        this.dataNascimentoDiretor = dataNascimentoDiretor;
        this.nacionalidadeDiretor = nacionalidadeDiretor;
        this.atores = atores;
        this.enderecoGravacao = enderecoGravacao;
        this.tempoFilmagem = tempoFilmagem;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.genero = genero;
        this.sinopse = sinopse;
    }

    public void listarAtores() {
        System.out.println("Atores:");
        for (Ator ator : atores) {
            System.out.println("- " + ator.getNome() + " (Data de Nascimento: " + formatDate(ator.getDataNascimento()) + ", Nacionalidade: " + ator.getNacionalidade() + ")");
        }
    }

    public void exibirDiretor() {
        System.out.println("Nome do Diretor: " + nomeDiretor + " (Data de Nascimento: " + formatDate(dataNascimentoDiretor) + ", Nacionalidade: " + nacionalidadeDiretor + ")");
    }

    public void exibirInformacoesFilmagem() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Endereço da Gravação: " + enderecoGravacao);
        System.out.println("Tempo de Filmagem: " + tempoFilmagem);
        System.out.println("Data de Início: " + dateFormat.format(dataInicio));
        System.out.println("Data de Fim: " + dateFormat.format(dataFim));
    }

    private String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopse() {
        return sinopse;
    }
}
