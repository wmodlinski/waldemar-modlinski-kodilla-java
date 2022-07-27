package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Computer");
        Product product2 = new Product("Game");
        Item item1 = new Item(product1, new BigDecimal(5000), 1, new BigDecimal(5000));
        Item item2 = new Item(product2, new BigDecimal(190), 2, new BigDecimal(380));
        item1.setProduct(product1);
        item2.setProduct(product2);
        Invoice invoice = new Invoice("11/2021");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);

    }
}