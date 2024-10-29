package Level3;

public class Generic {
    public <T extends Telephone> void telephone(T phone){
        phone.call();
        //phone.takePhotos(); Can't call this method because it's not from the Telephone interface
    }

    public <T extends Smartphone> void smartphone(T phone){
        phone.call();
        phone.takePhotos();
    }
}
