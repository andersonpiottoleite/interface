
# Aqui nesse projeto temos uma demostração de um cenário onde podemos usar herança e inteface

# Um cenário interessante para se usar herança:
Gerente extende Empregado
Supervisor extende Empregado

Pois ambos são empregados e tem caracteristicas comuns entre eles.

# Um cenário interessante para se usar interface:

O Gerente precisa fazer fazer login, para ver metricas no sistema, etc.
Mas um Supervisor não pode logar no sistema, não tem permissão.

Se alterarmos a Classe Empregado, colocando os metodos getLogin e getSenha, todos que herdam de Empregado, vão fazer ter esses métodos (não é o que queremos, 
não queremos que o Supervisor tenha os metodos getLogin e getSenha para serem usados no login no sistema).

Podemos criar uma Classe chamada Autenticavel com esses métodos getLogin e getSenha, para Gerente herdar, mas java só suporta herança para uma classe (herança simples) então não funciona (Gerente já herda de Empregado).

Solução: criar uma Interface chamada Autenticavel, e fazer Gerente implementar ela e seus metodos getLogin e getSenha, então ele se torna autenticavel.

Já o supervisor, não implementa, porque ele não é autenticavel.

E quando surgir uma outra classe no futuro que seja autenticavel, pode simplesmente implementar essa Interface Autenticavel.

Detalhe interessante, no java podemos implementar de mais de um Interface.
