package com.q1.inventory.service;

import com.q1.inventory.model.Inventory;
import com.q1.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    InventoryRepository repository;
    public Inventory checkStock(Long productId) {
        Optional<Inventory> inv = repository.findById(productId);
        return inv.get();
    }

    public String addProduct(Inventory inventory) {
        repository.save(inventory);
        return "Product Added";
    }

    public String updateProduct( Inventory inventory) {
        repository.save(inventory);
        return "Product Updated";
    }

    public String deleteProduct(Long productId) {
        repository.deleteById(productId);
        return "Product Deleted";
    }
}