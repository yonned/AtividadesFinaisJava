import java.util.ArrayList;

// Classe abstrata para representar um produto genérico
abstract class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos abstratos a serem implementados pelas subclasses
    abstract void ligar();
    abstract void conectarWifi();

    // Getters e setters encapsulados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

// Subclasse para representar um produto eletrônico
class Eletronico extends Produto {
    private String marca;

    // Construtor
    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    // Implementação dos métodos abstratos
    @Override
    void ligar() {
        System.out.println("Ligando o produto eletrônico");
    }

    @Override
    void conectarWifi() {
        System.out.println("Conectando o produto eletrônico ao Wi-Fi");
    }
}

// Subclasse para representar um produto de roupa
class Roupa extends Produto {
    private String tamanho;

    // Construtor
    public Roupa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    // Implementação dos métodos abstratos
    @Override
    void ligar() {
        System.out.println("Não é possível ligar uma peça de roupa");
    }

    @Override
    void conectarWifi() {
        System.out.println("Este produto não suporta Wi-Fi");
    }
}

public class Atividade2 {
    public static void main(String[] args) {
        // Criando uma lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        // Adicionando alguns produtos à lista
        produtos.add(new Eletronico("Smartphone", 1500.0, "Samsung"));
        produtos.add(new Roupa("Camiseta", 30.0, "M"));
        produtos.add(new Eletronico("Notebook", 2500.0, "Dell"));

        // Iterando sobre a lista e realizando operações comuns
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());

            // Operações específicas de cada tipo de produto
            produto.ligar();
            produto.conectarWifi();

            
        }
    }
}
