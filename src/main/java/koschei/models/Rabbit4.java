package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
//    Koshei

//    private Ocean1 ocean;
//
//    public String getRulesByDeth() {
//        return "На свете есть океан , " + ocean.toString();
//    }
//
//    @Autowired
//    public void setOcean(Ocean1 ocean) {
//        this.ocean = ocean;
//    }

    private Duck5 duck5;

    @Autowired
    public void setDuck5(Duck5 duck5) {
        this.duck5 = duck5;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck5.toString();
    }
}
