package explicacionInterfaces;

public class Mariposa extends Crisalida implements Volador{

    public Mariposa(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void volar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'volar'");
    }



}
