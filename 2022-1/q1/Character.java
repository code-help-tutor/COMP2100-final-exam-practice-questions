WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
public class Character {

	private State state = StandState.getInstance();

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
