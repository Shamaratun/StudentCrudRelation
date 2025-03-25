package org.isdb.StudentCrudRelation.dto;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentClassDTO {
    @Nonnull
    @Size( min=3, max=30, message="Name must be between 3 and 30 characters")
    private String name;   
    @Nonnull
    @Size( message="Id must be Unique")
    private Integer classTeacherId;
    @Nonnull
    @Size(message="Room number must be between 1 and 10")

    private Integer roomNumber;

}
