/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author NUWAA
 */
class Item {
    int itemId;
    String itemName;
    String itemExpireDate;

    public Item(int itemId, String itemName, String itemExpireDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemExpireDate = itemExpireDate;
    }
}

class ItemComparator implements Comparator<Item> {
    public int compare(Item item1, Item item2) {
        return item1.itemExpireDate.compareTo(item2.itemExpireDate);
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Item> priorityQueue = new PriorityQueue<>(new ItemComparator());

        priorityQueue.add(new Item(1, "Signal Tooth Paste", "2023/02/02"));
        priorityQueue.add(new Item(2, "MD Mixed Fruit Jam", "2023/02/12"));
        priorityQueue.add(new Item(3, "Dried Sparts 1KG Pack", "2023/04/05"));
        priorityQueue.add(new Item(4, "Fresh Milk 1L", "2023/01/07"));

        while (!priorityQueue.isEmpty()) {
            Item item = priorityQueue.poll();
            System.out.println("Item ID: " + item.itemId + ", Item Name: " + item.itemName + ", Expire Date: " + item.itemExpireDate);
        }
    }
}
