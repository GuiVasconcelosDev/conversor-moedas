# Conversor de Moedas

Aplicação Java de terminal que consulta taxas de câmbio em tempo real e converte valores entre real, dólar e euro.

## Funcionalidades

- Conversão de dólar para real
- Conversão de real para dólar
- Conversão de euro para real
- Conversão de real para euro
- Menu interativo no terminal
- Consulta de cotação por API HTTP
- Desserialização da resposta JSON com Gson

## Tecnologias

- Java 25
- Maven
- Java HTTP Client
- Gson 2.10.1
- ExchangeRate-API

## Como executar

```bash
git clone https://github.com/GuiVasconcelosDev/conversor-moedas.git
cd conversor-moedas
mvn clean compile
```

Execute a classe `br.com.guilhermedev.conversor.principal.principal` pela IDE.

> Para execução direta pela JVM, o método de entrada precisa seguir a assinatura `public static void main(String[] args)`.

## Menu disponível

```text
1) Dólar (USD) para Real (BRL)
2) Real (BRL) para Dólar (USD)
3) Euro (EUR) para Real (BRL)
4) Real (BRL) para Euro (EUR)
5) Sair
```

## Estrutura

```text
src/main/java/br/com/guilhermedev/conversor/
├── api/ConexaoAPI.java       # Comunicação HTTP
├── model/Moeda.java          # Representação da cotação
└── principal/principal.java  # Menu e conversão
```

## Configuração da API

O projeto utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/). Crie sua própria chave e evite mantê-la diretamente no código-fonte. Em uma evolução do projeto, prefira ler o valor de uma variável de ambiente, por exemplo `EXCHANGE_RATE_API_KEY`.

## Melhorias sugeridas

- Remover a chave da API do código
- Validar entradas não numéricas
- Adicionar mais moedas
- Criar testes unitários
- Configurar o Maven Exec Plugin
- Ajustar o ponto de entrada para a assinatura padrão do Java

## Autor

Desenvolvido por [Guilherme Vasconcelos](https://github.com/GuiVasconcelosDev).
