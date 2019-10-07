
import core.ArcadeMachine;
import java.util.Random;
import core.competition.CompetitionParameters;

public class TestRandom {
    public static void main(String[] args){
        //Available controllers
        String RandomCtrl = "controllers.sampleFlatMCTS.Agent";

        boolean visuals = true;
        int seed = new Random().nextInt();

        //use the random controller
        CompetitionParameters.ACTION_TIME = 500;
        ArcadeMachine.runOneGame("examples/gridphysics/bait.txt", "examples/gridphysics/bait_lvl0.txt", true, RandomCtrl, null, seed, false);
    }
}
