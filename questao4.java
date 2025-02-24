public class Lampada {
    private String marca;
    private int potencia;
    private String tipo; 
    private int voltagem;
    private double preco;
    private int estoque; 

    public Lampada(String marca, int potencia, String tipo, int voltagem, double preco, int estoque) {
        this.marca = marca;
        this.potencia = potencia;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String exibirInformacoes() {
        return "Lâmpada [Marca: " + marca + ", Potência: " + potencia + "W, Tipo: " + tipo +
                ", Voltagem: " + voltagem + "V, Preço: R$" + preco +
                 ", Estoque: " + estoque + " unidades]";
    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void atualizarEstoque(int quantidade) {
        this.estoque += quantidade; 
    }

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

    public static void main(String[] args) {
        Lampada lampada = new Lampada("Philips", 50, "LED", 300, 35.99, 90);

        System.out.println(lampada.exibirInformacoes());

        lampada.alterarPreco(24.90);
        System.out.println("Preço atualizado: R$" + lampada.getPreco());

        lampada.atualizarEstoque(-10);
        System.out.println("Estoque atualizado: " + lampada.getEstoque() + " unidades");
    }
}
