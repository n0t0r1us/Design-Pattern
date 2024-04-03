package builder.test2;

public class ElectionMain {

    public static void main(String[] args) {
        User u1 = new User("Trong");
        User u2 = new User("Phuong");
        User u3 = new User("Khanh");
        User u4 = new User("Trong");
        u1.vote(Candidate.DonaldTrump);
        u1.vote(Candidate.JoeBiden);
        u2.vote(Candidate.JoeBiden);
        u3.vote(Candidate.JoeBiden);
        u4.vote(Candidate.DonaldTrump);
        System.out.println("DT: " + Election.createInstance().getVoteForDonaldTrump());
        System.out.println("JB: " + Election.createInstance().getVoteForJoeBiden());
    }

}