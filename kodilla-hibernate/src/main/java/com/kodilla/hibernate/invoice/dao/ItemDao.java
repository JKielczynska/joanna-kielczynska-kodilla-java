package com.kodilla.hibernate.invoice.dao;

import javax.transaction.Transactional;

import com.kodilla.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {
}
