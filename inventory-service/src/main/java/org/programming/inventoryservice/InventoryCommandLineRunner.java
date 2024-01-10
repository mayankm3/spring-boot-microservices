package org.programming.inventoryservice;


import lombok.RequiredArgsConstructor;
import org.programming.inventoryservice.repository.InventoryRepository;
import org.programming.inventoryservice.model.Inventory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * This class is used to insert 2 records at start up
 */
@Component
@RequiredArgsConstructor
public class InventoryCommandLineRunner implements CommandLineRunner {

    private final InventoryRepository inventoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Inventory inventory1 = new Inventory();
        inventory1.setSkuCode("iphone_13");
        inventory1.setQuantity(100);

        Inventory inventory2 = new Inventory();
        inventory2.setSkuCode("iphone_13_red");
        inventory2.setQuantity(0);

        inventoryRepository.save(inventory1);
        inventoryRepository.save(inventory2);
    }
}
