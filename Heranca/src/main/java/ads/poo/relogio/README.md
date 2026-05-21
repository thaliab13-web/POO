````mermaid
classDiagram
    class Display7Segmentos {
        -numero: int
        -segmentos:ArrayList~Segmento~
        +mostrarNumero()
        +desenhar()
        
    }
    class RelogioDigital {
        -hora: int
        -minuto: int
        -segundo: int
        -displays:ArrayList~Display7Segmentos~
        +atualizar()
        +desenhar()
    }
    class Segmento {
        -ligado: boolean
        -cor: String
        +ligar()
        +desligar()
        +desenhar()
        
    }
    class App {
        +main()
        
    }
    RelogioDigital --* Display7Segmentos
    Display7Segmentos --* Segmento
    RelogioDigital --* App
````