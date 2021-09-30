package mx.edu.utez.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="Customers")
@XmlAccessorType(XmlAccessType.FIELD)

public class Customers {

        @XmlElement
        private int customerNumber;
        @XmlElement
        private String customerName;
        @XmlElement
        private String contactLasttName;
        @XmlElement
        private String contactFirstName;
        @XmlElement
        private String phone;
        @XmlElement
        private String addressLine1;
        @XmlElement
        private String addressLine2;
        @XmlElement
        private String city;
        @XmlElement
        private String state;
        @XmlElement
        private String postalCode;
        @XmlElement
        private String country;
        @XmlElement
        private int salesRepEmployeeeNumber;
        @XmlElement
        private double creditLim;

        public Customers (){

        }

    public Customers(int customerNumber, String customerName, String contactLasttName, String contactFirstName, String phone, String addressLine1, String addressLine2, String city, String state, String postalCode, String country, int salesRepEmployeeeNumber, double creditLim) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.contactLasttName = contactLasttName;
        this.contactFirstName = contactFirstName;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.salesRepEmployeeeNumber = salesRepEmployeeeNumber;
        this.creditLim = creditLim;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactLasttName() {
        return contactLasttName;
    }

    public void setContactLasttName(String contactLasttName) {
        this.contactLasttName = contactLasttName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSalesRepEmployeeeNumber() {
        return salesRepEmployeeeNumber;
    }

    public void setSalesRepEmployeeeNumber(int salesRepEmployeeeNumber) {
        this.salesRepEmployeeeNumber = salesRepEmployeeeNumber;
    }

    public double getCreditLim() {
        return creditLim;
    }

    public void setCreditLim(double creditLim) {
        this.creditLim = creditLim;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customerNumber=" + customerNumber +
                ", customerName='" + customerName + '\'' +
                ", contactLasttName='" + contactLasttName + '\'' +
                ", contactFirstName='" + contactFirstName + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", salesRepEmployeeeNumber=" + salesRepEmployeeeNumber +
                ", creditLim=" + creditLim +
                '}';
    }
}
