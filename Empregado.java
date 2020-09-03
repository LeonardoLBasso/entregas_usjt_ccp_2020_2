public class Empregado{
    private String nome;
    private int idade;
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
    private double salary;
    private double bonus;
    private double comission;
}
public double calcSalary{
    switch (tipo){
        case 1:
            return salary;
        case 2:
            return salary + salary*comission;
        case 3:
            return salary + comission + bonus;
        default:
            return 0;
    }
}
 