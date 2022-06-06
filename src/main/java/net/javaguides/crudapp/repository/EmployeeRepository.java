package net.javaguides.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.crudapp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
