
import java.util.ArrayList;


public class TaskList extends ArrayList<String> implements ITask{

    public void addTask(String task) {
        this.add(task);
    }

    @Override
    public double getWorkingHours(String place) {
        double increa;
        if (place.equalsIgnoreCase("hcm")) {
            increa = 5;
        } else {
            increa = 2;
        }
        double total = 0;
        for (int i = 0; i < this.size(); i++) {
            String[] a = this.get(i).split("@");
            if (a[1].contains(place.toLowerCase()) || a[1].contains(place.toUpperCase())) {
                total += increa;
            }
        }
        return total;
    }

    @Override
    public String getTaskName(String place) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            String[] a = this.get(i).split("@");
            if (a[1].contains(place.toLowerCase()) || a[1].contains(place.toUpperCase())) {
                sb.append(a[0]);
                sb.append(";");
            }
        }
        return sb.toString();
    }
    
  
    
}
