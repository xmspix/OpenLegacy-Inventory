package com.example.OpenLegacy.model;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Item {
    @Id
    @SequenceGenerator(name = "some_seq", sequenceName = "xx_seq",initialValue = 4 )
//    @GeneratedValue
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "some_seq")
    @Column(name = "item_no")
    private long itemNo;
    @Column(name = "name")
    private String name;
    @Column(name = "amount")
    private int amount;
    @Column(name = "inventory_code")
    private String inventoryCode;

    public long getItemNo() {
        return itemNo;
    }

    public void setItemNo(long itemNo) {
        this.itemNo = itemNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }
}
