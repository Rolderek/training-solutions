package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store bananaStore = new Store("banana");
        bananaStore.store(10);
        System.out.println(bananaStore.getProduct() + ": " + bananaStore.getStock());

        Store ribizliStore = new Store("ribizli");
        ribizliStore.store(20);
        System.out.println(ribizliStore.getProduct() + ": " + ribizliStore.getStock());

        bananaStore.dispatch(3);
        ribizliStore.dispatch(8);
        bananaStore.store(28);
        ribizliStore.store(5);

        System.out.println(bananaStore.getProduct() + ": " + bananaStore.getStock());
        System.out.println(ribizliStore.getProduct() + ": " + ribizliStore.getStock());
    }
}
