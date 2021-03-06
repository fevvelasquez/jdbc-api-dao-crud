/**
 * ----------------------------
 * Java JDBC API basis, coding exercises.
 * Exploring: java.sql.DriverManager , java.sql.Connection , java.sql.PreparedStatement , java.sql.ResultSet features.
 * ----------------------------
 * 
 * fevvelasquez writes an exercise using Java JDBC API for 
 * DAO pattern to get separate data access from business logic.
 * 
 * DAO classes provide CRUD database operations coding, including SQL statements needed.
 * 
 * 
 * Even if MySql is used for the demo, a distinct RDBMS or distinct database can be used.
 */
package me.fevvelasquez.jdbc.api.dao.model;

/**
 * The model class that represents the {@code employees} table.
 * 
 * @version 0.3.x. Demo version.
 * @author fevvelasquez@gmail.com
 */
public class Employee {
	private final Integer employeeId;
	private final String firstName;
	private final String lastName;
	private final String jobTitle;
	private final Integer salary;
	private final Integer reportsTo;
	private final Integer officeId;

	/**
	 * @param employee_id from {@code employees} table.
	 * @param firstName   from {@code employees} table.
	 * @param lastName    from {@code employees} table.
	 * @param jobTitle    from {@code employees} table.
	 * @param salary      from {@code employees} table.
	 * @param reportsTo   from {@code employees} table.
	 * @param officeId    from {@code employees} table.
	 */
	public Employee(Integer employeeId, String firstName, String lastName, String jobTitle, Integer salary,
			Integer reportsTo, Integer officeId) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.reportsTo = reportsTo;
		this.officeId = officeId;
	}

	/**
	 * Employee number.
	 * 
	 * @return the employee_id
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * Employee first name.
	 * 
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Employee last name.
	 * 
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Employee job title.
	 * 
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * Employee salary
	 * 
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}

	/**
	 * Employee's boss id number.
	 * 
	 * @return the reportsTo
	 */
	public Integer getReportsTo() {
		return reportsTo;
	}

	/**
	 * Employee's office id.
	 * 
	 * @return the officeId
	 */
	public Integer getOfficeId() {
		return officeId;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", jobTitle=" + jobTitle + ", salary=" + salary + ", reportsTo=" + reportsTo + ", officeId="
				+ officeId + "]";
	}

}
