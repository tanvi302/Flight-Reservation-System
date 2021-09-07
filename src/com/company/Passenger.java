package com.company;

public class Passenger {
    private static int idCounter;
    static {
        idCounter = 0;
    }
    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    private Contact contact;
    public Passenger(String addressStreet, String addressCity,
                           String addressState, String contactName, String contactPhone,
                           String contactEmail) {
        this.idCounter++;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }
    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }
    public void updateAddressDetails(String street,String city ,String state){
        address.street=street;
        address.city=city;
        address.state=state;
        System.out.println("Address Details Updated Successfully ");
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }
    public void updateContactDetails(String name,String email ,String phone){
        contact.name=name;
        contact.email=email;
        contact.phone=phone;
        System.out.println("Contact Details Updated Successfully ");
    }
    public int getPassengerCount( ){ return idCounter;}
}
