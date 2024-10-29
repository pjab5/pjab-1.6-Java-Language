package Level3;

public class Smartphone implements Telephone{
    @Override
    public void call() {
        System.out.println("Calling");
    }

    public void takePhotos(){
        System.out.println("Taking a photo");
    }
}
