package com.kodilla.hibernate.invoice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(final BigDecimal price, final int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }

    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    private void setId(final int id) {
        this.id = id;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    private void setPrice(final BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    private void setValue(final BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(final Invoice invoice) {
        this.invoice = invoice;
    }
}
