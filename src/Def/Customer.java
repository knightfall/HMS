package Def;

import java.util.*;
import java.sql.* ;
import java.math.*;

public class Customer {
//fsDcd.uts@17
    private Address address;
    private String customerID;
    private String name;
    private String phoneNum;
    private Gender gender;
    private CustomerType type;
    private Boolean validID;
    private int numberOfBooking;
    private String reservationID;
    private String bookingID;
    private String roomNumber;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public Boolean getValidID() {
        return validID;
    }

    public void setValidID(Boolean validID) {
        this.validID = validID;
    }

    public int getNumberOfBooking() {
        return numberOfBooking;
    }

    public void setNumberOfBooking(int numberOfBooking) {
        this.numberOfBooking = numberOfBooking;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Boolean addCustomer() {
        Boolean val;
        Connection conn = null;
        try {
            conn =
                    DriverManager.getConnection("");

            String InsertCustomer = "INSERT INTO `HMS`.`Customer`(`CustomerID`,`CustomerName`,`CustomerPhoneNum`,`Customergender`," +
                    "`CustomerValidID`,`CustomerStreetNumber`,`CustomeStreetName`,`CustomerSuburb`,`CustomerPostCode`)"+
                    "VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(InsertCustomer);
            pstmt.setString(1,this.customerID);
            pstmt.setString(2,this.name);
            pstmt.setString(3,this.phoneNum);
            pstmt.setString(4,gender.toString());
            pstmt.setInt(5, (validID? 1 : 0));
            pstmt.setString(6,address.getStreetNumber());
            pstmt.setString(7,address.getStreetName());
            pstmt.setString(8,address.getSuburb());
            pstmt.setString(9,address.getPostcode());
          val=  pstmt.executeUpdate()!=0;
            conn.close();
        } catch (SQLException ex) {
            val=false;
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return val;



    }


    public ArrayList<Customer> findCustomer(String args) {

        ArrayList<Customer> clist = new ArrayList<Customer>();
        Customer dd = new Customer();
        clist.add(dd);


        return clist;
    }

    public Boolean updateCustomer(String ID) {

        return true;
    }

    public Boolean deleteCustomer(String ID) {

        return true;
    }

    public Boolean changeCustomerType() {

        return true;
    }

}


