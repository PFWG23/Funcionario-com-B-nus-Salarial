public class Funcionario {
    String nome;
    double salario;
    String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularBonus() {
        if (cargo.equals("Gerente")) {
            return salario * 0.20;
        } else if (cargo.equals("Analista")) {
            return salario * 0.10;
        } else if (cargo.equals("Estagiário")) {
            return salario * 0.05;
        } else {
            return 0.0;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
        System.out.println("Bônus: R$" + calcularBonus());
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 5000.00, "Gerente");
        Funcionario f2 = new Funcionario("Maria", 3000.00, "Analista");
        Funcionario f3 = new Funcionario("Pedro", 1500.00, "Estagiário");
        f1.exibirInformacoes();
        f2.exibirInformacoes();
        f3.exibirInformacoes();
    }
}
