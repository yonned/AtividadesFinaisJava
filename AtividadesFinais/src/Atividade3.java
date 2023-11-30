import java.util.ArrayList;

// Classe abstrata para representar um veículo genérico
abstract class Veiculo {
    private String modelo;
    private String placa;

    // Construtor
    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    // Métodos abstratos a serem implementados pelas subclasses
    abstract void acelerar();
    abstract void frear();

    // Getters e setters encapsulados
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}

// Subclasse para representar um carro
class Carro extends Veiculo {
    private int numPortas;

    // Construtor
    public Carro(String modelo, String placa, int numPortas) {
        super(modelo, placa);
        this.numPortas = numPortas;
    }

    // Implementação dos métodos abstratos
    @Override
    void acelerar() {
        System.out.println("Acelerando o carro");
    }

    @Override
    void frear() {
        System.out.println("Freando o carro");
    }
}

// Subclasse para representar uma moto
class Moto extends Veiculo {
    private boolean possuiBau;

    // Construtor
    public Moto(String modelo, String placa, boolean possuiBau) {
        super(modelo, placa);
        this.possuiBau = possuiBau;
    }

    // Implementação dos métodos abstratos
    @Override
    void acelerar() {
        System.out.println("Acelerando a moto");
    }

    @Override
    void frear() {
        System.out.println("Freando a moto");
    }
}

// Subclasse para representar um caminhão
class Caminhao extends Veiculo {
    private int capacidadeCarga;

    // Construtor
    public Caminhao(String modelo, String placa, int capacidadeCarga) {
        super(modelo, placa);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Implementação dos métodos abstratos
    @Override
    void acelerar() {
        System.out.println("Acelerando o caminhão");
    }

    @Override
    void frear() {
        System.out.println("Freando o caminhão");
    }
}

public class Atividade3 {
    public static void main(String[] args) {
        // Criando uma lista de veículos
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        // Adicionando alguns veículos à lista
        veiculos.add(new Carro("Fusca", "ABC1234", 4));
        veiculos.add(new Moto("CG125", "DEF5678", false));
        veiculos.add(new Caminhao("Volvo FH", "GHI9012", 20000));

        // Iterando sobre a lista e realizando operações comuns
        for (Veiculo veiculo : veiculos) {
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Placa: " + veiculo.getPlaca());

            // Operações específicas de cada tipo de veículo
            veiculo.acelerar();
            veiculo.frear();

            System.out.println("-----------");
        }
    }
}
