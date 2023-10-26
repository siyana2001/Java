	package NewProj;	
	
	class Employee {
	    private int id;
	    private String name;
	    private double basicPay;
	
	    public Employee(int id, String name, double basicPay) {
	        this.id = id;
	        this.name = name;
	        this.basicPay = basicPay;
	    }
	
	    public void displayPayrollDetails() {
	        double hra = 0.10 * basicPay;
	        double allowance = (name.equalsIgnoreCase("Manager")) ? 0.20 * basicPay : 0.12 * basicPay;
	        double pf = 0.15 * basicPay;
	
	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Basic Pay: " + basicPay);
	        System.out.println("HRA: " + hra);
	        System.out.println("Allowance: " + allowance);
	        System.out.println("PF: " + pf);
	        System.out.println("Net Salary: " + (basicPay + hra + allowance - pf));
	    }
	}
	
	public class Payroll {
	    public static void main(String[] args) {
	        Employee manager = new Employee(1001, "Manager", 50000);
	        Employee staff = new Employee(1002, "Staff", 30000);
	
	        System.out.println("Manager's Payroll Details:");
	        manager.displayPayrollDetails();
	
	        System.out.println("\nStaff's Payroll Details:");
	        staff.displayPayrollDetails();
	    }
	}
	
