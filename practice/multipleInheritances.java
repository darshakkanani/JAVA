interface Vehicle {
    void start();
    void stop();
}

interface MusicPlayer {
    void playMusic();
    void stopMusic();
}

class Car implements Vehicle, MusicPlayer {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void playMusic() {
        System.out.println("Music playing in the car.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped in the car.");
    }
}

public class multipleInheritances {
    public static void main(String[] args) {
        System.out.println("Prince_Chhodavadiya");
        Car car = new Car();
        car.start();
        car.playMusic();
        car.stopMusic();
        car.stop();
    }
}
