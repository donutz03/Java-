class Colls {


    Collection<Type> noDups = new HashSet<Type>(c);

    //alt
    c.stream()
    .collect(Collectors.toSet());
}


