package com.suidyi.design.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sdy
 * client
 */
public class Client {

    public static void main(String[] args) throws IOException {

        System.out.println("-------悍马H1-------");
        System.out.println("H1型号的悍马是否需要喇叭声响? 0-不需要 1-需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        HummerH1Model hummerH1Model = new HummerH1Model();
        if ("0".equals(type)) {
            hummerH1Model.setAlarmFlag(false);
        }
        hummerH1Model.run();

        System.out.println("\n--------悍马H2-----------");
        HummerH2Model hummerH2Model = new HummerH2Model();
        hummerH2Model.run();
    }
}
