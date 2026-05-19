# 🔍 Inspeção em Setores — Padrão de Projeto Visitor

> Atividade prática da disciplina de **Padrões de Projeto** do curso de **Análise e Desenvolvimento de Sistemas (ADS) - IFPB**, aplicando o padrão **Visitor** para executar operações sobre diferentes tipos de setores de uma empresa sem modificar diretamente suas classes.

---

## 📌 Sobre o projeto

Este projeto simula um sistema de inspeção em setores de uma empresa. Cada setor armazém, administrativo, frota e produção pode receber diferentes tipos de inspeção, como avaliação de segurança e avaliação de limpeza. Utilizando o **padrão Visitor**, essas operações ficam encapsuladas nas classes visitantes, mantendo as classes dos setores livres de responsabilidades externas.

---

## 🎯 Objetivo

Aplicar o padrão **Visitor** para:

- Separar operações externas das classes dos setores
- Permitir a adição de novas inspeções sem modificar as classes existentes
- Garantir que cada visitante saiba como se comportar em cada tipo de setor

---

## 🧠 O Padrão Visitor

O **Visitor** é um padrão comportamental que permite adicionar novas operações a uma hierarquia de objetos sem modificar suas classes. As operações ficam encapsuladas em classes visitantes separadas.

---

## 🗂️ Estrutura do Projeto

```
SistemaDeInspecaoEmSetores/
  └── src/
        ├── Administrativo   → elemento concreto visitável
        ├── Armazem          → elemento concreto visitável
        ├── AvaliacaoLimpeza → visitante concreto
        ├── Frota            → elemento concreto visitável
        ├── InspecaoSeguranca → visitante concreto
        ├── Main
        ├── Producao         → elemento concreto visitável
        ├── Setor            → interface (contrato base dos elementos visitáveis)
        └── VisitanteSetor   → interface (contrato base dos visitantes)
```

---

## 💡 Responsabilidades das Classes

| Classe | Papel no Visitor | Descrição |
|---|---|---|
| `VisitanteSetor` | **Interface Visitor** | Contrato base com um método `visitar()` para cada tipo de setor |
| `InspecaoSeguranca` | **Concrete Visitor** | Executa a inspeção de segurança em cada tipo de setor |
| `AvaliacaoLimpeza` | **Concrete Visitor** | Executa a avaliação de limpeza em cada tipo de setor |
| `Setor` | **Interface Element** | Contrato base que obriga cada setor a aceitar um visitante |
| `Armazem` | **Concrete Element** | Aceita visitantes e fornece seus dados para a operação |
| `Administrativo` | **Concrete Element** | Aceita visitantes e fornece seus dados para a operação |
| `Frota` | **Concrete Element** | Aceita visitantes e fornece seus dados para a operação |
| `Producao` | **Concrete Element** | Aceita visitantes e fornece seus dados para a operação |

---

## 👨‍💻 Autor

Desenvolvido como atividade prática da disciplina de **Padrões de Projeto** - ADS IFPB.
