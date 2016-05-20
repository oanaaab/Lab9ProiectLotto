import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Oana on 5/20/2016.
 */
public class GenNr {
    public Set nrgen() {// 1 prepare the lotto machine and init it
        Random lottoMachine = new Random();
        lottoMachine.setSeed(System.currentTimeMillis());
        // 2 generate the lotto numbers
        Set setofSix = null;
        setofSix = new HashSet<Integer>();
        int counter = 0;
        do {
            int nr = lottoMachine.nextInt(49) + 1;
            boolean success = setofSix.add(nr);
            if (success) { // nr not already in the set
                counter++;
                System.out.print( nr  + ": ");
            }
        }
        while (counter < 6);
        return setofSix;

    }
}
