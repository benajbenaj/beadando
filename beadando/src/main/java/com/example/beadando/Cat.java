package com.example.beadando;
/**
 * Cat Domain Class to able to born a new Cat Object
 */
public class Cat {

    /**
     * Declare field for the class
     */

    private int id;
    private String name;
    private int age;

    /**
     * Constructor get these parameters and born a new cat
     * @param id
     * @param name
     * @param age
     */

    public Cat(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * Getters and Setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * toString method to override default object toString method to make readable our objects
     */

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     *
     * @param age cats age
     * @return boolean which is true if the cat is too old, false if is not
     */

    public boolean isCatOld(int age){
        if(age>10){
            return true;
        }
        return false;
    }
}
