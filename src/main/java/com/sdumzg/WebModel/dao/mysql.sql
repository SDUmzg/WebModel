CREATE TABLE department(
  id int(11) AUTO_INCREMENT PRIMARY KEY ,
  name VARCHAR(30) not null ,
  parent_name VARCHAR(30) not null,
  level VARCHAR(30) not null,
  department_describe VARCHAR(30) not null
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;