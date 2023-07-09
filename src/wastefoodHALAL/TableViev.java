package wastefoodHALAL;

public class TableViev {
    private String Resto;
    private String Menu;
    private int Stock;

    
    public TableViev(String resto, String menu, int stock) {
        Resto = resto;
        Menu = menu;
        Stock = stock;
    }


    public String getResto() {
        return Resto;
    }


    public String getMenu() {
        return Menu;
    }


    public int getStock() {
        return Stock;
    }

    
}
