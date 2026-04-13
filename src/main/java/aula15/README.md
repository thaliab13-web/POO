
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
## Coleções em Java

O pacote principal é o``java.util``

### **List (lista)**

- Guarda **elementos ordenados**
- Permite repetição
- Acesso por indice

```java
List<livro> livros = new ArrayList<>();
```

Use quando:

- Quer manter ordem 
- Precisa percorrer todos os livros

---

### **Set (Conjunto)**

- Não **permite repetidos**
- Não garante ordem (em geral)

```java
Set<String> autores = new HashSet<>();
```
Use quando:

- Quer evitar duplicados

---

### **Map (Mapa)**

- Map = "guarda objetos usando um identificador único"
- Estrutura **chave -> valor**
- Tipo dicionário

- ``put(chave, valor)`` -> cadastra
- ``get(chave)`` -> busca
- ``value()`` -> listar todos os valores presentes no mapa, ignorando as chaves


Exemplo:

- **Map** -> estrutura chave -> valor
- ``String`` -> tipo da **chave** (ex: ISBN)
- ``Livro`` -> tipo do **valor** (objeto)
-  ``acervo`` -> nome da variável é a onde vai guardar todos os livros
-  ``new HashMap<>();`` -> chamando o **construtor** da classe ``HashMap``

```java
Map<String, Livro> acervo = new HashMap<>();
```
### Cadastrar livro
```java
acervo.put("123", new Livro("123", "Js básico", 2020));
```

### Verificar se já existe (evitar duplicado)
```java
// Se não existe esse ISBN no acervo, então cadastrar o livro 
if (!acervo.containsKey(livro.getISBN())) {
    acervo.put(livro.getISBN(), livro);
}
```

### Buscar livro
```java
Livro 1 = acervo.get("123");

```
### Listar, (Para cada livro no acervo, imprime ele)
:: = method reference
```java
acervo.values().forEach(System.out::println);
```

### Remover Livro, remove pela chave
```java
acervo.remove("123");
```

### Saber quantos livros tem, retorna quantidade
```java
IO.println(acervo.size());
```

### Verifica se está vazio
```java
if (acervo.isEmpty()) {
    IO.println("Acervo vazio");
        }
```

### Percorrer chaves (ISBN)
```java
for (String ISBN : acervo.keySet()) {
    IO.println(ISBN)
        }
```

### Percorrer chave + valor 
```java
acervo.forEach((ISBN, livro) -> {
    IO.println("ISBN: " + ISBN);
    IO.println(livro);
        });
```
### Alterar
containsKey verifica se uma chave especifica existe dentro do mapa
```java
if (acervo.containsKey.(ISBN)) {
    acervo.get(ISBN).setNomeLivro(novoTitulo);
}
```

Use quando:

- Quer buscar rápido por chave