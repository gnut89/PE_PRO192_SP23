
public abstract class Factory {
    private String type;
    private String dataSource;

    public Factory() {
    }

    public Factory(String type, String dataSource) {
        this.type = type;
        this.dataSource = dataSource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
    
    public abstract void readData();
    public abstract String writeData();
    
}