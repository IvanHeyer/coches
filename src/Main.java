public class Main {
    public static void main(String[] args) {
        suma(2,3,4);


        coche miCoche = new coche();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        System.out.println("Suma es: " +(a+b+c));
    }

}

class coche{
    int puertas = 0;

    public void  AgregarPuertas() {
        this.puertas++;
    }
}