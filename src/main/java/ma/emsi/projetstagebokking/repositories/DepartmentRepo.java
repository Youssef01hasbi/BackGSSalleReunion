package ma.emsi.projetstagebokking.repositories;

import ma.emsi.projetstagebokking.entites.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Long> {

    Department findDepartmentById(Long id);
}
