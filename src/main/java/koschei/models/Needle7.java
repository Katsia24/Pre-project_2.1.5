package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
//    @Component
//    public class Wood3 {
//
//        private final Rabbit4 rabbit;
//
//        @Autowired
//        public Wood3(Rabbit4 rabbit) {
//            this.rabbit = rabbit;
//        }
//
//        @Override
//        public String toString() {
//            return ", на дереве заяц " + rabbit.toString();
//        }

    private final Deth8 deth8;

    @Autowired
    public Needle7(Deth8 deth8){
        this.deth8 = deth8;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth8.toString();
    }
}
