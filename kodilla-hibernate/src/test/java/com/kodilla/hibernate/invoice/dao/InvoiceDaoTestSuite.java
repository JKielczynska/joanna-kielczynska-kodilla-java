package com.kodilla.hibernate.invoice.dao;

import java.math.BigDecimal;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;

    @After
    public void afterEveryTest() {
        invoiceDao.deleteAll();
        productDao.deleteAll();
    }
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("001/2017");
        Product product = new Product("Sample product");
        Item item1 = new Item(new BigDecimal(25.5), 15);
        Item item2 = new Item(new BigDecimal(22.5), 20);

        item1.setProduct(product);
        item2.setProduct(product);
        item1.setInvoice(invoice);
        item1.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        //When
        productDao.save(product);
        int productId = product.getId();
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        //Then
        Assert.assertNotEquals(0, productId);
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertEquals(2, invoice.getItems().size());
    }
}
