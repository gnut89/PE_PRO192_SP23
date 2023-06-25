
public class WordData extends Factory implements IConnect {
    private String content;
    
    public WordData(String type, String dataSource) {
        super(type, dataSource);
        this.content = "this is a string";
    }

    @Override
    public void readData() {
        String s = super.getType();
        if (s.substring(s.length() - 4).equals(".doc")) {
            this.content = "humpty dumpty sat on the wall";
        }
    }

    @Override
    public String writeData() {
        String[] a = content.split(" ");
        String s = "";
        for (int i = 0; i < a.length; i++) {
//            humpty
            StringBuilder sb = new StringBuilder(a[i]);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            s += sb.toString() + " ";
        }
        return s.trim();
    }

    @Override
    public boolean makeConnection() {
        if (getDataSource().contains("localhost:8080")) {
            return true;
        } else return false;
    }
    
}