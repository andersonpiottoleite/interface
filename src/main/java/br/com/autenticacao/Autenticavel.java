package br.com.autenticacao;

/** interface que define um contrato para quem desejar se tornar autenticavel
 *  que deseja ser autenticavel, deve "assinar" esse contrato, realizando a implementação dos metodos
 *
 * @author Anderson Piotto
 */
public interface Autenticavel {

    String getLogin();

    String getSenha();
}
