package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> selectAll();

    void addEmploy(Employee employee);

    List<Employee> selectSome(@Param("id") String id);

    void updateOne(Employee employee);

    void deleteOne(@Param("id") String id);
}
