abstract class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

interface BonusEligible {
    double getBonus();
}

class PermanentEmployee extends Employee implements BonusEligible {

    public PermanentEmployee(double salary) {
        super(salary);
    }

    @Override
    public double getBonus() {
        return salary * 0.10; // 10% bonus
    }
}

class Contractor extends Employee {

    public Contractor(double salary) {
        super(salary);
    }
}


public class Main2{
    public static void main(String[] args){
        PermanentEmployee employee = new PermanentEmployee(50000);
        Contractor contractor = new Contractor(40000);

        System.out.println("Permanent Employee Salary: " + employee.getSalary());
        System.out.println("Permanent Employee Bonus: " + employee.getBonus());

        System.out.println("Contractor Salary: " + contractor.getSalary());
    }
}



