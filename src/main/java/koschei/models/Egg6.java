package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Egg6 {
//    Island2
//
//    private Wood3 wood;
//
//    public Island2(Wood3 wood) {
//        this.wood = wood;
//    }
//
//    @Override
//    public String toString() {
//        return ", на острове дерево " + wood.toString();
//    }


    private Needle7 needle7;

    public Egg6(Needle7 needle7) {
        this.needle7 = needle7;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }
}
