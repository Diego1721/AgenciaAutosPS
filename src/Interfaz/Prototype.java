package Interfaz;

import MisClases.Chevrolet;
import MisClases.Lamborghini;
import MisClases.Ford;

public class Prototype {

    public Chevrolet Prochevrolet;
    public Lamborghini Prolambo;
    public Ford ProFord;

    public void NuevoPrototipo() {
        Prochevrolet = new Chevrolet();
        Prolambo = new Lamborghini();
        ProFord = new Ford();
    }
}
