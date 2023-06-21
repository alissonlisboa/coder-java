package desafio_heranca_01;

public class Car {

    Double currentSpeed = 0.0;
    protected Double acceleration = 5.0;

    public void speedUp() {
        currentSpeed += this.acceleration;
    }

    public void brake() {
        currentSpeed -= this.acceleration;
        if (currentSpeed < 0)
            currentSpeed = 0d;
    }

}