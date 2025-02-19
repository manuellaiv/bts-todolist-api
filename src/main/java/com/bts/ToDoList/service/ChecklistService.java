package com.bts.ToDoList.service;

import com.bts.ToDoList.data.models.Checklist;
import com.bts.ToDoList.data.repository.ChecklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ChecklistService {
    @Autowired
    private ChecklistRepository checklistRepository;

    public List<Checklist> getAllChecklists() {
        return checklistRepository.findAll();
    }

    public Optional<Checklist> getChecklistById(UUID id) {
        return checklistRepository.findById(id);
    }

    public Checklist createChecklist(Checklist checklist) {
        return checklistRepository.save(checklist);
    }

    public void deleteChecklist(UUID id) {
        checklistRepository.deleteById(id);
    }
}
