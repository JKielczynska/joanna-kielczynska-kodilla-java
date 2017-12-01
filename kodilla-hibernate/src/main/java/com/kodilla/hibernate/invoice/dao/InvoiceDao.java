package com.kodilla.hibernate.invoice.dao;

import javax.transaction.Transactional;

import com.kodilla.hibernate.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
}
