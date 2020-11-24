package com.accenture.bootcamp.jdbc.exercises;

final class EmployeesSql {

    private static final String SELECT_FROM_EMPLOYEES = "SELECT employees.id, first_name, " +
            "last_name, department_id FROM employees ";
    static final String SELECT_EMPLOYEE_BY_ID_QUERY = SELECT_FROM_EMPLOYEES + "WHERE id = ?";
    static final String SELECT_FROM_EMPLOYEES_LIMIT_QUERY = SELECT_FROM_EMPLOYEES + " limit ?";
    static final String SELECT_EMPLOYEE_BY_DEPARTMENT_QUERY = SELECT_FROM_EMPLOYEES +
            "inner join departments " +
            "on departments.id = employees.department_id " +
            "where departments.department like ?";

    static final String INSERT_INTO_EMPLOYEES_QUERY = "INSERT INTO employees VALUES (?, ?, ?, ?)";
    static final String UPDATE_EMPLOYEE_QUERY = "UPDATE employees " +
            "SET first_name = ?, " +
            "last_name = ?, " +
            "department_id = ? " +
            "where id = ?";
    static final String DELETE_EMPLOYEE_QUERY = "DELETE FROM employees WHERE id = ?";

    private EmployeesSql() {
    }
}
