/**
 * Класс, реализующий сущность "Мальчик".
 */
public class Boy {
    private String name;
    private int age;

    /**
     * Конструктор мальчика.
     *
     * @param name Имя мальчика.
     * @param age  Возраст мальчика.
     */
    Boy(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return Возвращает String с именем мальчика.
     */
    public String getName() {
        return name;
    }

    /**
     * @return Возвращает возраст мальчика - целое число (int).
     */
    public int getAge() {
        return age;
    }

    /**
     * @return Возвращает экземпляр класса Boy в виде строки формата "{Имя} - {Возраст}".
     */
    @Override
    public String toString() {
        return name + "-" + age;
    }
}