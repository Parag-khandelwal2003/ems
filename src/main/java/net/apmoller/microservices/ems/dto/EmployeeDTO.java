package net.apmoller.microservices.ems.dto;

import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private long empId;
    private String empName;
    private int empAge;
    private String designation;
    private String location;
    private String workingStatus;
    private LocalDateTime joiningDate;
    private boolean isAssignedToProject;
}
