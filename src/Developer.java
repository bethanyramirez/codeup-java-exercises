class Developer extends Employee {


    public Developer(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "writing code";
    }

    public static void main(String[] args) {

        Employee dev = new Developer("Bethany", "Codeup");
        Employee mgr = new Manager("Julia", "Jefferson Bank");


        System.out.println(dev.name + " is " + dev.work() + " for " + dev.department);

        System.out.println(mgr.name + " is " + mgr.work() + " for " + mgr.department);

    }
}