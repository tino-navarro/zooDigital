Zoo Digital
📖 Descrição
Zoo Digital é um sistema de gerenciamento de zoológico desenvolvido em Java, operado via interface de linha de comando (CLI). O projeto demonstra a aplicação prática dos pilares da Programação Orientada a Objetos (POO), como Herança, Polimorfismo, Encapsulamento e Abstração.

O sistema permite cadastrar uma diversidade de animais, organizados em uma hierarquia de classes (Mamíferos, Aves, Répteis e Peixes), e listar suas informações e comportamentos específicos, como nadar, voar, correr e caçar.

🏛️ Conceitos Demonstrados
Este projeto foi estruturado para aplicar e solidificar os seguintes conceitos fundamentais de Java e Engenharia de Software:

Herança: Utilização de uma classe base abstrata Animal e subclasses especializadas (Mamifero, Ave, Reptil, Peixe) para modelar o domínio e evitar repetição de código.

Polimorfismo: A capacidade de tratar objetos de diferentes classes de forma uniforme. Isso é visível na List<Animal> e na chamada de métodos como emitirSom() e comer(), que executam implementações específicas de cada animal.

Abstração: Uso de classes e métodos abstratos (Animal, emitirSom()) para definir um contrato que as subclasses devem seguir.

Interfaces: Definição de comportamentos (Nadador, Voador, Predador) que podem ser implementados por diferentes classes, promovendo flexibilidade e baixo acoplamento.

Encapsulamento: Proteção dos dados dos objetos usando modificadores de acesso (private) e expondo-os através de métodos getters e setters.

Gerenciamento com Maven: O projeto é configurado como um projeto Maven, gerenciando dependências (pom.xml) e facilitando o processo de build.

✨ Funcionalidades
O menu principal oferece as seguintes opções:

Cadastrar Animal: Permite adicionar um novo animal ao zoológico, solicitando informações gerais (nome, idade) e específicas (cor das penas, tipo de água, etc.) conforme a categoria do animal.

Listar Todos os Animais: Exibe uma lista completa de todos os animais cadastrados, mostrando seus dados e seus sons e hábitos alimentares (demonstrando polimorfismo).

Listar por Comportamento: Menus específicos para listar apenas os animais que são:

Corredores (Corredor)

Nadadores (Nadador)

Voadores (Voador)

Predadores (Predador)

Rastejantes (Rastejante)

Exibir Total de Animais: Mostra a contagem total de animais cadastrados, utilizando um contador estático na classe Animal.

🚀 Como Executar
Pré-requisitos
Java Development Kit (JDK) 21 ou superior.

Apache Maven 3.8 ou superior.

Passos para Execução
Clone o repositório:

Bash

git clone https://github.com/tino-navarro/zooDigital.git
cd zooDigital/zoo-digital
Compile e empacote o projeto com Maven: Este comando irá baixar as dependências, compilar o código e criar um arquivo .jar executável na pasta target/.

Bash

mvn clean package
Execute o programa: Use o seguinte comando para iniciar a aplicação.

Bash

java -jar target/zoo-digital-1138028.jar
(Nota: O nome do arquivo .jar pode variar com base na versão definida no pom.xml)

Após a execução, o menu interativo do Zoo Digital será exibido no seu terminal.
