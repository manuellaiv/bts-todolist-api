package com.bts.ToDoList.service;

import com.bts.ToDoList.data.models.Item;
import com.bts.ToDoList.data.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItemsByChecklistId(String checklistId) {
        return itemRepository.findByChecklistId(checklistId);
    }

    public Optional<Item> getItemById(UUID id) {
        return itemRepository.findById(id);
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(UUID id, Item updatedItem) {
        return itemRepository.findById(id).map(item -> {
            item.setDetail(updatedItem.getDetail());
            item.setDone(updatedItem.getDone());
            return itemRepository.save(item);
        }).orElse(null);
    }

    public void deleteItem(UUID id) {
        itemRepository.deleteById(id);
    }

    public Item updateItemStatus(UUID id, Boolean isDone) {
        return itemRepository.findById(id).map(item -> {
            item.setDone(isDone);
            return itemRepository.save(item);
        }).orElse(null);
    }
}
