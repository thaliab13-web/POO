## Classe abstrata, interface e polimorfismo


### Classe abstrata
É uma classe que serve como modelo para outras classes. 
Ela:
- Pode ter atributos
- Pode ter métodos
- Pode ter construtor
- Não pode criar objetos
- Ela não pode ser instanciada diretamente.
- Ela é usada quando várias classes possuem características em comum.
####Como declarar: 
```java
abstract class Animal {
}
```

### Método Abstrato

- É um método sem código
- Toda classe filha precisa criar esse método 
```java
abstract  class Animal {
    abstract void emitirSom();
    // Todo animal precisa emitir som
}
```

### Sobrescrever

- É substituir o comportamento de um método herdado de uma superclasse (classe pai)

- Permite que a classe filha implemente algo especifico dela no método que herdou do pai

- É utilizado o @Override

------------------------------------------------

### Interface

- É um modelo de regras que uma classe deve seguir.
- Ela diz quais métodos a classe precisa ter.
- É como uma lista de tarefas obrigatórias.
- Ela organiza o código e garatnte que certas ações existem.
- Define os métodos, mais normalmente não coloca o código deles, a classe que implementa que escreve o código no método
```java
interface Animal {
    void emitirSom();
}
```
Código acima diz "Todo animal precisa emitir som".
Mas ela NÃO diz qual som.

```java
class Cachorro implements Animal {
    public void emitirSom() {
        IO.println("Au au");
    }
}
```
O cachorro foi obrigado a criar o método emitirSom()

- implements -> A classe está seguindo as regras da interface

---

### Polimorfismo

- Significa "muitas formas"
- Um mesmo método pode ter comportamentos diferentes dependendo do objeto que o utiliza

A classe Animal com um método chamado som()
Cada animal faz um som diferente: 
- Cachorro -> late
- Gato -> Mia
- Vaca -> Muge
Então o método é o mesmo (som()), mas o resultado muda dependendo do objeto.

---