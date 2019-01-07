package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product nails = new Product("Nails");
        Product screws = new Product("Screws");
        Product hammer = new Product("Hammer");

        Item nailsItem = new Item(new BigDecimal("0.18"),18342);
        Item screwsItem = new Item(new BigDecimal("0.52"),40322);
        Item hammerItem = new Item(new BigDecimal("14.85"), 70);

        Invoice invoice = new Invoice("123234");

        nailsItem.setProduct(nails);
        nailsItem.setInvoice(invoice);
        screwsItem.setProduct(screws);
        screwsItem.setInvoice(invoice);
        hammerItem.setProduct(hammer);
        hammerItem.setInvoice(invoice);

        nails.getItemList().add(nailsItem);
        screws.getItemList().add(screwsItem);
        hammer.getItemList().add(hammerItem);

        invoice.getItemList().add(nailsItem);
        invoice.getItemList().add(screwsItem);
        invoice.getItemList().add(hammerItem);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoice);

        //CleanUp
        try {
            invoiceDao.delete(invoice);
        } catch (Exception e) {
            //do nothing
        }
    }
}
