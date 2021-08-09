public class javaConstructors{

    public static void main(String argsp[]){

        Employee Ali = new Employee("Ali Hassan");
        //Ali's state set starts
        Ali.setAge(25);
        Ali.setEmp_Code(124);
        Ali.setName("Wajahat");
        //Alis; state set ends
        System.out.println(Ali.getAge());
        System.out.println(Ali.getEmp_Code());
        System.out.println(Ali.getName());

    }

}
class Employee {
    private int emp_Code;

    private String name;

    private int age;

    public Employee(String name){
        this.name = name;
        System.out.println("My name is "+this.name);
    }
    //setter getter block starts
    public void setEmp_Code(int emp_Code) {
        this.emp_Code = emp_Code;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmp_Code() {
        return emp_Code;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //setter getter block ends
}

