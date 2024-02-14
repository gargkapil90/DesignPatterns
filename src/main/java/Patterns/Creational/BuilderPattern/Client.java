package Patterns.Creational.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Employee emp = Employee.GetBuilder()
                            .setName("Kabir")
                            .setAge(22)
                            .Build();


//        Employee emp1 = new Employee(builder);
    }
}
