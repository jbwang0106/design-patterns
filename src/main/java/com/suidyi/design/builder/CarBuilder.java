package com.suidyi.design.builder;

import java.util.List;

/**
 * @author sdy
 */
public abstract class CarBuilder {

    /**
     * 设置组装顺序
     * @param sequence
     */
    public abstract void setSequence(List<String> sequence);

    /**
     * 设置完顺序，得到车模型
     * @return
     */
    public abstract CarModel builder();
}
