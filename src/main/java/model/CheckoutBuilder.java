package model;

public class CheckoutBuilder {
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

    public CheckoutBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CheckoutBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CheckoutBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public CheckoutBuilder withStreet(String street) {
        this.street = street;
        return this;
    }

    public CheckoutBuilder withHome(String home) {
        this.home = home;
        return this;
    }

    public CheckoutBuilder withFlat(String flat) {
        this.flat = flat;
        return this;
    }

    public CheckoutBuilder withPorch(String porch) {
        this.porch = porch;
        return this;
    }

    public CheckoutBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    public CheckoutBuilder withFloor(String floor) {
        this.floor = floor;
        return this;
    }

    public CheckoutBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public CheckoutBuilder withData(String data) {
        this.data = data;
        return this;
    }

    public CheckoutBuilder withTime(String time) {
        this.time = time;
        return this;
    }

    public CheckoutBuilder withCoupon(String coupon) {
        this.coupon = coupon;
        return this;
    }

    public CheckoutBuilder withChangeFrom(String changeFrom) {
        this.changeFrom = changeFrom;
        return this;
    }

    public CheckoutBuilder withNoChange(String noChange) {
        this.noChange = noChange;
        return this;
    }

    public CheckoutBuilder withTypePayment(String typePayment) {
        this.typePayment = typePayment;
        return this;
    }

    public Checkout build(){
        return new Checkout(name, phoneNumber, email, street, home, flat, porch, code, floor, comment,
                data, time, coupon, changeFrom, noChange, typePayment);
    }
}
