package explicacionInterfaces;

public abstract class Pajaro extends Animal implements Volador{

    public Pajaro(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void volar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'volar'");
    }



}
