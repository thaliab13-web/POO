````mermaid
classDiagram
    direction LR
    class Ator {
        -nome String
        -dataNasc LocalDate
        +Ator(nome:String, dataNasc:LocalDate)
        +toString()
    }
    
    class Avaliacao {
        -nota int
        -comentario String
        -usuario Usuario
        -filme Filme
        +Avaliacao(nota:int, comentario:String, usuario:Usuario, filme:Filme)
        +toString()
    }
    
    class Usuario {
        -nome String
        -email String
        -senha String
        +Usuario(nome:String, email:String, senha:String)
        +toString()
    }
    class Filme {
        -titulo String
        -anoLanc int
        -genero String
        -diretor Diretor
        -atores ArrayList~Ator~
        -avaliacoes ArrayList~Avaliacao~
        +Filme(titulo:String, anoLanc:int, genero:String, diretor:Diretor)
        +toString()
    }
    class Diretor {
        -nome String
        -email String
        +Diretor(nome:String, email:String)
        +toString()
    }
    Filme "0..*" <-- "1" Diretor
    Filme "1..*" <-- "1..*" Ator
    Filme "1" *-- "1..*" Avaliacao
    Usuario "1" --> "0..*" Avaliacao


````


[//]: # ()
[//]: # (```mermaid)

[//]: # (classDiagram)

[//]: # (    direction LR)

[//]: # (    )
[//]: # (    class Cliente {)

[//]: # (        -nome String)

[//]: # (        -email String)

[//]: # (        -enderecos:ArrayList~Endereco~)

[//]: # (        -pedidos:ArrayList~Pedido~)

[//]: # (        +Cliente&#40;nome:String, email:String&#41;)

[//]: # (        +addEndereco&#40;Endereco e&#41;)

[//]: # (        +addPedido&#40;Pedido p&#41;)

[//]: # (        +toString)

[//]: # (    })

[//]: # (    )
[//]: # (    class Endereco {)

[//]: # (        -cep String)

[//]: # (        -logradouro String)

[//]: # (        -rua String)

[//]: # (        -bairro String)

[//]: # (        -cidade String)

[//]: # (        -complemento String)

[//]: # (        +Endereco&#40;cep:String, logradouro:String, rua:String, bairro:String, cidade:String, complemento:String&#41;)

[//]: # (    })

[//]: # (    class Produto {)

[//]: # (        -descricao String)

[//]: # (        -preco double)

[//]: # (        -qtdEstoque int)

[//]: # (        +Produto&#40;descricao:String, preco:double, qtdEstoque: int&#41;)

[//]: # (    })

[//]: # (    class Pedido {)

[//]: # (        -data localDate)

[//]: # (        -situacao String)

[//]: # (        -itemPedidos:ArrayList~ItemPedido~)

[//]: # (        +Pedido&#40;data localDate, situacao String&#41;)

[//]: # (        +toString&#40;&#41;)

[//]: # (    })

[//]: # (    class ItemPedido {)

[//]: # (        -quantidade int)

[//]: # (        -precoUnitario double)

[//]: # (        -Produto produto)

[//]: # (        +ItemPedido&#40;quatidade: int, precoUnitario:double, produto:Produto&#41;)

[//]: # (        +toString)

[//]: # (    })

[//]: # (    )
[//]: # (    Cliente "1" *-- "1..*" Endereco)

[//]: # (    Cliente "1" *-- "1..*" Pedido)

[//]: # (    Pedido "1" *-- "*" ItemPedido)

[//]: # (    ItemPedido "*"  --> "1" Produto)

[//]: # ()
[//]: # (```)