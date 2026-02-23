# Iniciando no universo de Java

<p align="center">
    <img src="java2.jpg" alt="img" width="300">
</p>


## Entendendo **JDK, JRE e JVM**

### O que são?

No Java, existem três componentes principais que permitem criar e executar programas: 

- JVM - Executa o programa

- JRE - Permite rodar o programa

- JDK - Permite desenvolver o programa

## JVM (Java Virtual Machine)
É uma máquina virtual responsável por **executar o bytecode** gerado pelo Java.

Ela torna o Java independente de sistema operacional.

---

## JRE (Java Runtime Environment)
Ambiente de execução Java.

É o ambiente necessário para **executar o programas Java**.

Contém: 

- JVM
- Bibliotecas padrão

Não permite compilar código

---

## JDK (Java Development Kit)

É kit completo para **Desenvolver em Java**"

Contém:

- JRE
- JVM
- Compilador (javac)
- Ferramentas de desenvolvimento

---










## Primeiros passos em Java

Um programa em Java consiste em um coleção de classes

O nome do arquivo deve ser idêntico ao nome da classe

- Nome do arquivo: OlaMundo.java
- Nome da classe: OlaMundo


### Nota
> - Com o JDK 25 não a necessidade de declarar a classe.

---

Nova forma de dar um print (escreva):
```bash
void main() {
        IO.print("Olá, mundo!");
}
```   
---
## Conceitos básicos da linguagem Java

### Tipos Primitivos em Java

```text
Tipo	    Tamanho	    Descrição	                Exemplo
---------------------------------------------------------------------------
int	        32 bits	    Número inteiro	            int i = 10;
long	    64 bits	    Inteiro longo	            long l = 100000L;
short	    16 bits	    Inteiro curto	            short s = 1000;
byte	    8 bits	    Byte	                    byte y = 127;
float	    32 bits 	Ponto flutuante	float       f = 3.14f;
double	    64 bits	    Ponto flutuante (preciso)	double d = 3.14159;
boolean	    1 bit*	    Valor lógico	            boolean b = true;
char	    16 bits	    Caractere (Unicode)	        char c = 'A';
```
Tipos primitivos possuem tamanho fixo e armazenam valores simples.

---

## Classe utilitária Math3 e classe Random4

1. Math.sqrt(25):

- `Math`é uma **classe utilitária do Java** que fornece funções matemáticas.
- `sqrt()` calcula a raiz quadrada de um número.

### Classe `Math`

- **Raiz quadrada**:
```java
double d = Math.sqrt(25); 
System.out.println(d); // 5.0 
```

- **Potência**:
```java
d = Math.pow(4, 2); // resultado: 16.0
```

- **Funções trigonométricas** (ângulos em radianos):
```java
double radians = Math.toRadians(45); //converte 45° para radianos
d = Math.sin(radians); // seno de 45°
d = Math.cos(radians); // cosseno  de 45°
d = Math.tan(radians); // tangente  de 45°
```

- **Arredondamento**:
```java
long n = Math.round(4.5632); // resultado: 16.0
```

---

### Classe `Random`

Usada para gerar números pseudo-aleatórios:

```java
import java.util.Random;

Random r = new Random();
int i = r.nextInt(10); //gera um número de 0 a 9
```
