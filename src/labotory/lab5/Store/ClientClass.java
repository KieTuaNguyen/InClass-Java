package labotory.lab5.Store;

public class ClientClass {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Nha Hang Tai Gia", 2000, 150);
        System.out.println(restaurant);
        System.out.println("--------------------------------");
        WebStore webStore = new WebStore("Cua Hang Website", "192.168.1.3", "Java Programming Language");
        System.out.println(webStore);
        System.out.println("--------------------------------");
    }
}
