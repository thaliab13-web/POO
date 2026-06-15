//package ads.poo.cartasThalia;
//
//import java.util.ArrayList;
//
//public class CartaGrafica {
//    private ArrayList<Carta> cartas;
//
//    public CartaGrafica() {
//        cartas = new ArrayList<>();
//
//        String[] naipes = {
//                "Paus",
//                "Ouros",
//                "Copas",
//                "Espadas"
//        };
//
//        String[] valores = {
//                "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
//        };
//
//        for (String naipe : naipes) {
//            for (String valor : valores) {
//                cartas.add(new Carta(valor, naipe));
//            }
//        }
//    }
//    public void clicouDentro() {
//        for (Carta carta : cartas) {
//            IO.println(carta);
//        }
//    }
//}
