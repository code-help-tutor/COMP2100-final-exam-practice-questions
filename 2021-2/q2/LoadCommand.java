WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com

public class LoadCommand extends Command {

	private String key;
	private String fileName;

	public LoadCommand() {
	}

	public LoadCommand(String key, String fileName) {
		this.key = key;
		this.fileName = fileName;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
