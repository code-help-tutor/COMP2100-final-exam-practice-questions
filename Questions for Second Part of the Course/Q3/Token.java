WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/**
 * @author huy.pham
 */
public class Token {
    public enum Type {ODD_NUMBER, EVEN_NUMBER};
    
    public String originalTokenStr;
    public Type type;

    public Token(Type type, String originalTokenStr) {
        this.type = type;
        this.originalTokenStr = originalTokenStr;
    }
}
