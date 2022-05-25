package JAVA101.classes.maasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if(this.salary < 1000){
            return 0;
        }
        if(salary > 1000){
            double tax = 0.03 * this.salary;
            return tax;
        }
        return 0;
    }

    public double bonus(){
        if(this.workHours > 40){
            double bonus = (this.workHours - 40) * 30;
            return bonus;
        }
        else {
            return 0;
        }
    }
    public double raiseSalary(){
        double raiseRate;
        int year = 2021 - this.hireYear;

        if(year < 10){
            raiseRate = 0.05;
        } else if (year > 9 && year < 20) {
            raiseRate = 0.1;
        } else {
            raiseRate = 0.15;
        }

        return this.salary*raiseRate;

    }

    public void toStr(){
        System.out.println("Ad� hey: " + this.name);
        System.out.println("Maa�� : " + this.salary);
        System.out.println("�al��ma Saati : " + this.workHours);
        System.out.println("Ba�lang�� Y�l� : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maa� Art��� : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maa� : " + (this.salary+ this.bonus() - this.tax()));
        System.out.println("Toplam Maa� : " + (this.salary + this.raiseSalary()));
    }
}