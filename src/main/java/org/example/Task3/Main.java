package org.example.Task3;


public class Main {

    public static class MakingChanges {
        public static void changeIdentities(Person p1, Person p2) {
            String tempName =  p1.name;
            int tempAge = p1.age;
            p1.name= p2.name;
            p2.name= tempName;
            p1.age= p2.age;
            p2.age= tempAge;
        }
        public class Person {
            String name;
            int age;
        }


    }

    public static void main(String[] args) {
        new MakingChanges();
        System.out.println("Switch Sucessful");
    }
}
