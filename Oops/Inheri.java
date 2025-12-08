
class Employee {

    int id;
    int salary;

    Employee(int i, int s) //parent class
    {
        id = i;
        salary = s;
    }
}

class SalesEmp extends Employee {

    int sales;

    SalesEmp(int i, int s, int sales) {
        super(i, s);
        this.sales = sales;
    }
}

public class Inheri {

    public static void main(String[] args) {
        Employee e = new SalesEmp(1, 1000, 3000);
        System.out.println(e.id);
        System.out.println(e.salary);
        System.out.println(((SalesEmp) e).sales);

    }
}
