WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package parcel;

public abstract class Person {
    private CartesianCoordinate location;

    public Person(CartesianCoordinate location) {
        this.location = location;
    }

    public Person(Person person) {
        location = new CartesianCoordinate(person.location.getX(),person.location.getY());
    }

    public CartesianCoordinate getLocation() {
        return location;
    }

    public void setLocation(CartesianCoordinate newLocation) {
        location = newLocation;
    }

    @Override
    public String toString() {
        return location.toString();
//
//        "{" +
//                "loc=" + location +
//                '}';
    }

}
