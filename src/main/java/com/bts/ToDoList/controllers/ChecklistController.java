package com.bts.ToDoList.controllers;

import com.bts.ToDoList.data.models.Checklist;
import com.bts.ToDoList.service.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/checklists")
public class ChecklistController {
    @Autowired
    private ChecklistService checklistService;

    @GetMapping
    public List<Checklist> getAllChecklists() {
        return checklistService.getAllChecklists();
    }

    @GetMapping("/{id}")
    public Optional<Checklist> getChecklistById(@PathVariable UUID id) {
        return checklistService.getChecklistById(id);
    }

    @PostMapping
    public Checklist createChecklist(@RequestBody Checklist checklist) {
        return checklistService.createChecklist(checklist);
    }

    @DeleteMapping("/{id}")
    public void deleteChecklist(@PathVariable UUID id) {
        checklistService.deleteChecklist(id);
    }
}
