package com.suidyi.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sdy
 */
public class Client {

    public static void main(String[] args) {

//        BenzModel benzModel = new BenzModel();
//        List<String> sequence = new ArrayList<>();
//        sequence.add("engine boom");
//        sequence.add("start");
//        sequence.add("stop");
//        benzModel.setSequence(sequence);
//        benzModel.run();

        List<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        CarModel benzModel = benzBuilder.builder();
        benzModel.run();
    }
}
