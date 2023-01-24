/* import java.util.HashMap;
import java.util.Iterator;
class CSLabHashmap {
    public static void main(String[] args) {
        HashMap<String, CSMovie> voteCnt = new HashMap<String, CSMovie>();
        CSMovie[] mArr = new CSMovie[3];
        mArr[0] = new CSMovie("A");
        mArr[1] = new CSMovie("B");
        mArr[2] = new CSMovie("C");
        String[] votes = { "B", "C", "A", "B", "B", "A" };
        voteCnt.put(mArr[0].getTitle(), mArr[0]);
        voteCnt.put(mArr[1].getTitle(), mArr[1]);
        voteCnt.put(mArr[2].getTitle(), mArr[2]);
        for (int i = 0; i < votes.length; i++) {
        CSMovie mov = voteCnt.get(votes[i]);
        mov.incRating();
        voteCnt.put(votes[i], mov);
        }
        System.out.println(voteCnt);
        // obtain keys
    }
}

class CSMovie() {
    String title;
    CSMovie (String t) {
        title = t;
    }
    getTitle() {
        return title;
    }
} */