// Using this keyword
package constructorchaining;

public class Employee
{
    int id,age;
    String name,address;

    public Employee(int age)
    {
        this.age = age;
    }
    public Employee(int id , int age)
    {
        this(age);
        this.id = id;
    }
    public Employee(int id,int age,String name , String address)
    {
        this(id,age);
        this.name = name;
        this.address = address;
    }
    public static void main(String[] args)
    {
        Employee e = new Employee(101,25,"Abhishek","Mayapur Pali");
        System.out.println(e.id +" | "+e.age+" | "+e.name+" | "+e.address);


    }
}
