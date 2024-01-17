package org.example.Task3;

public class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempName =  p1.getName();
        int tempAge = p1.getAge();

        p1.setName(p2.getName());
        p1.setAge(p2.getAge());

        p2.setName(tempName);
        p2.setAge(tempAge);
    }}
