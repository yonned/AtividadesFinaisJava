import java.util.ArrayList;

// Classe abstrata para representar um contato genérico
abstract class Contato {
    private String nome;
    private String telefone;

    // Construtor
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Métodos abstratos a serem implementados pelas subclasses
    abstract void exibirDetalhes();

    // Getters e setters encapsulados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

// Subclasse para representar um contato pessoal
class ContatoPessoal extends Contato {
    private String aniversario;

    // Construtor
    public ContatoPessoal(String nome, String telefone, String aniversario) {
        super(nome, telefone);
        this.aniversario = aniversario;
    }

    // Implementação do método abstrato
    @Override
    void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Aniversário: " + aniversario);
    }
}

// Subclasse para representar um contato profissional
class ContatoProfissional extends Contato {
    private String empresa;

    // Construtor
    public ContatoProfissional(String nome, String telefone, String empresa) {
        super(nome, telefone);
        this.empresa = empresa;
    }

    // Implementação do método abstrato
    @Override
    void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Empresa: " + empresa);
    }
}

public class Atividade4 {
    public static void main(String[] args) {
        // Criando uma lista de contatos
        ArrayList<Contato> contatos = new ArrayList<>();

        // Adicionando alguns contatos à lista
        contatos.add(new ContatoPessoal("João", "123456789", "01/01/1990"));
        contatos.add(new ContatoProfissional("Maria", "987654321", "Empresa XYZ"));
        contatos.add(new ContatoPessoal("Carlos", "555555555", "15/07/1985"));

        // Iterando sobre a lista e exibindo detalhes dos contatos
        for (Contato contato : contatos) {
            contato.exibirDetalhes();
            System.out.println("-----------");
        }
    }
}
