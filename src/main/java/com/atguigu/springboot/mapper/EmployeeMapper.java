package com.atguigu.springboot.mapper;


import com.atguigu.springboot.bean.Employee;

//@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
