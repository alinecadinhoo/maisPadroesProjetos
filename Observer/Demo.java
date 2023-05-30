package Observer;

public class Demo {
    public static void main(String[] args) {

        Jornalista jornalista = new Jornalista();
        jornalista.add(new TV());
        jornalista.notifyAll("Teste");


    }
}
