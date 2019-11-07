package com.codeman.springclouddemo.scheduler;

import java.util.Objects;

/**
 * 使用switch有以下四点：
 * 1）要在case语句后加上break/return 进行终止
 * 2）通过注释写明在哪里终止，对于没有第一条的情况
 * 3）在switch语句中的最后加上default语句
 * 4）对于switch中的开关量是string时，应该先进行判null，否则将抛出NPE
 */
public class SwitchString {
    public static void main(String[] args) {
        switchMethod(null);
    }

    private static void switchMethod(String switchParam) {
        if (Objects.isNull(switchParam)) {
            System.out.println("parameter is null");
            return;
        }
        switch (switchParam) {
            case "th":
                System.out.println("HIHAO");
            case "hhh":
                System.out.println("sdsd");
                break;
            case "null":
                System.out.println("wewr");
                break;
            default:
                System.out.println("nihaoa");
        }
    }
}
