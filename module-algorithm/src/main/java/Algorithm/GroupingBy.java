package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingBy {

    static class Person {
        private String city;
        private String lastName;

        public Person(String city, String lastName) {
            this.city = city;
            this.lastName = lastName;
        }

        public String getCity() {
            return this.city;
        }
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();
        people.add(new Person("seoul","john"));
        people.add(new Person("london","john"));
        people.add(new Person("seoul","peter"));
        people.add(new Person("paris","john"));

        /*
         *  Map<String, List<Person>> result = new HashMap<>();
         */



        Long peopleCount = people.stream().collect(Collectors.counting());
        String peopleCityList = people.stream().map(Person::getCity).collect(Collectors.joining(","));
        System.out.println(peopleCityList);
        Map<String, List<Person>> results = people.stream().collect(Collectors.groupingBy(Person::getCity));
    }
}
