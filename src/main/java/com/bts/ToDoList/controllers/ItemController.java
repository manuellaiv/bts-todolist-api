package com.bts.ToDoList.controllers;

import com.bts.ToDoList.data.models.Item;
import com.bts.ToDoList.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/checklist/{checklistId}")
    public List<Item> getItemsByChecklistId(@PathVariable String checklistId) {
        return itemService.getAllItemsByChecklistId(checklistId);
    }

    @GetMapping("/{id}")
    public Optional<Item> getItemById(@PathVariable UUID id) {
        return itemService.getItemById(id);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.createItem(item);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable UUID id, @RequestBody Item updatedItem) {
        return itemService.updateItem(id, updatedItem);
    }

    @PatchMapping("/{id}/status")
    public Item updateItemStatus(@PathVariable UUID id, @RequestParam Boolean isDone) {
        return itemService.updateItemStatus(id, isDone);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable UUID id) {
        itemService.deleteItem(id);
    }
}
