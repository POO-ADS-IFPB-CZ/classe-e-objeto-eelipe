class ContaBancariaSimplificada {
    private String nome;
    private double saldo;

    public ContaBancariaSimplificada(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public boolean retira(double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true; 
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
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada("João", 500);
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada("Maria", 300);

        System.out.println("Saldo inicial:");
        System.out.println(conta1.getNome() + ": R$ " + conta1.getSaldo());
        System.out.println(conta2.getNome() + ": R$ " + conta2.getSaldo());

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
