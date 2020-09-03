import java.lang.reflect.Constructor;

public class Empregado {
    private String nome;
    private int idade;
    private int tipo;
    private double salary;
    private double bonus;
    private double comission;

    public Empregado (String nome, int idade, int tipo, double salary, double bonus, double comission){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.salary = salary;
        this.bonus = bonus;
        this.comission = comission;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcSalary() {
        switch (tipo) {
            case 1:
                return salary;
            case 2:
                return salary + salary * comission;
            case 3:
                return salary + comission + bonus;
            default:
                return 0;
        }
    }
}
