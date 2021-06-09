package staff;

public abstract class Employee {

    private String name;
    private String NInumber;
    private Double salary;

    public Employee(String name, String NInumber, Double salary){
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if (name != null) {
            this.name = name;
        }
    }
    public String getNInumber(){
        return this.NInumber;
    }
    public Double getSalary(){
        return this.salary;
    }

    public void raiseSalary(Double percent){
        if (percent > 0) {
            Double multiplier = (percent / 100) + 1;
            this.salary *= multiplier;
        }
    }

    public Double payBonus(){
        return this.salary * 0.01;
    }

}
