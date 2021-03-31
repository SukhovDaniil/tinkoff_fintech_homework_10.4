import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(final String[] args) {
        final ArrayList<Boy> boys = new ArrayList<>() {{
            add(new Boy("Николай", 68));
            add(new Boy("Пётр", 53));
            add(new Boy("Василий", 25));
            add(new Boy("Михаил", 19));
            add(new Boy("Алексей", 6));
            add(new Boy("Николай", 86));
            add(new Boy("Пётр", 35));
            add(new Boy("Михаил", 111));
            add(new Boy("Алексей", 22));
            add(new Boy("Михаил", 1));
            add(new Boy("Яков", 30));
        }};

        Stream<Boy> boyStream = boys.stream();

        boyStream.filter(boy -> boy.getAge() >= 18)
                .map(boy -> boy.getName())
                .distinct()
                .sorted()
                .limit(4)
                .collect(Collectors.toMap(name -> name, name -> boys.stream()
                        .filter(boy -> boy.getName().equals(name))
                        .count() - 1))
                .forEach((name, namesakes) -> System.out.println(name + "=" + namesakes));
    }
}
