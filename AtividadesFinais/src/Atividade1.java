import java.util.ArrayList;

// Classe abstrata para representar um funcionário genérico
abstract class Funcionario {
    private String nome;
    private double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos abstratos a serem implementados pelas subclasses
    abstract void apagarTabelaBanco();
    abstract void subirParaProducao();
    abstract void desenvolverTelas();

    // Getters e setters encapsulados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

// Subclasse para representar um gerente
class Gerente extends Funcionario {
    private String departamento;

    // Construtor
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    // Implementação dos métodos abstratos
    @Override
    void apagarTabelaBanco() {
        System.out.println("Apagando tabela do banco (Gerente)");
    }

    @Override
    void subirParaProducao() {
        System.out.println("Subindo para produção (Gerente)");
    }

    @Override
    void desenvolverTelas() {
        System.out.println("Desenvolvendo telas (Gerente)");
    }
}

// Subclasse para representar um desenvolvedor
class Desenvolvedor extends Funcionario {
    private String linguagem;

    // Construtor
    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    // Implementação dos métodos abstratos
    @Override
    void apagarTabelaBanco() {
        System.out.println("Apagando tabela do banco (Desenvolvedor)");
    }

    @Override
    void subirParaProducao() {
        System.out.println("Subindo para produção (Desenvolvedor)");
    }

    @Override
    void desenvolverTelas() {
        System.out.println("Desenvolvendo telas (Desenvolvedor)");
    }
}

public class Atividade1 {
    public static void main(String[] args) {
        // Criando uma lista de funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando alguns funcionários à lista
        funcionarios.add(new Gerente("João", 5000.0, "TI"));
        funcionarios.add(new Desenvolvedor("Duda", 4000.0, "Front-End"));
        funcionarios.add(new Gerente("César", 6000.0, "Segurança Cibernética"));

        // Iterando sobre a lista e realizando operações comuns
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());

            // Operações específicas de cada tipo de funcionário
            funcionario.apagarTabelaBanco();
            funcionario.subirParaProducao();
            funcionario.desenvolverTelas();

            
        }
    }
}
