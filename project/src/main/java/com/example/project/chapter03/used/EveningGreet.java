package com.example.project.chapter03.used;

import org.springframework.stereotype.Component;

/**
 * Greet実装クラス
 * 夜の挨拶を行う
 */

@Component
public class EveningGreet implements Greet{
    @Override
    public void greeting(){
        System.out.println("------------------------");
        System.out.println("こんばんわ");
        System.out.println("------------------------");

    }
}
