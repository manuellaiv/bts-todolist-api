package com.bts.ToDoList.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", length = 36, updatable = false, nullable = false)
    private UUID id;

    @Column(name = "checklist_id", nullable = false)
    private String checklistId;

    @Column(name = "detail", nullable = false)
    private String detail;

    @Column(name = "done", nullable = false)
    private Boolean done;
}
