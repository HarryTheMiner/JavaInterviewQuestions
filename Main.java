// using the super keyword
package constructorchaining;

class Person
{
    String name,address;
    int age;
    public Person(int age,String name,String address)
    {
        this.age = age;
        this.name = name;
        this.address = address;
    }
}
class Employe extends Person
{
    float salary;
    public Employe(int age,String name ,String address,float salary)
    {
        super(age,name,address);
        this.salary = salary;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Employe e = new Employe(22,"Mukesh","Jaunpur",1520000);
        System.out.println(e.name +" | "+e.salary+" | "+e.age+" | "+e.address);
    }
}
