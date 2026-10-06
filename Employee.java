public class Employee{
    double calculateSalary(double basicPay){
        return basicPay;
    }
    double calculateSalary(double basicPay,double allowances){
        return basicPay + allowances;
    }
    double calculateSalary(double basicPay,double allowances,double incentives){
        return basicPay+allowances+incentives;
    }
    double calculateSalary(double basicPay,double allowances,double incentives,double deduction){
        return basicPay+allowances+incentives-deduction;
    }
    public static void main(String[] args){
        Employee emp = new Employee();
        System.out.println("Salary for Employee 1:"+emp.calculateSalary(20000.00));
        System.out.println("Salary for Employee 2:"+emp.calculateSalary(30000.00,5000.00));
        System.out.println("Salary for Employee 3:"+emp.calculateSalary(40000.00,7000.00,3000.00));
        System.out.println("Salary for Employee 4:"+emp.calculateSalary(50000.00,8000.00,5000.00,4000.00));
    }
    
}
