class Colls {


    Collection<Type> noDups = new HashSet<Type>(c);

    //alt
    c.stream()
    .collect(Collectors.toSet());

    Set<String> set = people.stream()
    .map(Person::getName)
    .collect(Collectors.toCollection(TreeSet::new));

    // alt
    Collection<Type> noDupss = new LinkedHashSet<Type>(c);

    public static <E> Set<E> removeDups(Collection<E> c) {
        return new LinkedHashSet<E>(c);
    }

}


