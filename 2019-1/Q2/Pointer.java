WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/**
 * This class represents the pointer.
 * 
 * @author huy.pham
 */
public class Pointer {
	public Position position;
	public Direction direction;
	public boolean isPenDown;
	
	public Pointer(Position position, Direction direction, boolean isPenDown) {
		this.position = position;
		this.direction = direction;
		this.isPenDown = isPenDown;
	}
	
	/**
	 * Turn the pointer to its left
	 * @return this pointer
	 */
	public Pointer turnLeft() {
    	switch(direction) {
    		case Upward:
    			direction = Direction.Left;
    			break;
    		case Left:
    			direction = Direction.Downward;
    			break;
    		case Downward:
    			direction = Direction.Right;
    			break;    		
    		case Right:
    			direction = Direction.Upward;
    			break;    	    			
    	}
    	
    	return this;
	}
	
	/**
	 * Turn the pointer to its left
	 * @return this pointer
	 */
	public Pointer turnRight() {
    	switch(direction) {
			case Upward:
				direction = Direction.Right;
				break;
			case Right:
				direction = Direction.Downward;
				break;
			case Downward:
				direction = Direction.Left;
				break;    		
			case Left:
				direction = Direction.Upward;
				break;    	    			
		}
		
		return this;
	}
}
