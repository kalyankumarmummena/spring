package com.dbs.employeemngt;



import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import com.dbs.employeemngt.config.Config;
import com.dbs.employeemngt.service.EmployeeService;



public class Main {
public static void main(String[] args) {
ApplicationContext applicationContext = new
AnnotationConfigApplicationContext(Config.class);

EmployeeService employeeService= applicationContext.getBean(EmployeeService.class);



EmployeeService employeeService2= applicationContext.getBean(EmployeeService.class);

System.out.println(employeeService.hashCode());
System.out.println(employeeService2.hashCode());
System.out.println(employeeService.equals(employeeService2));
System.out.println(employeeService==employeeService2);


BasicDataSource basicDataSource= applicationContext.getBean(BasicDataSource.class);
BasicDataSource basicDataSource2= applicationContext.getBean(BasicDataSource.class);
System.out.println(basicDataSource.equals(basicDataSource2));
System.out.println(basicDataSource==basicDataSource2);


}
}