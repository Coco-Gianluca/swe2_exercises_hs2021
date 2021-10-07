package ch.juventus.collections;

import ch.juventus.object.Person;

import java.util.*;

public class CollectionsExercise {

    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        hashMap();
        linkedHashMap();
        treeMap();
    }

    static void arrayList() {
        List<String> animals = new ArrayList<>();
        animals.add("Hund");
        animals.add("Katze");
        animals.add("Leguan");
        animals.add("Leguan");
        animals.add("Leguan");
        animals.add("Leguan");
        animals.add("Pinguin");
        animals.add("Chamelion");

        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println(animals.size());

        animals.add(2, "Baumvaran");

        System.out.println(animals);

        animals.contains("Löwe");
        animals.contains("Katze");

        System.out.println(animals.contains("Löwe"));
        System.out.println(animals.contains("Katze"));

        animals.get(4);

        System.out.println(animals.get(4));

        animals.remove(5);

        animals.remove("Leguan");


        System.out.println(animals);

        // animals.remove(73);
        animals.remove("Löwe");

        animals.clear();

        System.out.println(animals);



        List<String> immutableList = List.of("A", "B", "c");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        List<String> otherList = Arrays.asList(cars);


    }

    static void linkedList() {

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Hund");
        animals.add("Katze");
        animals.add("Schwein");
        animals.add("Jaguar");
        animals.add("Affe");
        animals.add("Leguan");
        animals.add("Pinguin");
        animals.add("Chamelion");

        System.out.println(animals.size());
        System.out.println(animals.indexOf("Affe"));
        System.out.println(animals.indexOf("Zebra"));
        System.out.println(animals.get(2));
        System.out.println(animals.getFirst() + ", " + animals.getLast());
        animals.removeLast();
        System.out.println(animals);
    }

    static void hashSet() {
        Set<Person> students = new HashSet<>();
        students.add(new Person("lastName", "firstName"));
        students.add(new Person("lastName", "firstName"));
        students.add(new Person("Linus", "Gobita"));
        students.add(new Person("Rexhep", "Rexhepi"));
        students.add(new Person("Sabine", "Codiga"));

        students.isEmpty();
        System.out.println(students.isEmpty());

        for (Person student : students) {
            System.out.println(student);
        }

        students.size();
        System.out.println(students.size());

        Person o = new Person("lastName", "firstName");
        students.contains(o);
        System.out.println(students.contains(o));

        students.remove(new Person("Sabine", "Codiga"));

        System.out.println(students);
        System.out.println(students);
        System.out.println(students);
        System.out.println(students);
        System.out.println(students);
        System.out.println(students);

        Set.of(new Person("ff", "df"), new Person("fg", "hh"));
    }

    static void linkedHashSet() {

        Set<Person> students = new LinkedHashSet<>();
        students.add(new Person("lastName", "firstName"));
        students.add(new Person("lastName", "firstName"));
        students.add(new Person("Linus", "Gobita"));
        students.add(new Person("Rexhep", "Rexhepi"));
        students.add(new Person("Sabine", "Codiga"));

        System.out.println(students.isEmpty());
        System.out.println(students.size());
        System.out.println(students);
        System.out.println(students);
        System.out.println(students);
        System.out.println(students);

    }

    static void treeSet() {
        Set<Person> students = new TreeSet<>();
        students.add(new Person("LastName", "firstName"));
        students.add(new Person("LastName", "firstName"));
        students.add(new Person("Linus", "Gobita"));
        students.add(new Person("Rexhep", "Rexhepi"));
        students.add(new Person("Sabine", "Codiga"));

        System.out.println(students.size());
        System.out.println(students);

    }

    static void hashMap() {
        Map<String, List<Person>> students = new HashMap<>();

        students.put("family", List.of(new Person("Linus", "Gobita"), new Person("Mike", "Caflisch"), new Person("Marco", "Kunz")));
        students.put("office", null);
        students.put("friends", List.of(new Person("Linus", "Gobita"), new Person("Mike", "Caflisch"), new Person("Marco", "Kunz")));

        System.out.println(students);

        students.put("office", List.of(new Person("Sabine", "Codiga")));

        System.out.println(students.entrySet());
        System.out.println(students.keySet());
        System.out.println(students.values());

        for (Map.Entry<String, List<Person>> entry : students.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        Map.of("family", List.of(), "office", List.of());
    }

    static void linkedHashMap() {
        Map<Integer, Person> studets = new LinkedHashMap<>(16, .75f, true);
        studets.put(44, new Person("Gianluca", "Coco"));
        studets.put(76, new Person("Mike", "Mono"));
        studets.put(188, new Person("Fabian", "Alto"));
        studets.put(404, new Person("Alberto", "Sono"));
        studets.put(79, new Person("Jose", "Pogba"));

        System.out.println(studets);

        studets.get(79);
        
        studets.get(188);
        System.out.println(studets);

      
    }

    static void treeMap() {
        
        Map<Integer, Person> treeMapTest = new TreeMap<>();
        treeMapTest.put(76, new Person("Mike", "Mono"));
        treeMapTest.put(44, new Person("Gianluca", "Coco"));
        treeMapTest.put(188, new Person("Fabian", "Alto"));
        treeMapTest.put(404, new Person("Alberto", "Sono"));
        treeMapTest.put(79, new Person("Jose", "Pogba"));

        System.out.println(treeMapTest);
        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
    }


}
