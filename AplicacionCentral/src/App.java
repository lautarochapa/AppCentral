import modelo.Consultorio;
import controlador.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

           
        Consultorio cons = new Consultorio();

           // Consultorio.addDoctor(null);

            cons.addDoctor(null);


            Api api = new Api();

            api.hacerAlgo();
    }
}
