
````mermaid
classDiagram
    direction TB
Usuario <|-- Admin
Usuario <|-- Aluno
Usuario <|-- Bibliotecario 


Gerenciar <|.. Admin
Gerenciar <|.. Bibliotecario

Emprestimo <-- Usuario
Emprestimo <-- Livro

Biblioteca o-- Usuario
Biblioteca o-- Livro
Biblioteca o-- Emprestimo
Biblioteca o-- DiasSemana


class Usuario {
<<Abstract>>
#nome: String
#cpf: String
+getLimiteEmprestimo() int
+login() boolean
}

class Gerenciar {
    <<interface>> 
    +gerarRelatorio() String
}

class DiasSemana {
    <<enumeration>>
    SEGUNDA
    TERCA
    QUARTA
    QUINTA
    SEXTA
}

class Admin {
    
 }
class Aluno {
    
}
class Bibliotecario {
    
}

class Emprestimo {
    -Livro livro
    -Usuario usuario
    -LocalDate dataEmprestimo
 }
 
class Biblioteca {
    -ArrayList~Usuario~ usuarios
    -ArrayList~Livro~ livros
    -ArrayList~Emprestimo~ emprestimos
    -ArrayList~DiasSemana~ diasAbertos
    +cadastrarLivro(Livro livro)
    +cadastrarUsuario(Usuario usuario)
    +emprestarLivro(Usuario usuario, Livro livro)
    +devolver(Livro livro)
}

class Livro {
    -id: int
    -titulo: String
    -emprestado: boolean
}
````
