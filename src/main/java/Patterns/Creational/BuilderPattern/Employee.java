package Patterns.Creational.BuilderPattern;

import java.util.Date;

public class Employee {
    String name;
    int age;
    Date JoiningDate;

    private Employee(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.JoiningDate = builder.getJoinDate();
    }

    public static Builder GetBuilder(){
        return new Builder();
    }

    static class Builder {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Date getJoinDate() {
            return joinDate;
        }

        public Builder setJoinDate(Date joinDate) {
            this.joinDate = joinDate;
            return this;
        }

        Date joinDate;



        public Employee Build(){
            return new Employee(this);
        }

    }
}
