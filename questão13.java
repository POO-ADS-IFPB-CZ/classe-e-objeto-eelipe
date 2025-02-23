class ContaBancariaSimplificada {
    private String nome;
    private double saldo;

    public ContaBancariaSimplificada(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public boolean retira(double valor) {
        if (valor > saldo) {
            return false; // Saldo insuficiente
        }
        saldo -= valor;
        return true; // Retirada bem-sucedida
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public static boolean transfere(ContaBancariaSimplificada origem, ContaBancariaSimplificada destino, double valor) {
        if (origem.retira(valor)) {
            destino.deposita(valor);
            return true; // Transferência realizada com sucesso
        }
        return false; // Falha na transferência (saldo insuficiente)
    }

    public static void main(String[] args) {
        // Criação de instâncias
        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada("João", 500);
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada("Maria", 300);

        System.out.println("Saldo inicial:");
        System.out.println(conta1.getNome() + ": R$ " + conta1.getSaldo());
        System.out.println(conta2.getNome() + ": R$ " + conta2.getSaldo());

        // Transferência de valores
        double valorTransferencia = 200;
        boolean sucesso = transfere(conta1, conta2, valorTransferencia);

        if (sucesso) {
            System.out.println("\nTransferência de R$ " + valorTransferencia + " realizada com sucesso!");
        } else {
            System.out.println("\nTransferência falhou. Saldo insuficiente.");
        }

        System.out.println("\nSaldo final:");
        System.out.println(conta1.getNome() + ": R$ " + conta1.getSaldo());
        System.out.println(conta2.getNome() + ": R$ " + conta2.getSaldo());
    }
}
