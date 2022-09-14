package net.javaguides.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//@Data---> Every Annotation

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    
    @Column(name="first_name")
            private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="email_id")
    private String emailId;
}
