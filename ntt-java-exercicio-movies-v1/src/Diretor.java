import java.util.Date;

public class Diretor {
    private String nome;
    private Date dataNascimento;
    private String nacionalidade;

    public Diretor(String nome, Date dataNascimento, String nacionalidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}
