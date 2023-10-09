public class Listing implements listingInter{

    private String listTitle;
    private String sellerName;
    private String description;

    public Listing(String title, String name, String description){
        this.listTitle = title;
        this.sellerName = name;
        this.description = description;
    }

    public String getListTitle() {
        return listTitle;
    }

    public void setListTitle(String listTitle) {
        this.listTitle = listTitle;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "listTitle='" + listTitle + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public void addListing() {
        //NEED TO IMPLEMENT
    }

    @Override
    public void deleteListing() {
        //NEED TO IMPLEMENT
    }

    @Override
    public void editListing() {
        //NEED TO IMPLEMENT
    }

    @Override
    public void updateListingStatus() {
        //NEED TO IMPLEMENT
    }
}
