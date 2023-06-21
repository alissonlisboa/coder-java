package desafio_heranca_01;

public class TesteCar {
    
    public static void main(String[] args) {
        Car ferrari = new Ferrari();
        Car gol = new Gol();
        
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();

        gol.speedUp();
        gol.brake();
        gol.brake();
        
        System.out.println(gol.currentSpeed);
        System.out.println(ferrari.currentSpeed);
    }
    
}
