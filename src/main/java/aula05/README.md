## Introdução ao paradigma da orientação a objetos


1. **Classe**
Uma **classe** é como um **molde** para criar objetos.

Exemplo: 
```java
    public class Caneta {
}
```

Nesse caso, a classe representa uma **caneta**, definindo:

- O que ela **tem** (atributos)
- O que ela **faz** (métodos)

---

2. **Objeto**

Um **objeto** é uma instância da classe.

Exemplo:
```java
    Caneta caneta1 = new Caneta();
```
Aqui estamos **criando uma classe dentro do programa**

---

## Atributos da Classe

Os atributos representam as **caracteristicas do objeto**

Exemplo:
```java
   private String cor;
   private double nivelTinta;
   private boolean aberta;
```

Uso de `private`

Os atributos são declarados como **private** para proteger os dados.

Isso significa que **não podemos acessar diretamente** fora da clase.

Errado: caneta1.nivelTinta = 1;

Correto: caneta1.setNivelTinta(1);

---

## Encapsulamento

Encapsulamento significa **controlar o acesso aos dados do objeto** usando métodos:

- **GET** --> para obter valores
- **SET** --> para alterar valores
---

## Métodos SET (Definir valor)

Serve para **alterar valores dos atributos**.

Exemplo:
```java
    public void setCor(String c) {
    cor = c;
}
```
No Main:
Exemplo:
```java
    caneta1.setCor("Azul");
```

---

## Métodos GET (Retornar valor)

Serve para **retornar informações do objeto**

Exemplo:
```java
    public String getCor(){
    return cor;
}
```
No Main:
Exemplo:
```java
    String cor = caneta1.getCor();
```

---

## Métodos da Caneta

Abri a caneta
Exemplo:
```java
    public void abrirTampa() {
    aberta = true;
}
```
Fechar a caneta

Exemplo:
```java
    public void fecharTampa() {
    aberta = false;
}
```


