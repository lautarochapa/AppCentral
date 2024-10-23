package explicacionInterfaces;

public class Cocodrilo extends Animal implements Carnivoro{

    public Cocodrilo(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comeCarne() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comeCarne'");
    }

}
