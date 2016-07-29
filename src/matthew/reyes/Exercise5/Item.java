package src.matthew.reyes.Exercise5;

/**
 * Created by victorreyes on 29/07/2016.
 */
public class Item {
    private int id;
    private String itemDescription;
    private String itemType;
    private float price;

    public Item() {
        this.id = 9999;
        this.itemDescription = "Item Description";
        this.itemType = "Item Type";
        this.price = 300.00f;
    }

    public Item(int id, String itemDescription, String itemType, float price) {
        this.id = id;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

