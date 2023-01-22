package com.example.democrud.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTodo;

    private String description;

   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "user_id", referencedColumnName = "idUser")
   private User userId;



}
