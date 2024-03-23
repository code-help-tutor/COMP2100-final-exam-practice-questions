WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com

public class SaveCommand extends Command {

	private final String key;
	private final int value;

	public SaveCommand(String key, int value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public int getValue() {
		return value;
	}
}
