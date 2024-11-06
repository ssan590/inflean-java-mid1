package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        // Object는 모돈 타입의 부모이며, 부모는 자식을 담을 수 있으므로 아래 코드는 같다.
        Object dog = new Dog();
        Object car = new Car();
//        Dog dog = new Dog();
//        Car car = new Car();

        action(dog);
        action(car);

    }

    private static void action(Object obj) {
//        obj.sound(); // 컴파일 오류, Object는 sound()가 없다.
//        obj.move(); // 컴파일 오류, Object는 move()가 없다.

        // 객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
