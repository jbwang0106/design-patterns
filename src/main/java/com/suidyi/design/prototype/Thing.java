package com.suidyi.design.prototype;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author jbwang0106
 */
public class Thing implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
           thing = (Thing) super.clone();
           // 深拷贝
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return thing;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
