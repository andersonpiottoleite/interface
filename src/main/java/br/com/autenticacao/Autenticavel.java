package br.com.autenticacao;

/** interface que define um contrato para quem desejar se tornar autenticavel
 *  que deseja ser autenticavel, deve "assinar" esse contrato, realizando a implementação dos metodos
 *
 * @author Anderson Piotto
 */

// observe a palavra interface, ao invés de class
public interface Autenticavel {

    // metodos de interface são public e abstract (não tem corpo), mesmo que
    // não coloquemos "public" e "abstract", o java implicitamente faz isso.
    String getLogin();

    String getSenha();
}
