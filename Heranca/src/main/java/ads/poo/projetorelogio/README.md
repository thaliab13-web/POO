````mermaid
classDiagram
    direction TB


    class Desenhavel {
<<interface>>
+desenhar(draw)
}

class Cronometro {
<<interface>>
+iniciar()
+parar()
+reiniciar()
}

class Relogio {
<<abstract>>
#hora : int
#minuto : int
#segundo : int
+avancarTempo()
+configurarHora(h,m,s)
}

class RelogioDigital {
<<abstract>>
#tamanho : String
#modo : String
+desenhar(draw)
}

class Relogio7Segmentos {
+desenhar(draw)
}

class RelogioTexto {
-tamanhoFonte : int
+desenhar(draw)
}

class RelogioAnalogico {
+desenhar(draw)
}

class App {
-draw : Draw
-relogios : ArrayList~Relogio~
+main(args)
}

Relogio <|-- RelogioDigital
Relogio <|-- RelogioAnalogico

RelogioDigital <|-- Relogio7Segmentos
RelogioDigital <|-- RelogioTexto

Desenhavel <|.. Relogio
Cronometro <|.. RelogioDigital

App --> Relogio 
App --> Draw
````