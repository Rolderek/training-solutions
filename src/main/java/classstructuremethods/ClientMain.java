package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("John Doe");
        client.setYear(1896);
        client.setAddress("1191 Budapest Arany János Utca 2-14.");

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        client.migrate("3903 Bekecs Tűzoltó utca 82.");
        System.out.println("Elköltöztél, íme az új címed: " + client.getAddress());


    }
}
