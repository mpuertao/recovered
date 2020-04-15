package com.springframework.recovered.unittest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Recovered  {

    @Id
    private int id;
    private String name;
    private int age;

}
