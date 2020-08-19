package model;

public class Checkout {
    private String name;
    private String phoneNumber;
    private String email;
    private String street;
    private String home;
    private String flat;
    private String porch;
    private String code;
    private String floor;
    private String comment;
    private String data;
    private String time;
    private String coupon;
    private String changeFrom;
    private String noChange;
    private String typePayment;

    public Checkout(String name, String phoneNumber, String email, String street, String home,
                    String flat, String porch, String code, String floor, String comment,
                    String data, String time, String coupon, String changeWith, String noChange, String typePayment) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.street = street;
        this.home = home;
        this.flat = flat;
        this.porch = porch;
        this.code = code;
        this.floor = floor;
        this.comment = comment;
        this.data = data;
        this.time = time;
        this.coupon = coupon;
        this.changeFrom = changeWith;
        this.noChange = noChange;
        this.typePayment = typePayment;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getStreet() {
        return street;
    }

    public String getHome() {
        return home;
    }

    public String getFlat() {
        return flat;
    }

    public String getPorch() {
        return porch;
    }

    public String getCode() {
        return code;
    }

    public String getFloor() {
        return floor;
    }

    public String getComment() {
        return comment;
    }

    public String getData() {
        return data;
    }

    public String getTime() {
        return time;
    }

    public String getCoupon() {
        return coupon;
    }

    public String getChangeWith() {
        return changeFrom;
    }

    public String getNoChange() {
        return noChange;
    }

    public String getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(String typePayment) {
        this.typePayment = typePayment;
    }

    public void setNoChange(String noChange) {
        this.noChange = noChange;
    }

    public void setChangeWith(String changeWith) {
        this.changeFrom = changeWith;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPorch(String porch) {
        this.porch = porch;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
