WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package parcel;

public class Recipient extends Person {

	public Recipient(CartesianCoordinate location) {
		super(location);
	}
	public Recipient(Recipient recipient) {
		super(recipient);
	}
}
