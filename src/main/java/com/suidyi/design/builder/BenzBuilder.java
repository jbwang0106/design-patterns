package com.suidyi.design.builder;

import java.util.List;

/**
 * @author sdy
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel builder() {
        return this.benzModel;
    }
}
