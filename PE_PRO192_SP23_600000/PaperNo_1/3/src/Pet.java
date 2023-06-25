
import java.util.ArrayList;


public class Pet implements ITax {
    private String name;
    private String birthDay;
    private ArrayList<Service> usedService;

    public Pet(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
        usedService = new ArrayList<>();
    }
    
    public void addService(String nameService, int price) {
        usedService.add(new Service(nameService, price));
    }

    @Override
    public String toString() {
        return name + "-" + getTotalMoney() + "-" + getTax();
    }
    
    
    
    @Override
    public double getTax() {
        return VAT * getTotalMoney();
    }

    @Override
    public double getTotalMoney() {
        double money = 0;
        for (int i = 0; i < usedService.size(); i++) {
            money += usedService.get(i).getPrice();
        }
        String[] a = birthDay.split("/");
        int birth = Integer.parseInt(a[0]);
        if (birth >= 10 && birth <= 12) {
            money = money * 0.95;
        }
        return money;
    }
    
}