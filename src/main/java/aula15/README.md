
ArrayList é uma lista dinamica (tamanho variável).

Diferente do vetor que o tamanho é fixo.

Já o ArrayList cresce sozinho:

```java
ArrayList<String> lista = new ArrayList<>();
lista.add("POO");
lista.add("IFSC");
```
### Métodos 

add() Adiciona elemento: 
```java
lista.add("POO");
lista.add("IFSC");
```

get(index) Pega um item da lista:
```java
String nome = lista.get(1);
```
size() Conta a quantidade de elementos:
```java
int total = lista.size();
```