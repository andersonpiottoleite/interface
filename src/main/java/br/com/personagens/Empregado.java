package br.com.personagens;

/** classe que define um empregado
 * não pode ser intanciado, veja o abstract, não faz sentido ter só um empregado no sistema,
 * ele precisa ser mais concreto, ser um gerente, supervisor, atendente, etc.
 *
 * @author Anderson Piotto
 */
public abstract class Empregado {

    protected String nome;

    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
