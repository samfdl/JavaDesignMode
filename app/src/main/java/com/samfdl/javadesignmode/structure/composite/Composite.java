package com.samfdl.javadesignmode.structure.composite;

import java.util.ArrayList;

//树枝构件
public class Composite implements Component {
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    private ArrayList<Component> children = new ArrayList<Component>();

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public Component getChild(int i) {
        return children.get(i);
    }

    public void operation() {
        System.out.println("树枝" + name + "：被访问！");
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}