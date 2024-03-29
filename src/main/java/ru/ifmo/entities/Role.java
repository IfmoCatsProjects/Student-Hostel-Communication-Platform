package ru.ifmo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="role")
@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="role_name")
    private String roleName;
}
