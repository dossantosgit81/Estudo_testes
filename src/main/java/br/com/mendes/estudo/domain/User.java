package br.com.mendes.estudo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    private Integer id;
    private String name;
    private String email;
    private String password;

}
