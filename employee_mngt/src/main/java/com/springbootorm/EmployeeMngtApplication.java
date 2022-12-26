package com.springbootorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootorm.entity.Company;
import com.springbootorm.entity.Employee;
import com.springbootorm.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeMngtApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMngtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee();
		emp1.setEmpId(11);
		emp1.setEmpName("Manish_Yadav");
		emp1.setEmpAge(23);
		emp1.setEmpEmail("yadavmanish580@gmail.com");
		emp1.setEmpMobile("9716078550");
		
		Employee emp2=new Employee();
		emp2.setEmpId(12);
		emp2.setEmpName("Nilesh_sharma");
		emp2.setEmpAge(24);
		emp2.setEmpEmail("nileshsharma@gmail.com");
		emp2.setEmpMobile("9123564578");
		
		Employee emp3=new Employee();
		emp3.setEmpId(13);
		emp3.setEmpName("Sachin_dhiman");
		emp3.setEmpAge(25);
		emp3.setEmpEmail("sachindhiman@gmail.com");
		emp3.setEmpMobile("8824356098");
		
		Company comp1=new Company();
		comp1.setCId(77);
		comp1.setCName("Hitachi");
		comp1.setCLocation("Delhi");
		comp1.setCPincode(133001);
		
		Company comp2=new Company();
		comp2.setCId(78);
		comp2.setCName("Accenture");
		comp2.setCLocation("Gurugram");
		comp2.setCPincode(122001);
		
		Company comp3=new Company();
		comp3.setCId(79);
		comp3.setCName("Whirpool");
		comp3.setCLocation("Pune");
		comp3.setCPincode(411003);
		
		emp1.setCompany(comp2);
		emp2.setCompany(comp3);
		emp3.setCompany(comp1);
		
		employeeRepository.save(emp1);
		employeeRepository.save(emp2);
		employeeRepository.save(emp3);
		
		System.out.println("Data Saved");
	}

}
