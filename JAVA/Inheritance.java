package JAVA;

import java.util.Scanner;
class Emp {
    int baseSal;
    int ta;
    int da;

    public Emp(int baseSal, int ta, int da) {
        this.baseSal=baseSal;
        this.ta=ta;
        this.da=da;

    }

    void calcSalary() {
        int grossSal = baseSal + ta + da;
        System.out.println("Total salary of the employee is " + grossSal);
    }
}


class EmpEngineer extends Emp {
    public EmpEngineer(int baseSal, int ta, int da) {
        super(baseSal, ta, da);
    }

    void calcSalary() {
        super.calcSalary();
        System.out.println("Total salary of the engineer is " + 2 * (baseSal + ta + da));
    }
}



public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base salary: ");
        int baseSal = sc.nextInt();
        System.out.println("Enter the TA: ");
        int ta = sc.nextInt();
        System.out.println("Enter the DA: ");
        int da = sc.nextInt();
        sc.close();

        EmpEngineer engineer1 = new EmpEngineer(baseSal, ta, da);
        engineer1.calcSalary();

    }
}

