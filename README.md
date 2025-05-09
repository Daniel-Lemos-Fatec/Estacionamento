# 🚗 Estacionamento com Pilha (Java)

Este projeto simula o controle de entrada e saída de veículos em um estacionamento com capacidade limitada, utilizando a estrutura de dados **Pilha**, implementada manualmente em Java.

---

## 💡 Descrição

O sistema representa um estacionamento linear, onde os veículos são organizados em forma de pilha. Isso significa que o último carro a entrar é o primeiro que pode sair sem a necessidade de manobras. Quando um carro que não está no topo precisa sair, os carros acima dele são temporariamente removidos para uma pilha auxiliar. Após a retirada do veículo desejado, os demais são recolocados na pilha principal, simulando as manobras necessárias.

A lógica implementada envolve:
- Gerenciamento de duas pilhas: uma principal (estacionamento) e uma auxiliar (apoio para manobras)
- Verificação de limite de capacidade
- Contagem de manobras durante as saídas
- Mensagens informativas sobre cada operação realizada

---

## 🧱 Estrutura do Projeto

- `Pilha.java`: implementação manual da estrutura de dados pilha
- `Estacionamento.java`: lógica principal do programa
- `README.md`: documentação do projeto

---

## 👩‍💻 Autoria

Desenvolvido por:

- **Bianca Leão**
---