package org.isdb.StudentCrudRelation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentClassDTO {
    private Integer Id;
    private String name;     
    private Integer classTeacherId;
    private Integer roomNumber;

}
