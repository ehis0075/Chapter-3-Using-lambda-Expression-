package org.paumard;


import java.util.*;

/**
 *
 * @author ehis
 */
public class Main {

    public static void main(String[] args) {

//        Person p1 = new Person("Alice", 23);
//        Person p2 = new Person("Brian", 56);
//        Person p3 = new Person("Chelsea", 46);
//        Person p4 = new Person("David", 28);
//        Person p5 = new Person("Erica", 37);
//        Person p6 = new Person("Francisco", 18);
//
//        City newYork = new City("New York");
//        City shanghai = new City("Shanghai");
//        City paris = new City("Paris");
//
//        Map<City, List<Person>> map = new HashMap<>();
//
//        map.putIfAbsent(paris, new ArrayList<>());
//        map.get(paris).add(p1);
//
//        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p2);
//        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p3);
//
//        System.out.println("People from Paris : " + map.getOrDefault(paris, Collections.EMPTY_LIST));
//        System.out.println("People from New York : " + map.getOrDefault(newYork, Collections.EMPTY_LIST));
//
//        Map<City, List<Person>> map1 = new HashMap<>();
//        map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
//        map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p2);
//        map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p3);
//
//        System.out.println("Map 1");
//        map1.forEach((city, people) -> System.out.println(city + " : " + people));
//
//
//        Map<City, List<Person>> map2 = new HashMap<>();
//        map2.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p4);
//        map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);
//        map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p6);
//
//        System.out.println("Map 2");
//        map2.forEach((city, people) -> System.out.println(city + " : " + people));
//
//        map2.forEach(
//                (city, people) -> {
//                    map1.merge(
//                            city, people,
//                            (peopleFromMap1, peopleFromMap2) -> {
//                                peopleFromMap1.addAll(peopleFromMap2);
//                                return peopleFromMap1;
//                            });
//                }
//        );
//
//        System.out.println("Merged map1 ");
//        map1.forEach(
//                (city, people) -> System.out.println(city + " : " + people)
//        );

        //Ehis

        List<Person> people  = new ArrayList<>();

        Person p1 = new Person();
        p1.setName("ehis");
        p1.setAge(24);

        Person p2 = new Person();
        p2.setName("ehis");
        p2.setAge(30);

        people.add(p1);
        people.add(p2);

        System.out.println("");
        people.forEach(s -> System.out.println(s)); //lambda exp
        people.forEach(System.out::println);     //method ref

        System.out.println("");
        boolean s = people.removeIf(person -> person.getAge() > 24);
        System.out.println("is there any person age > 24: "+ s);

        //using replaceAll method
        List<String> names = new ArrayList<>();
        names.add("ehis");
        names.add("jude");

        System.out.println("");
        names.replaceAll(name -> name.toUpperCase()); //lambda exp
        names.replaceAll(String::toUpperCase);  //method reference

        System.out.println("after changing to upper case");
        names.forEach(name -> System.out.println(name)); //lambda exp
        names.forEach(System.out::println); //method ref

        //using sort method
        //people.sort(Comparator.comparing(b -> System.out.println()));

        people.sort(Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge)); //method reference

        // map interface, using forEach method
        Person z1 = new Person("Alice", 23);
        Person z2 = new Person("Brian", 56);
        Person z3 = new Person("Chelsea", 46);
        Person z4 = new Person("David", 28);
        Person z5 = new Person("Erica", 37);
        Person z6 = new Person("Francisco", 18);

        City newYork = new City("New York");
        City shanghai = new City("Shanghai");
        City paris = new City("Paris");

        System.out.println();
        Map<City, List<Person>> map = new HashMap<>();

        map.forEach(
                (city, list) -> System.out.println(city + ": "+ list.size() + " people")
        );

        //on the map interface
        //using getOrDefault(Object key, V defaultValue)
        map.putIfAbsent(paris, new ArrayList<>());
        map.get(paris).add(z1);

        System.out.println("People from Paris : " + map.getOrDefault(paris, Collections.emptyList()));

        //on map
        // using putIfAbsent()
        Person z7 = new Person("Francisco", 18);
        //map.putIfAbsent(boston, new ArrayList<>()); //if boston exit don't modify but if boston is absent create an empty arraylist
        //map.get(boston).add(z7);
    }
}
