package builder.test2;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    int voteForDonaldTrump = 0;
    int voteForJoeBiden = 0;
    List<String> voters = new ArrayList();


    protected Election() {

    }

    public static Election createInstance() {
        if(instance == null)
            instance = new Election();
        return instance;
    }

    public void vote(Candidate c, String name) {
        if (checkVote(name)) {
            voters.add(name);
            if(c== Candidate.DonaldTrump)
                voteForDonaldTrump++;
            else
                voteForJoeBiden++;
        }
    }

    private boolean checkVote(String name) {
        for(int i = 0; i< voters.size();i++)
            if (voters.get(i).equals(name))
                return false;
        return true;
    }

    public int getVoteForDonaldTrump() {
        return voteForDonaldTrump;
    }

    public int getVoteForJoeBiden() {
        return voteForJoeBiden;
    }

}
