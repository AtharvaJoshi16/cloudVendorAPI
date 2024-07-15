package com.exampleSQL.CVendor.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloudvendors_info")
public class CloudVendor
{
    @Id
    private String vendorID;
    private String vendorName;
    private String vendorAddress;
    private String vendorNumber;



    public CloudVendor(String venName, String venID, String venAddress, String venNumber) {
        this.vendorName = venName;
        this.vendorID = venID;
        this.vendorAddress = venAddress;
        this.vendorNumber = venNumber;
    }
    public CloudVendor() {
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorNumber() {
        return vendorNumber;
    }

    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }



}
