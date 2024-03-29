package com.atguigu.springboot.mapper;


import com.atguigu.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/*告知springboot这个类是进行数据库的操作 */
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);


    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    /*自增id*/
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name)values(#{departmentName})")
    public int insertDept(Department department);


    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
