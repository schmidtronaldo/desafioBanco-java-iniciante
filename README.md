# DIO - Bootcamp Bradesco - Java Cloud Native
www.dio.me

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Desafio
1. Criar um projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

###### Regras de declaração de variáveis

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Cliente   | Texto    | MARIO ANDRADE
| Saldo     | Decimal  |237.48

###### Melhorias no projeto
1. As validações da agência e do número da conta foram movidas para métodos separados (`solicitarAgencia` e `solicitarNumeroConta`), o que torna o código mais modular e fácil de manter.
2. O `Scanner` agora é gerenciado automaticamente pelo `try-with-resources`, garantindo que ele seja fechado corretamente.
3. Foram adicionadas constantes para o comprimento da agência, do número da conta e para o saldo máximo, o que facilita a manutenção e a leitura do código.
4. A validação do número da conta foi ajustada para ler a entrada como uma `String` e depois convertê-la para `int`, o que facilita a verificação do comprimento e dos caracteres.
5. A geração do saldo aleatório foi mantida, mas agora está encapsulada em um método separado (`gerarSaldoAleatorio`).
6. A exibição da mensagem final foi movida para um método separado (`exibirMensagemFinal`), o que melhora a organização do código.

###### Conclusão
Gostei muito de realizar o desafio e acredito que ele pode ser melhorado e muito.

Está é a segunda ou terceira versão do projeto inicial e tem muito potencial a ser explorado.

Espero ao longo deste bootcamp aprender mais recursos para desenvolver melhor este projeto.

Obrigado.


Atualizado em : 04/02/2025


