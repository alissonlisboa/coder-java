package desafio_heranca_02;

public class TesteCar {
    
    public static void main(String[] args) {
        Car ferrari = new Ferrari(400d);
        Car gol = new Gol(180d);
        
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
