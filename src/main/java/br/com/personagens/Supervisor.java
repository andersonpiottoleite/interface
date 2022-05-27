package br.com.personagens;

import java.util.ArrayList;
import java.util.List;

/** classe que define um supervisor
 * ela herda de empregado
 *
 * @author Anderson Piotto
 */
public class Supervisor extends Empregado{

    private List<Atendente> atendentesSubordinados = new ArrayList<>();

    public List<Atendente> getAtendentesSubordinados() {
        return atendentesSubordinados;
    }

    public void addAtendenteSubordinado(Atendente atendente) {
        this.atendentesSubordinados.add(atendente);
    }
}
