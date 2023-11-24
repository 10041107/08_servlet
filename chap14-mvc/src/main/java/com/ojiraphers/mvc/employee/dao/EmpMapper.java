package com.ojiraphers.mvc.employee.dao;

import com.ojiraphers.mvc.employee.dto.EmpDTO;
import com.ojiraphers.mvc.employee.dto.EmpInsertDTO;

import java.util.List;

public interface EmpMapper {

    EmpDTO selectByEmpId(int empId);

    List<EmpDTO> selectAllEmp();

    int insert(EmpInsertDTO insert);


}
