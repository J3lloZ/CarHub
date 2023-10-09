public class Seller extends Profile{

    private String city;
    public Seller(String name, String phoneNumber, String email, String city) {
        super(name, phoneNumber, email);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return super.toString() + "Seller{" +
                "city='" + city + '\'' +
                '}';
    }
}
