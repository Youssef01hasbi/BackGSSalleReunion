package ma.emsi.projetstagebokking.Service;

import ma.emsi.projetstagebokking.entites.Department;
import ma.emsi.projetstagebokking.repositories.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepo departmentRepo;

    @Autowired
    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public Department addDepartment(Department departement){
        return departmentRepo.save(departement);
    }
    public List<Department> findAllDepartment(){
        return departmentRepo.findAll();
    }
    public Department updateDepartment(Department department){
        return departmentRepo.save(department);
    }

    public Department findDepartmentById(Long id){
        return departmentRepo.findDepartmentById(id);
    }

    public void deleteDepartmentById(Long id){
        departmentRepo.deleteById(id);
    }
}
