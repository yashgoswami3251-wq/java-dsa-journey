void main(){
    name();
    System.out.println(age());
    details(21,"Yash");

    String name = "Gauswami Yash";
    names(name);
    System.out.println(name);
}

static void name(){
    System.out.println("Yash");
}

static int age(){
    int age = 21;
    return age;
}

static void details(int age, String name){ // This is called arguments
    System.out.print(age+",");
    System.out.println(name);
}

static void names(String naam){
    naam = "Gauswami Kalpesh";
    System.out.println(naam);
}