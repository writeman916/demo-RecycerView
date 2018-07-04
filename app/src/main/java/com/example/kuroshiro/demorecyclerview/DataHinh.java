package com.example.kuroshiro.demorecyclerview;

public class DataHinh {
    private  int Hinh;
    private String name;

    public DataHinh(int hinh, String name) {
        Hinh = hinh;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
