package explicacionInterfaces;

public class Aguila extends Pajaro implements Carnivoro{

    public Aguila(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comeCarne() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comeCarne'");
    }



}