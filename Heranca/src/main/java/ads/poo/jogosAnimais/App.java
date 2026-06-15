package ads.poo.jogosAnimais;

public class App {

    static void main(String[] args) {

        Animal[] animais = {
                new Arara("Blue"),
                new Avestruz("Bil"),
                new Baleia("Willi"),
                new Cachorro("Toto"),
                new Gato("Pity"),
                new Leao("Rei"),
                new Lobo("Lobis"),
                new Macaco("Chico"),
                new Morcego("Batman"),
                new Pinguim("Bob"),
                new Ornitorrinco("Chefe")
        };

        for (Animal animal : animais) {

            IO.println(animal);
        }

    }
}
