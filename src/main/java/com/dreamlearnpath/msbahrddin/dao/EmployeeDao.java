package com.dreamlearnpath.msbahrddin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dreamlearnpath.msbahrddin.model.Employee;

public class EmployeeDao {

	public int saveEmployee(Employee emp) throws ClassNotFoundException {

		String query = "INSERT INTO `employee` (`id`, `name`, `nip`, `age`, `isActive`) VALUES (NULL, ?, ?, ?, '1')";

		int result = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/project_jee", "root", "");
				PreparedStatement ps = conn.prepareStatement(query)) {
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getNip());
			ps.setInt(3, emp.getAge());

			System.out.println(ps);
			result = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return result;
	}

}
