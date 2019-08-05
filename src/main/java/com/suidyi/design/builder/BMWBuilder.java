package com.suidyi.design.builder;

import java.util.List;

/**
 * @author sdy
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel builder() {
        return this.bmwModel;
    }
}
