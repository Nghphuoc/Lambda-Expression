package org.example;

public class Cat implements PrintTable{
    private String name;
    private String speak;

    public Cat(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    @Override
    public String printSpeak(String name) {
        return "";
    }
}
