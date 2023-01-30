public class Gast {

    private static final String[] VOORNAMEN = {
            "Adam", "Sofie", "Johan", "Yuri", "Marie", "Fred", "Lisa",  "Robin", "Claartje", "Freek", "Piet", "Pietje", "Erik", "Bas", "Pavlov", "Igor", "Ivan", "Geertje", "Klaas", "Snorri", "Anna", "Lotte", "Sara", "Roos", "Noor", "Thor", "Jean", "Karel", "Dick", "Richard", "Dzjengis", "Emma", "Howard Phillips", "Peter", "Sint", "Albert", "Dirk Jan", "Taylor", "Linus", "James", "Bjarne", "Jurriaan", "Jan-Klaassen"
    };//43
    private static final String[] ACHTERNAMEN = {
            "de Vries", "Smit", "Petersen", "Vonk", "Janssen", "Klaassen",
            "de Trompetter", "Baantjes", "de Jong", "Sanchez", "Bakker", "Eggertsson","Sturluson", "Valjean", "de Grote", "Precies", "Khan", "Snorremans","de Cock met C-O-C-K", "Stallman", "Lovecraft", "Erklaas", "Gagarin","Einstein", "Heijn", "de Geer", "Swift", "Torvalds", "Gosling", "Stroustrup"
    }; //30

    static String[] volledigeNaam = getRandomNaam();
    private static String voorNaam = volledigeNaam[0];
    private static String achterNaam = volledigeNaam[1];
    public Gast(String achterNaam){
        this.achterNaam = achterNaam;
    }
    public Gast(String voorNaam, String achterNaam){
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
    }
    public static String[] getRandomNaam(){
        int randVoorNaam = (int) (Math.random() * VOORNAMEN.length - 1);
        int randAchterNaam = (int) (Math.random() * ACHTERNAMEN.length - 1);
        String[] naam = {VOORNAMEN[randVoorNaam],ACHTERNAMEN[randAchterNaam]};
        return naam;
    }
    public  String toString(){
        return (voorNaam + " " + achterNaam);
    }
}
