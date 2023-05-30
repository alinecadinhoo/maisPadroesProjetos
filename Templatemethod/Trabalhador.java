package Templatemethod;

public abstract class Trabalhador {

    public void executar() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();

        }

    protected abstract void trabalhar();

    protected void voltarParaCasa() {
        System.out.println("Voltando pra casa");
    }

    protected void irAoTrabalho() {
        System.out.println("Indo Trabalhar");
    }

    protected void levantar() {
            System.out.println("Levantando da cama");
        }

    protected void iniciarRotina() {
        System.out.println("Iniciando rotina");

    }
}
