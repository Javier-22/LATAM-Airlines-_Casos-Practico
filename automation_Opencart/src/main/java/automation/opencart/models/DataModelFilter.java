package automation.opencart.models;

public class DataModelFilter {
    private String strProduct_Name;

    public String getStrProduct_Name() {
        return strProduct_Name;
    }

    public void setStrProduct_Name(String strProduct_Name) {
        this.strProduct_Name = strProduct_Name;
    }

    public String getStrModel() {
        return strModel;
    }

    public void setStrModel(String strModel) {
        this.strModel = strModel;
    }

    public String getStrPrice() {
        return strPrice;
    }

    public void setStrPrice(String strPrice) {
        this.strPrice = strPrice;
    }

    public String getStrStatus() {
        return strStatus;
    }

    public void setStrStatus(String strStatus) {
        this.strStatus = strStatus;
    }

    private String strModel;
    private String strPrice;
    private String strStatus;

}
