package com.example.OpenLegacy.repository;

import com.example.OpenLegacy.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface ItemRepository extends JpaRepository<Item, Long> {
}
