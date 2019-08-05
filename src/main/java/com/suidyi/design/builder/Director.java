package com.suidyi.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sdy
 */
public class Director {

    private List<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     *
     * @return
     */
    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.builder();
    }

    /**
     *
     * @return
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.builder();
    }

    /**
     * C型号的宝马车是先按下喇叭（炫耀嘛），然后启动，然后停止
     * @return
     */
    public BMWModel getCBMWModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel)this.bmwBuilder.builder();
    }

    /**
     * D类型的宝马车只有一个功能，就是跑，启动起来就跑，永远不停止
     * @return
     */
    public BMWModel getDBMWModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel)this.bmwBuilder.builder();
    }
}
