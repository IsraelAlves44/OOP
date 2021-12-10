package relacionamendodeclasses;

public class Principal {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f,
                68.9f, 11, 2, 4);
        l[1] = new Lutador("putscript", "Brasil", 29, 1.70f,
                55.9f, 7, 4, 9);
        Luta uec01 = new Luta();
        uec01.marcarLuta(l[0], l[1]);
        uec01.lutar();
    }
}
