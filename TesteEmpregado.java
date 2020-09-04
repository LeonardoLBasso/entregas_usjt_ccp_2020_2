public class TesteEmpregado {
    public static void main(String[] args) {
        final Empregado e1 = new Empregado("Diego", 19, 3, 20000, 1200, Empregado.calcComission);
        final Empregado e2 = new Empregado("Analice", 50, 1, 55000, 0, 0);
        final Empregado e3 = new Empregado("Tyler", 20, 2, 3000, 0, 20);
        System.out.println(e1.calcSalary() + "\n" + e2.calcSalary() + "\n" + e3.calcSalary());
    }
}