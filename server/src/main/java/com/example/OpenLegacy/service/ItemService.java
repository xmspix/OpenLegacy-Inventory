package com.example.OpenLegacy.service;

import com.example.OpenLegacy.model.Item;

import java.util.List;

public interface ItemService {
    Item addItem(Item item);
    Item updateItem(Item item);
    List<Item> getAllItems();
    Item getItemByNo(long itemNo);
    void deleteItem(long itemNo);
}
