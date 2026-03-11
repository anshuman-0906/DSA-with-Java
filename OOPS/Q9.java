public class Q9 {
    public static void main(String[] args) {
        manager m1=new manager("anshuman",150000,"CS development");
        m1.display1();
    }
}


class employee{
    String name;
    int salary;

    employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}


class manager extends employee{
    String department;

    manager(String name,int salary,String department){
        super(name,salary);
        this.department=department;
    }

    void display1(){
        super.display();
        System.out.println("Department : "+department);
    }
}