create database company;

create table departments (
    id int primary key auto_increment,
    department varchar(100)
);

create table employees (
	id int primary key auto_increment,
    first_name varchar(100),
    last_name varchar(100),
    department_id int,
    foreign key (department_id) references departments(id)
);

create table projects (
    id int primary key auto_increment,
    description varchar(1000)
);

create table employees_projects (
    id int primary key auto_increment,
    project_id int,
    employee_id int,
    foreign key (project_id) references projects(id),
    foreign key (employee_id) references employees(id)
);


insert into departments values
   (1, 'HR'),
   (2, 'IT'),
   (3, 'Marketing'),
   (4, 'Sys Admins');

insert into employees values
   (1, 'Janis', 'Logins', 2),
   (2, 'Juris', 'Krastins', 2),
   (3, 'Ieva', 'Liepina', 1),
   (4, 'Jana', 'Spidola', null);

insert into projects values
   (1, 'Online Gaming'),
   (2, 'Insurance'),
   (3, 'Banking system'),
   (4, 'Communications'),
   (5, 'Media');

insert into employees_projects (employee_id, project_id) values
   (4, 1),
   (4, 2),
   (3, 2),
   (3, 3),
   (2, 4);


-- joins
-- a. departments that have no employees assigned to them
select distinct departments.department from departments
left join employees
on departments.id = employees.department_id
where employees.department_id is null;

-- b. only departments which have employees assigned to them
select distinct departments.department
from departments
inner join employees
on departments.id = employees.department_id;

-- c. first_name, last_name, department for all employees
select employees.first_name, employees.last_name, departments.department
from employees
left join departments on employees.department_id = departments.id;

-- d. all employees (first_name, last_name) that are in project with X name
-- (for example, "Insurance").
select employees.first_name, employees.last_name
from employees_projects
inner join employees on employees_projects.employee_id = employees.id
inner join projects on employees_projects.project_id = projects.id
where projects.description = 'Insurance';

-- e. first_name, last_name for all employees who are not assigned to department
select employees.first_name, employees.last_name
from employees
where department_id is null;

-- f. first_name, last_name, department only for employees which are assigned to a department
select first_name, last_name, department
from employees
left join departments on employees.department_id = departments.id
where department_id is not null;

-- g. All employees (first_name, last_name) in X department (for example, "IT")
-- who name starts with "Ja"
select first_name, last_name, department
from employees
inner join departments on employees.department_id = departments.id
where department = 'IT' AND first_name LIKE 'Ja%';

-- h. first_name, last_name, project for all employees / projects
select first_name, last_name, projects.description
from employees
left join employees_projects on employees_projects.employee_id = employees.id
left join projects on employees_projects.project_id = projects.id;

-- i. "description" only for projects which have employees assigned to them
select distinct description from projects
inner join employees_projects
on projects.id = employees_projects.project_id;
