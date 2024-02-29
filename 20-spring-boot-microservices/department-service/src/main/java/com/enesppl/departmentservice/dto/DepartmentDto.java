package com.enesppl.departmentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.sql.exec.spi.StandardEntityInstanceResolver;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {

    private Long id ;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;



}
