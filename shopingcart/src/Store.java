import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        Phone P1 = new Phone("Samsung", 1000, "Galaxy S10", PhoneType.G5);
        Phone P2 = new Phone("Apple", 1500, "iPhone X", PhoneType.G6);
        Phone P3 = new Phone("Google", 800, "Pixel 3", PhoneType.G5);
        Phone P4 = new Phone("Samsung", 1000, "Galaxy S10", PhoneType.G5);

        phoneList.add(P1);
        phoneList.add(P2);
        phoneList.add(P3);
        phoneList.add(P4);


        for (Phone phone1 : phoneList) {
            System.out.println(phone1);
        }
        P1.exchange();
        P2.repair();
        P3.sell();
    }
}
