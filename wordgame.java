public class WordGame {

    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord ("HARPS");
    }

    public int getHint() {
        if ()
    }

}

public class HiddenWord {

    private String firstLetter = "";
    private String secondLetter = "";
    private String thirdLetter = "";
    private String fourthLetter = "";
    private String fifthLetter = "";

    public HiddenWord (String word) {
        this.firstLetter = word.charAt(0);
        this.secondLetter = word.charAt(1);
        this.thirdLetter = word.charAt(2);
        this.fourthLetter = word.charAt(3);
        this.fifthLetter = word.charAt(4);
    }

    public getFirstLetter() {
        return firstLetter();
    }

    public getSecondLetter() {
        return secondLetter();
    }

    public getThirdLetter() {
        return thirdLetter();
    }

    public getFourthLetter() {
        return fourthLetter();
    }

    public getFifthLetter() {
        return fifthLetter();
    }
}