package com.springbootorm.repotest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.springbootorm.entity.Employee;
import com.springbootorm.repository.EmployeeRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EmployeeRepositoryTest {

//	@Autowired
//	private TestEntityManager testEntityManager;

	@Autowired
	private EmployeeRepository employeeRepositoryTest;

	@Test
	@Rollback(false)
	public void TestEmployee() {
		Employee employee = new Employee(1, "Shivam_sharma", 43, "shivamsharma@gmail.com", "8851900267", null);
		Employee saveEmployee = employeeRepositoryTest.save(employee);
		employeeRepositoryTest.save(employee);

		assertNotNull(saveEmployee);

	}

}
