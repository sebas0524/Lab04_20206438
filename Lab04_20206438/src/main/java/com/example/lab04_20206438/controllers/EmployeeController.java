package com.example.lab04_20206438.controllers;


import com.example.lab04_20206438.entity.Employees;
import com.example.lab04_20206438.repository.EmployeesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@RequestMapping("/index")
@Controller
public class EmployeeController {

    final EmployeesRepository employeesRepository;
    public EmployeeController(EmployeesRepository employeesRepository){
        this.employeesRepository=employeesRepository;
    }
    @GetMapping(value={"/listaempleado",""})
    public String listaEmpleado(Model model){
        List<Employees> lista= employeesRepository.findAll();
        model.addAttribute("empleadoList",lista);

        return"employee/lista";
    }
    @PostMapping("/buscarPorNombreApellido")
    public String bucarporNombreApellido(@RequestParam("searchField") String searchField,Model model){
        List<Employees> lista=employeesRepository.buscarPorNombreApellido(searchField,searchField);
        model.addAttribute("employeelist",lista);
        model.addAttribute("textoBuscado",searchField);
        return "employee/lista";
    }

    /*@GetMapping("/editarempleado")
    public String editarEmpleadoTelefonoSalario(Model model,@RequestParam("id") int id){
        Optional<Employees> employeesOptional=employeesRepository.findById(id);
        if(employeesOptional.isPresent()){
            Employees employees=employeesOptional.get();
            model.addAttribute("employee",employees);
           return "s"
        }else{
            return
        }

    }*/
}
