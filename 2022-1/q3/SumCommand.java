WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com

public class SumCommand extends Command {

	private final String pattern;
	private final String key;

	public SumCommand(String pattern, String key) {
		this.pattern = pattern;
		this.key = key;
	}

	public String getPattern() {
		return pattern;
	}

	public String getKey() {
		return key;
	}
}
