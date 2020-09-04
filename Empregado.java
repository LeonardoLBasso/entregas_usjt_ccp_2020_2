public class Empregado {
    private String nome;
    private int idade;
    private int tipo;
    private double salary;
    private double bonus;
    private double comission;
	static final int calcComission = 45 * 400;

    public Empregado (final String nome, final int idade, final int tipo, final double salary, final double bonus,
            final double comission) {
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

    public double getBonus() {
        return bonus;
    }

    public double getComission() {
        return comission;
    }

    public double getSalary() {
        return salary;
    }

    public int getTipo() {
        return tipo;
    }

    public void setIdade(final int idade) {
        this.idade = idade;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public void setBonus(final double bonus) {
        this.bonus = bonus;
    }

    public void setComission(final double comission) {
        this.comission = comission;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public void setTipo(final int tipo) {
        this.tipo = tipo;
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
