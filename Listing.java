package com.abc.main

import java.util.ArrayList;
import java.util.List;

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

//    @Override
//    public void addListing() {
//        //NEED TO IMPLEMENT
//    }
//
//    @Override
//    public void deleteListing() {
//        //NEED TO IMPLEMENT
//    }
//
//    @Override
//    public void editListing() {
//        //NEED TO IMPLEMENT
//    }
//
//    @Override
//    public void updateListingStatus() {
//        //NEED TO IMPLEMENT
    }
}

public class ListingService {

    private List<Listing> listings = new ArrayList<>();

    public void addListing(Listing listing) {
        listings.add(listing);
    }

    public void deleteListing(Listing listing) {
        listings.remove(listing);
    }

    public void editListing(Listing oldListing, Listing updatedListing) {
        int index = listings.indexOf(oldListing);
        if(index != -1) {
            listings.set(index, updatedListing);
        }
    }

    public void updateListingStatus(Listing listing, String newStatus) {
        int index = listings.indexOf(listing);
        if(index != -1) {
            listing.setDescription(newStatus);
        }
    }
}
