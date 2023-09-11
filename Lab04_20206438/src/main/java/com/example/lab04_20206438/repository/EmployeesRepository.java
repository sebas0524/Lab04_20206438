package com.example.lab04_20206438.repository;

import com.example.lab04_20206438.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees,Integer> {

    @Query(nativeQuery=true, value="SELECT * FROM employees where (first_name=?1 or last_name=?2)")
    List<Employees> buscarPorNombreApellido(String textoIngresado, String textoIngresado1);



}
