package desafio_heranca_02;

public class Car {

    final Double MAX_SPEED;
    Double currentSpeed = 0.0;
    protected Double acceleration = 5.0;
    
    Car(Double maxSpeed) {
        MAX_SPEED = maxSpeed;
    }

    public void speedUp() {
        currentSpeed += this.acceleration;
        if (currentSpeed > MAX_SPEED)
            currentSpeed = MAX_SPEED;
    }

    public void brake() {
        currentSpeed -= this.acceleration;
        if (currentSpeed < 0)
            currentSpeed = 0d;
    }

}