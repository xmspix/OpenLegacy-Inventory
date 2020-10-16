package com.example.OpenLegacy.service;

import com.example.OpenLegacy.exception.ResourceNotFoundException;
import com.example.OpenLegacy.model.Item;
import com.example.OpenLegacy.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ItemServicelmpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(Item item) {
        Optional<Item> itemDB = this.itemRepository.findById(item.getItemNo());

        if(itemDB.isPresent()){
            Item itemUpdate = itemDB.get();
            itemUpdate.setItemNo(item.getItemNo());
            itemUpdate.setName(item.getName());
            itemUpdate.setAmount(item.getAmount());
            itemUpdate.setInventoryCode(item.getInventoryCode());
            itemRepository.save(itemUpdate);
            return itemUpdate;
        } else{
            throw new ResourceNotFoundException("Record not found by Item No:"+item.getItemNo());
        }
    }

    @Override
    public List<Item> getAllItems() {
        return this.itemRepository.findAll();
    }

    @Override
    public Item getItemByNo(long itemNo) {
        Optional<Item> itemDB = this.itemRepository.findById(itemNo);
        if(itemDB.isPresent()){
            return itemDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found by Item No:"+itemNo);
        }
    }

    @Override
    public void deleteItem(long itemNo) {
        Optional<Item> itemDB = this.itemRepository.findById(itemNo);
        if(itemDB.isPresent()){
           this.itemRepository.delete(itemDB.get());
        } else {
            throw new ResourceNotFoundException("Record not found by Item No:"+itemNo);
        }
    }
}
