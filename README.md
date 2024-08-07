# Desafio de Controle de Fluxo - DIO

## 📝 Descrição

Este projeto faz parte do módulo de Controle de Fluxo da Trilha Java Básico da Digital Innovation One (DIO). O desafio consiste em criar um sistema que receba dois parâmetros via terminal, representando dois números inteiros, e realiza a impressão desses números incrementados em um console. Se o primeiro número for maior que o segundo, uma exceção personalizada deve ser lançada.

## 🎯 Objetivo

- Receber dois parâmetros inteiros via terminal.
- Obter a quantidade de interações com base na diferença entre os números.
- Imprimir no console mensagens indicando a contagem.
- Lançar uma exceção personalizada se o primeiro número for maior que o segundo.

## ⚙️ Como Executar

1. **Clone o Repositório:**

    ```bash
    git clone https://github.com/seu-usuario/desafio-controle-fluxo.git
    ```

2. **Compile o Projeto:**

    Navegue até o diretório do projeto e compile o código com:

    ```bash
    javac Contador.java ParametrosInvalidosException.java
    ```

3. **Execute o Programa:**

    Execute o programa com dois parâmetros inteiros:

    ```bash
    java Contador <parametroUm> <parametroDois>
    ```

    Exemplo:

    ```bash
    java Contador 12 30
    ```

## 📂 Estrutura do Projeto

- **Contador.java:** Classe principal que contém a lógica para receber parâmetros e contar os números.
- **ParametrosInvalidosException.java:** Classe para a exceção personalizada quando o primeiro parâmetro é maior que o segundo.

## 🔗 Badges

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)]()
![Controle de Fluxo](https://img.shields.io/badge/controle--de--fluxo-blue)
![Status do Projeto](https://img.shields.io/badge/status-active-brightgreen)
