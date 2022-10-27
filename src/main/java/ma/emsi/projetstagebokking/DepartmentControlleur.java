package ma.emsi.projetstagebokking;


import ma.emsi.projetstagebokking.Service.DepartmentService;
import ma.emsi.projetstagebokking.entites.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Departments")
public class DepartmentControlleur {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentControlleur(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDepartments(){
        List<Department> department = departmentService.findAllDepartment();
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long id){
        Department department=departmentService.findDepartmentById(id);
        return new ResponseEntity<>(department,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department){
        Department newDepartment = departmentService.addDepartment(department);
        return new ResponseEntity<>(newDepartment,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Department> updateDepartment(@RequestBody Department department){
        Department updateDepartment = departmentService.updateDepartment(department);
        return new ResponseEntity<>(updateDepartment,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDepartment(@PathVariable("id") Long id){
        departmentService.deleteDepartmentById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
