WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com

public class SequenceGenerator {

    private static Integer ID_GENERATOR = 0;

    public Integer nextVal() {
        ID_GENERATOR++;
        return ID_GENERATOR;
    }
}
