package com.ctc.protoType;

import java.io.*;

public class Sheep implements Cloneable,Serializable{

    private int age;

    private String name;

    public Sheep() {
    }

    public Sheep(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
//        sheep.name = new String(this.name);
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                '}';
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

    public static void main(String[] args) throws  IOException, ClassNotFoundException {
//        Sheep sheep1 = new Sheep("hello",13);
//        Sheep sheep2 = (Sheep) sheep1.clone();
//        System.out.println(sheep1.getName() == sheep2.getName());
//        System.out.println(sheep2);

        Sheep sheep1 = new Sheep("hello",13);
        Sheep sheep2 = (Sheep) sheep1.deepClone();
        System.out.println(sheep1+""+""+sheep2);
        System.out.println(sheep1.getName() == sheep2.getName());
    }


    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream  bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


}

