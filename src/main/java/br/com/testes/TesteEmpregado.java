package br.com.testes;

import br.com.autenticacao.Autenticador;
import br.com.personagens.*;

/** classe para testes em todo o contexto de empregado
 *
 * @author Anderson Piotto
 */

public class TesteEmpregado {

    public static void main(String[] args) {

        // cria um supervisor
        Supervisor supervisor = new Supervisor();
        supervisor.setNome("José");
        supervisor.setSalario(3000);

        // cria um atendente
        Atendente atendente = new Atendente();
        atendente.setNome("Pedro");
        atendente.setSalario(1500);

        // adiciona o atendente subordinado na lista de atendentes do supervisor
        supervisor.addAtendenteSubordinado(atendente);

        // cria um gerente
        Gerente gerente = new Gerente();
        gerente.setNome("Paulo");
        gerente.setSalario(7000);

        // adiciona o supervisor subordinado na lista de supervisores do gerente
        gerente.addSupervisoreSubordinado(supervisor);

        // cria o usuario, com valores somente para testes
        Usuario usuario = new Usuario();
        usuario.setLogin("LOGIN-Y");
        usuario.setSenha("SENHA-Y");

        // seta o usuario no gerente, pois ele precisará de um usuario para se autenticar
        gerente.setUsuario(usuario);

        // valida se o gerente esta logado
        // isso só pode ser feito porque o gerente implementa a interface Autenticavel

        boolean gerenteLogado = Autenticador.autentica(gerente);

        // validando se o gerente esta logado
        if (gerenteLogado){
            System.out.println("GERENTE LOGADO COM SUCESSO");
        } else {
            System.out.println("DEU RUIM");
        }

        // a ultima linha - Autenticador.autentica(supervisor); não compila
        // porque supervisor não implementa a interface Autenticavel
        // o supervisor somente extende (herda de) Empregado
        // então ele é um empregado NÃO autenticavel
        // boolean supervisorLogado = Autenticador.autentica(supervisor);

    }
}
