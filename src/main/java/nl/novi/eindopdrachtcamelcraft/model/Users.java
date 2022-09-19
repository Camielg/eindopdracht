package nl.novi.eindopdrachtcamelcraft.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")

public class Users {
    @Id
    private String name;
    private int age;
    private String email;
}
