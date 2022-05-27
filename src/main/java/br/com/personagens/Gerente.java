package br.com.personagens;

import br.com.autenticacao.Autenticavel;

import java.util.ArrayList;
import java.util.List;

/** classe que define um Gerente
 * ela herda de empregado
 * ela tambem implementa a interface Autenticavel
 *
 * @author Anderson Piotto
 */
public class Gerente extends Empregado implements Autenticavel {

    private Usuario usuario;
    private List<Supervisor> supervisoresSubordinados = new ArrayList<>();

    public List<Supervisor> getSupervisoresSubordinados() {
        return supervisoresSubordinados;
    }

    public void addSupervisoreSubordinado(Supervisor supervisor) {
        this.supervisoresSubordinados.add(supervisor);
    }

    @Override
    public String getLogin() {
        return this.usuario.getLogin();
    }

    @Override
    public String getSenha() {
        return this.usuario.getSenha();
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
