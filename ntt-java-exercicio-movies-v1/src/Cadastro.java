import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Filme> filmes = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar novo filme");
            System.out.println("2. Ver filmes cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    cadastrarFilme(scanner, filmes);
                    break;
                case 2:
                    if (filmes.isEmpty()) {
                        System.out.println("Nenhum filme cadastrado.");
                    } else {
                        System.out.println("\nFilmes cadastrados:");
                        for (Filme filme : filmes) {
                            System.out.println("Nome: " + filme.getNome());
                            filme.listarAtores();
                            filme.exibirDiretor();
                            filme.exibirInformacoesFilmagem();
                            System.out.println("Gênero: " + filme.getGenero());
                            System.out.println("Sinopse: " + filme.getSinopse());
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    public static void cadastrarFilme(Scanner scanner, List<Filme> filmes) {
        System.out.println("\nCadastro > Novo Filme");

        System.out.print("Informe o nome do filme: ");
        String nomeFilme = scanner.nextLine();

        System.out.print("Informe o nome do diretor: ");
        String nomeDiretor = scanner.nextLine();

        Date dataNascimentoDiretor = null;
        boolean dataNascimentoDiretorValida = false;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        while (!dataNascimentoDiretorValida) {
            try {
                System.out.print("Informe a data de nascimento do diretor (DD/MM/YYYY): ");
                String dataNascimentoDiretorStr = scanner.nextLine();
                dateFormat.setLenient(false);
                dataNascimentoDiretor = dateFormat.parse(dataNascimentoDiretorStr);
                dataNascimentoDiretorValida = true;
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Use o formato DD/MM/YYYY.");
            }
        }

        System.out.print("Informe a nacionalidade do diretor: ");
        String nacionalidadeDiretor = scanner.nextLine();

        System.out.print("Quantos atores deseja cadastrar? ");
        int numAtores = scanner.nextInt();
        scanner.nextLine();

        List<Ator> atores = new ArrayList<>();
        for (int i = 0; i < numAtores; i++) {
            System.out.print("Informe o nome do ator " + (i + 1) + ": ");
            String nomeAtor = scanner.nextLine();

            Date dataNascimentoAtor = null;
            boolean dataNascimentoAtorValida = false;
            while (!dataNascimentoAtorValida) {
                try {
                    System.out.print("Informe a data de nascimento do ator " + (i + 1) + " (DD/MM/YYYY): ");
                    String dataNascimentoAtorStr = scanner.nextLine();
                    dateFormat.setLenient(false);
                    dataNascimentoAtor = dateFormat.parse(dataNascimentoAtorStr);
                    dataNascimentoAtorValida = true;
                } catch (ParseException e) {
                    System.out.println("Formato de data inválido. Use o formato DD/MM/YYYY.");
                }
            }

            System.out.print("Informe a nacionalidade do ator " + (i + 1) + ": ");
            String nacionalidadeAtor = scanner.nextLine();

            atores.add(new Ator(nomeAtor, dataNascimentoAtor, nacionalidadeAtor));
        }

        System.out.print("Informe o endereço da gravação: ");
        String enderecoGravacao = scanner.nextLine();
        System.out.print("Informe o tempo de filmagem: ");
        String tempoFilmagem = scanner.nextLine();

        Date dataInicio = null;
        boolean dataInicioValida = false;
        while (!dataInicioValida) {
            try {
                System.out.print("Informe a data de início da filmagem (DD/MM/YYYY): ");
                String dataInicioStr = scanner.nextLine();
                dataInicio = dateFormat.parse(dataInicioStr);
                dataInicioValida = true;
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Use o formato DD/MM/YYYY.");
            }
        }

        Date dataFim = null;
        boolean dataFimValida = false;
        while (!dataFimValida) {
            try {
                while (true) {
                    System.out.print("Informe a data de fim da filmagem (DD/MM/YYYY): ");
                    String dataFimStr = scanner.nextLine();
                    dataFim = dateFormat.parse(dataFimStr);
                    if (dataFim.after(dataInicio) || dataFim.equals(dataInicio)) {
                        dataFimValida = true;
                        break;
                    } else {
                        System.out.println("A data de fim da filmagem não pode ser anterior à data de início.");
                    }
                }
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Use o formato DD/MM/YYYY.");
            }
        }

        System.out.print("Informe o gênero do filme: ");
        String genero = scanner.nextLine();
        System.out.print("Informe a sinopse do filme: ");
        String sinopse = scanner.nextLine();

        Filme filme = new Filme(nomeFilme, nomeDiretor, dataNascimentoDiretor, nacionalidadeDiretor, atores, enderecoGravacao, tempoFilmagem, dataInicio, dataFim, genero, sinopse);
        filmes.add(filme);

        System.out.println("Filme cadastrado com sucesso!");
    }
}
