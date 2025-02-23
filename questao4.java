public class Lampada {
    // Atributos
    private String marca;
    private int potencia; // em Watts
    private String tipo; // LED, incandescente, etc.
    private int voltagem; // 110V, 220V, bivolt
    private double preco;
    private int estoque; // quantidade disponível

    // Construtor
    public Lampada(String marca, int potencia, String tipo, int voltagem, double preco, int estoque) {
        this.marca = marca;
        this.potencia = potencia;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Método para exibir informações da lâmpada
    public String exibirInformacoes() {
        return "Lâmpada [Marca: " + marca + ", Potência: " + potencia + "W, Tipo: " + tipo +
                ", Voltagem: " + voltagem + "V, Preço: R$" + preco +
                 ", Estoque: " + estoque + " unidades]";
    }

    // Método para alterar o preço da lâmpada
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    // Método para atualizar o estoque
    public void atualizarEstoque(int quantidade) {
        this.estoque += quantidade; // Pode ser positivo ou negativo
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Método principal
    public static void main(String[] args) {
        // Criando uma instância de Lampada
        Lampada lampada = new Lampada("Philips", 60, "LED", 220, 29.90, 100);

        // Exibindo informações da lâmpada
        System.out.println(lampada.exibirInformacoes());

        // Alterando o preço
        lampada.alterarPreco(24.90);
        System.out.println("Preço atualizado: R$" + lampada.getPreco());

        // Atualizando o estoque
        lampada.atualizarEstoque(-10); // Vendendo 10 unidades
        System.out.println("Estoque atualizado: " + lampada.getEstoque() + " unidades");
    }
}
