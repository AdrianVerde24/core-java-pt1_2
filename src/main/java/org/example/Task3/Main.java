package org.example.Task3;


public class Main {

    public static void main(String[] args) {

        Person prs1 = new Person("Adrian", 20);
        Person prs2 = new Person("Mario", 51);

        System.out.println("p1 Original identity was "+prs1.getName()+" and they were "+ prs1.getAge());
        System.out.println("p2 Original identity was "+prs2.getName()+" and they were "+ prs2.getAge());
        MakingChanges.changeIdentities(prs1,prs2);
        System.out.println("p1  identity now is "+prs1.getName()+" and they are "+ prs1.getAge());
        System.out.println("p2 identity is "+prs2.getName()+" and they are "+ prs2.getAge());

        System.out.println("Switch Sucessful");
    }

    }

