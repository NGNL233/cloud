package servicerzuul.controller;

import org.springframework.stereotype.Component;

/**
 * @author : xiachenhong
 * @description :
 * @date : 2019-12-27 13:10
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
