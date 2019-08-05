package com.suidyi.design.builder;

public class BuilderClient {

    public static void main(String[] args) {

        Director director = new Director();

        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }

        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }

        for (int i = 0; i < 2000000; i++) {
            director.getDBMWModel().run();
        }
    }
}
