package GenericsExample;

public class Test {
    public static void main(String[] args) {
         Student s1 = new Student("Nur",18);
         Student s2 = new Student("Nurda",19);

         Scholler sc1 = new Scholler("Auba",12);
         Scholler sc2 = new Scholler("Ada",13);

         Employee e1 = new Employee("Erda",25);
         Employee e2 = new Employee("Erba",26);

         Team<Student> t1 = new Team<>("Student1");
         t1.addParticipants(s1);
         t1.addParticipants(s2);
         Team<Scholler> t3 = new Team<>("Scholler1");
         t3.addParticipants(sc1);
         t3.addParticipants(sc2);

        Student s3 = new Student("Zhaz",17);
        Student s4 = new Student("Zadyra",20);

        Team<Student> t2 = new Team<>("Student2");
        t2.addParticipants(s3);
        t2.addParticipants(s4);

        String a =t1.getResultMatch(t2);
        System.out.println(a);

        Scholler sc3 = new Scholler("Bob",15);
        Scholler sc4 = new Scholler("Bauka",14);

        Team<Scholler> t4= new Team<>("Scholler2");

        String b = t3.getResultMatch(t4);
        System.out.println(b);
    }
}
