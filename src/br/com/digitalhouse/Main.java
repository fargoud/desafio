package br.com.digitalhouse;

public class Main {

    public static void main(String[] args) {
        Filho filhoUm = new Filho("Maria", "Jorge", "Jose");
        Filho filhoDois = new Filho("Maria", "Fernando", "Ana");

        mesmaMae(filhoUm, filhoDois);
        mesmoPai(filhoUm, filhoDois);
        System.out.println(saoMeioIrmaos(filhoUm, filhoDois));
    }

    //---------------------------------------------------------------------------------------------

    public static String maeDe(Filho novofilho) {
        return novofilho.getMae();
    }

    public static String paiDe(Filho novoFilho) {
        return novoFilho.getPai();
    }

    public static boolean mesmaMae(Filho filhoUm, Filho filhoDois) {
        return maeDe(filhoUm).equals(maeDe(filhoDois));
    }

    public static boolean mesmoPai(Filho filhoUm, Filho filhoDois) {
        return paiDe(filhoUm).equals(paiDe(filhoDois));
    }


    public static boolean saoMeioIrmaos(Filho filhoUm, Filho filhoDois) {
        return mesmaMae(filhoUm, filhoDois) && !mesmoPai(filhoUm, filhoDois)
                || !mesmaMae(filhoUm, filhoDois) && mesmoPai(filhoUm, filhoDois);
    }
}
