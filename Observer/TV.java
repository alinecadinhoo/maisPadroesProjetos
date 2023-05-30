package Observer;

public class TV implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Revebendo a noticia via TV" + subject.toString());
    }
}
