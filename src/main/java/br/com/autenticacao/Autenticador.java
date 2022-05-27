package br.com.autenticacao;

import br.com.personagens.Usuario;

import java.util.ArrayList;
import java.util.List;

/** classe responsavel por realizar autenticacoes
 *
 * @author Anderson Piotto
 */
public class Autenticador {

    private static List<Usuario> bancoSimulado = new ArrayList<>();

    /**
     * quando a JVM gera classe esse bloco static é executado,
     * preenchendo o nosso banco simulado
     */
    static{
        Usuario usuario1 = new Usuario();
        usuario1.setLogin("LOGIN-X");
        usuario1.setSenha("SENHA-X");

        Usuario usuario2 = new Usuario();
        usuario2.setLogin("LOGIN-Y");
        usuario2.setSenha("SENHA-Y");

        bancoSimulado.add(usuario1);
        bancoSimulado.add(usuario2);
    }

    public static boolean autentica(Autenticavel autenticavel){
        for (Usuario u : bancoSimulado) {
            if (autenticavel.getLogin().equals(u.getLogin())
                    && autenticavel.getSenha().equals(u.getSenha())) {
                return true;
            }
        }
        return false;
    }

}
