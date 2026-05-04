````mermaid
classDiagram
    direction LR
    
    class Voo {
        -numero int
        -destino String
        -data LocalDate
        -horaPartida double
        -capacidadeMax int   
        +Voo(numero:int, destino:String, data:LocalDate, horaPartida:double, capacidadeMax:int)
        +toString()
    }
    class Passageiro {
        -nome String
        -email String
        -telefone int
        +Passageiro(nome:String, email:String, telefone:int)
        +toString()
    }
    class Reserva {
        -Voo voo
        -Passageiro passageiro
        +Reserva(Voo:voo, Passageiro passageiro)
    }
    Passageiro "1" <-- "0..*" Reserva 
    Reserva "0..*" --> "1" Voo
   
````



````mermaid
classDiagram
    direction LR
    
    class Motorista {
        -nome String
        -cpf String
        +Motorista(nome:String, cpf:String)
        +toString()
    }
    
    class Veiculo {
        -modelo String
        -placa String
        -anoFabri int
        +Veiculo(modelo:String, placa:String, anoFabri:int)
        +getPlaca()
        +setModelo(String novoModelo)
        +toString()
    }
    
    class Registro {
        -data LocalDate
        -distacia double
        -Veiculo veiculo
        -Motorista motorista
        +Registro(data:LocalDate, distacia:double, Veiculo:veiculo, Motorista motorista)
        +toString()
    }
    
    class Empresa {
        -ArrayList~Motorista~ motoristas
        -ArrayList~Veiculo~ veiculos
        -ArrayList~Registro~ registros
        +Empresa()
        +addMotorista(Motorista m)
        +addVeiculo(Veiculo v)
        +addRegistro(Registro r)
        +removeMotorista(Motorista m)
        +removeVeiculo(Veiculo v)
        +removeRegistro(Registro r)
        +atualizarMotorista(String:cpf, String:novoNome)
        +atualizarVeiculo(String:placa, String:novoModelo)
        +toString()
    }
    
    Empresa "1" *-- "0..*" Registro
    Registro "0..*" --o "1" Motorista
    Registro "0..*" --o "1" Veiculo
````


[//]: # ()
[//]: # (````mermaid)

[//]: # ()
[//]: # (classDiagram)

[//]: # (    direction LR)

[//]: # (    class Ator {)

[//]: # (        -nome String)

[//]: # (        -dataNasc LocalDate)

[//]: # (        +Ator&#40;nome:String, dataNasc:LocalDate&#41;)

[//]: # (        +toString&#40;&#41;)

[//]: # (    })

[//]: # (    )
[//]: # (    class Avaliacao {)

[//]: # (        -nota int)

[//]: # (        -comentario String)

[//]: # (        -usuario Usuario)

[//]: # (        -filme Filme)

[//]: # (        +Avaliacao&#40;nota:int, comentario:String, usuario:Usuario, filme:Filme&#41;)

[//]: # (        +toString&#40;&#41;)

[//]: # (    })

[//]: # (    )
[//]: # (    class Usuario {)

[//]: # (        -nome String)

[//]: # (        -email String)

[//]: # (        -senha String)

[//]: # (        +Usuario&#40;nome:String, email:String, senha:String&#41;)

[//]: # (        +toString&#40;&#41;)

[//]: # (    })

[//]: # (    class Filme {)

[//]: # (        -titulo String)

[//]: # (        -anoLanc int)

[//]: # (        -genero String)

[//]: # (        -diretor Diretor)

[//]: # (        -atores ArrayList~Ator~)

[//]: # (        -avaliacoes ArrayList~Avaliacao~)

[//]: # (        +Filme&#40;titulo:String, anoLanc:int, genero:String, diretor:Diretor&#41;)

[//]: # (        +toString&#40;&#41;)

[//]: # (    })

[//]: # (    class Diretor {)

[//]: # (        -nome String)

[//]: # (        -email String)

[//]: # (        +Diretor&#40;nome:String, email:String&#41;)

[//]: # (        +toString&#40;&#41;)

[//]: # (    })

[//]: # (    Filme "0..*" <-- "1" Diretor)

[//]: # (    Filme "1..*" <-- "1..*" Ator)

[//]: # (    Filme "1" *-- "1..*" Avaliacao)

[//]: # (    Usuario "1" --> "0..*" Avaliacao)

[//]: # ()
[//]: # ()
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