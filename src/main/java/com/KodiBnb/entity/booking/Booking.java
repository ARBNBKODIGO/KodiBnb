package com.KodiBnb.entity.booking;

import com.KodiBnb.entity.property.Property;
import com.KodiBnb.entity.user.Client;
import com.KodiBnb.entity.user.Supplier;

import java.util.Date;

public class Booking {

    private Property propiedad;
    private Date startDate;
    private Date endingDate;
    private Client client;
    private Supplier supplier;


    private void accept(){

    }

    private void decline(){

    }


    public Property getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Property propiedad) {
        this.propiedad = propiedad;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
