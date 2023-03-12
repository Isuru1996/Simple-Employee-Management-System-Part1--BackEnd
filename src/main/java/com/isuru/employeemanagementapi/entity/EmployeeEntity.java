package com.isuru.employeemanagementapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="employees")
public class EmployeeEntity {
    @Id
    @SequenceGenerator(
            name="employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
