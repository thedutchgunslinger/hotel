public class VasteGrootteGroep<T> extends Groep<T>{
    Object[] groep;
    int laatste;
    public VasteGrootteGroep(int grootte){
        this.groep = new Object[grootte];

    }
    public void add(T nieuw) {
        if(laatste == groep.length){
            throw new VasteGroepException("Sorry de groep is al vol!");
        }
        groep[laatste++] = nieuw;

    }

}
