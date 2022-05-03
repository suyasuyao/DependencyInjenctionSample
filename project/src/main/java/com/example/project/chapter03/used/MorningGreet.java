package com.example.project.chapter03.used;

import org.springframework.stereotype.Component;

/**
 * Greet実装クラス
 * 朝の挨拶を行う
 */

//@Component
public class MorningGreet implements Greet{
    @Override
    public void greeting(){
        System.out.println("------------------------");
        System.out.println("おはようございます");
        System.out.println("------------------------");

    }
}
