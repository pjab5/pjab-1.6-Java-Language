package Level3;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Generic generic = new Generic();
        generic.telephone(smartphone);
        generic.smartphone(smartphone);
    }
}
