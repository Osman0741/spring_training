package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("----Regions-------");

        System.out.println("findByCountry: "+regionRepository.findByCountry("Canada"));
        System.out.println("findByCountry: "+regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainsOrderByRegionDesc: "+regionRepository.findByCountryContainsOrderByRegionDesc("United"));
        System.out.println(" findTopByCountry"+regionRepository.findTopByCountry("United States"));
        System.out.println(" findTopByCountry"+regionRepository.findTopByCountryContainsOrderByRegion("United States"));

        System.out.println("----Departments-------");
        System.out.println("findByDepartment "+departmentRepository.findByDepartment("Furniture"));
        System.out.println("findByDivision "+departmentRepository.findByDivision("Health"));
        System.out.println("findByDivisionEndingWith "+departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("findDistinctTopByDivisionContains "+departmentRepository.findDistinctTopByDivisionContains("Hea"));


    }
}
