package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
//    Ocean1
//
//    @Autowired
//    private Island2 island;
//
//    @Override
//    public String toString() {
//        return "на океане остров " + island.toString();
//    }

    @Autowired
    private Egg6 egg6;

    @Override
    public String toString() {
        return ", в утке яйцо " + egg6.toString();
    }
}
