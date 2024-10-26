package ejemplo;

public class Animal extends SerVivo{

    public int edad;

    public Animal(int edad, String especie){
        super(especie);
        this.edad = edad;
    }

}
