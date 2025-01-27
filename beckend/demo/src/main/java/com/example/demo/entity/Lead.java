package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "leads")
public class Lead {
    @Id
    private String lid;
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
}
