package com.example.OpenLegacy.controller;

import com.example.OpenLegacy.model.Item;
import com.example.OpenLegacy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/item")
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok().body(itemService.getAllItems());
    }

    @GetMapping("/{itemno}")
    public ResponseEntity<Item> getItemByNo(@PathVariable long itemno) {
        return ResponseEntity.ok().body(itemService.getItemByNo(itemno));
    }

    @PostMapping
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        return ResponseEntity.ok().body(this.itemService.addItem(item));
    }

    @PutMapping("/{itemno}")
    public ResponseEntity<Item> updateItem(@PathVariable long itemno, @RequestBody Item item) {
        item.setItemNo(itemno);
        return ResponseEntity.ok().body(this.itemService.updateItem(item));
    }

    @DeleteMapping("/{itemno}")
    public HttpStatus deleteItem(@PathVariable long itemno) {
        this.itemService.deleteItem(itemno);
        return HttpStatus.OK;
    }

}
