package net.apmoller.microservices.ems.api.Model;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {

    private long empId;

    private String empName;
    private int empAge;
    @NonNull
    private String password;
    private String designation;
    private String location;
    private String workingStatus;
    private String bankAccountNumber;
    private double salary;
    @NonNull
    private LocalDateTime joiningDate;
    private boolean isAssignedToProject;

}
