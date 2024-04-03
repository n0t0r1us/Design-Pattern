package builder.test2;

public class User {
    String name;
    public User(String name) {
        this.name = name;
    }
    public void vote(Candidate c) {
        Election e = Election.createInstance();
        e.vote(c, name);
    }

}
