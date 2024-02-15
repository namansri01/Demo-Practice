package com.bridgelabz.logicbuilding;

public class Puppy {
    int puppyAge;

    public Puppy(String name ){
        System.out.println("Puppy name is: " + name);
    }

    public void setAge(int age) {
        puppyAge=age;
    }

    public int getAge() {
        System.out.println("Puppy age is:"+ puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        Puppy myPuppy = new Puppy("Tommy");

        myPuppy.setAge(5);

        myPuppy.getAge();

        System.out.println("Variable(puppyAge) value is:" + myPuppy.puppyAge);
    }
}
