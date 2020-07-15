//package LambdaTrening;
//
//public class RoznicaMiedzyStosemAstreta {
//
//    public static void main(String[] args) {
//        int i = 10;
//        System.out.println(i);
//        metodka(i);
//        System.out.println(i);
//        Lekarz l = new Lekarz(1, "Kamil", 40);
//        System.out.println(l.getWiek());
//        metodka(l);
//        System.out.println(l.getWiek());
//        int wiekLekarza = l.getWiek();
//        MojaMetoda mMetoda = s -> 0;
//        obliczPodatek(100, mMetoda);
//        Predicate<Integer> tPredicate = s -> {
//            if (s < 0) {
//                return false;
//            }
//            return true;
//        };
//    }
//
//    public boolean oblicz(Integer s) {
//        if (s < 0) {
//            return false;
//        }
//        return true;
//    }
//
//    public static void obliczPodatek(int cena, MojaMetoda mMetoda) {
//        // cos sobie tam robie
//        double oblicz = mMetoda.oblicz(cena);
//        //cos innego
//    }
//
//    public static void metodka(Lekarz k) {
//        k.setWiek(45);
//        System.out.println(k.getWiek());
//    }
//
//    public static void metodka(int k) {
//        k++;
//        System.out.println(k);
//    }
//}
//
