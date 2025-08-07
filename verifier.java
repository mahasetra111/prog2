public class verifier {
    public static void main(String[] args) {
        Combattant mahasetra = new Combattant("24133","Mahasetra","onja","lael",62.21);
        Combattant manda = new Combattant("24134","Manda","maharo","bob",58.25);
        Combattant yasley  = new Combattant("24135","hassan","manambitiana","black",60.21);
        Combattant gamal = new Combattant("24136","Gamal","diaz","Sidis",62.21);
        Match premier = new Match(0, "12-12-12", "ivandry" ," AMICAL" ,"yasley", "gamal")
        premier.terminer(3,6,"amical");
    }
    
}
