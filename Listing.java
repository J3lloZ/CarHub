public class Listing implements listingInter{

    private String listTitle;
    private Seller seller;
    private Vehicle vehicle;
    private String description;

    public Listing(String title, Seller seller,Vehicle vehicle, String description){
        this.listTitle = title;
        this.seller = seller;
        this.vehicle = vehicle;
        this.description = description;
    }

    public String getListTitle() {
        return listTitle;
    }

    public void setListTitle(String listTitle) {
        this.listTitle = listTitle;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "listTitle='" + listTitle + '\'' +
                ", seller=" + seller +
                ", vehicle=" + vehicle +
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
