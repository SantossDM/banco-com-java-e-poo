public class Main {
    public static void main(String[] args) {
        Cliente santos = new Cliente();
        santos.setNome("Raphael Santos");

        Conta cc = new ContaCorrente(santos);
        cc.depositar(100);
        
        Conta poupanca = new ContaPoupanca(santos);
        cc.transferir(poupanca, 100);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
