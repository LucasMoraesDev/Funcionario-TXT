# Funcionario-TXT

## Descrição do Projeto
Projeto desenvolvido em Java que lê os dados de um Funcionário e grava as informações em um arquivo do tipo TXT na máquina local. A entidade Funcionário é composta pelos campos: Id do Funcionario (Integer), Nome (String), Cpf (String), Matrícula (String) e Salário (Double).

## Funcionamento do Projeto
Ao iniciar a aplicação, o usuário deverá informar os dados do Funcionário. As informações serão gravadas em um arquivo do tipo TXT, que será criado automaticamente na pasta C:\workspace\funcionario_txt. 

## Pacotes
O projeto é dividido em 3 pacotes: entities, principal e repositories. 

### Entities
Pacote que contém a classe que representa a entidade Funcionário.

### Principal
Pacote que contém a classe Program, responsável pela execução do projeto.

### Repositories
Pacote que contém a classe que representa o repositório de Funcionários, responsável por salvar os dados do Funcionário em um arquivo TXT.

## Princípios Utilizados
O projeto foi desenvolvido seguindo os princípios da Orientação a Objetos, utilizando o conceito de encapsulamento, herança e polimorfismo. Além disso, foram utilizados os conceitos de arquivos em Java e tratamento de exceções.

## Tecnologias Utilizadas
- Java 8
- IDE Eclipse

## Como Executar o Projeto
1. Clonar o repositório
2. Abrir o projeto no Eclipse
3. Executar a classe Program
4. Informar os dados do Funcionário quando solicitado
5. Verificar o arquivo funcionario.txt gerado na pasta c:\temp\funcionario.txt

## Autor
@LucasMoraesDev
