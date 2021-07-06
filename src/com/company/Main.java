package com.company;

import com.sun.javaws.IconUtil;

public class Main {

    public static void main(String[] args) {
        Cat.description = "This is regular cat!";
        Cat.getDescription();
        Cat bobtail = new Cat("Tom", 7);
        bobtail.getInfo();

        Cat sphynx = new Cat("Jerry", 15);
        sphynx.getInfo();
    }

     static class Cat{

        private String name;
        private int weight;

    //    public Cat(){
    //        this.name = "noName";
    //        this.weight = 1;
    //    }

    //    public Cat(String name){
    //        System.out.println("hello from second constructor");
    //        this.name = name;
    //    }

        public Cat(String name, int weight){
            System.out.println(" ");
            this.name = name;
            this.weight = weight;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public void setWeight(int weight){
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public static String description;

        public static void getDescription(){
            System.out.println(description);
        }

        public void getInfo(){
            System.out.println("Cats name is " + name);
            System.out.println("Cats weight is " + weight);
        }
    }
}
