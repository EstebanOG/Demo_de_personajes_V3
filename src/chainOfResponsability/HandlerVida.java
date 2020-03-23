package chainOfResponsability;

import animacion.Personaje;

public class HandlerVida extends Handler {

    @Override
    public void handlerRequest(int vida, int escudo, Personaje per) {
        if (vida < 100) {
            System.out.println("se aumenta vida");
            if (vida > 49) {
                vida = 100;
                per.setVida(vida);
            }
            if (vida < 50) {
            System.out.println("Vida menor a 50");
            vida = vida + 50;
            per.setVida(vida);
            }
        }else {
            successor.handlerRequest(vida, escudo, per);
        }
    }

}
