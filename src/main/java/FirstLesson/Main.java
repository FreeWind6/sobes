package FirstLesson;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dmitry Kubyshkin
 * @dateOfCreation 31.01.2021
 */

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Person person = Person.newBuilder().setAddress("setAddress").setGender("setGender").setPhone("setPhone")
                .setAge(18).setCountry("setCountry").setFirstName("setFirstName").setLastName("setLastName")
                .setMiddleName("setMiddleName").build();
        System.out.println(person);

        /*
         * Задание 2
         * Нету класса First.Engine
         * Некоректное название интерфейсов
         * В классе First.Car возможно нужен метод init. Наверное этим методом является start
         *
         * First.Lorry extends First.Car, First.Moveable, First.Stopable тут ошибка. First.Moveable, First.Stopable - интерфейсы.
         * Отсюда вытикает так же реализация метода open, который не реализован
         * */

        // Задание 3
        Figure circle = new Circle("круг", 0, true);
        Figure square = new Square("квадрат", 4, false);
        Figure triangle = new Triangle("треугольник", 3, false);

        List<Figure> figureList = Arrays.asList(circle, square, triangle);
        for (Figure f : figureList) {
            f.init();
        }
    }
}
