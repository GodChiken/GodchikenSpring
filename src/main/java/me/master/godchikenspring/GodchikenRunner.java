package me.master.godchikenspring;

import com.master.godchikenspringbootstarter.model.Godchiken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

// 자동으로 실행되는 빈을 만들고자 할때 활용 가능하다.
@Component
public class GodchikenRunner implements ApplicationRunner {

    @Autowired
    Godchiken godchiken;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(godchiken);
    }
}
