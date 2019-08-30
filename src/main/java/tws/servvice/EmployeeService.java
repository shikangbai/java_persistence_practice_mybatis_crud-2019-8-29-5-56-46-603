package tws.servvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.DTO.EmployeeDTO;
import tws.entity.Employee;
import tws.repository.EmployeeMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    public List<EmployeeDTO> selectSome(String id, String name) {
        List<Employee> employees = employeeMapper.selectSome(id);
        List<EmployeeDTO> employeeDtoList = new ArrayList<>();
        for(Employee employee : employees) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setId(employee.getId());
            employeeDTO.setName(employee.getName());
            employeeDTO.setAge(employee.getAge());
            employeeDTO.concat();
            employeeDtoList.add(employeeDTO);
        }
        return employeeDtoList;
    }
	public List<EmployeeDTO> selectSomeWithDesc(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
