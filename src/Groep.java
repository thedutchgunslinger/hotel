public class Groep implements GroepInterface<T>{
    // ik weet dat T een een parrameter is, maar wat is T?
//    bij add is T een type dus maybe een Gast? Gast nieuw voegt nieuwe gast toe aan de groep.
//    maar bij get is T ook een type. get Gast?
//    wat is het verschill een itterator en een for loop?
//    een groep is een array van gasten

    @Override
    public void add(T nieuw) {
//        arrayhier.push(nieuw);
        // wat als die vol is dan moet die verdubbelen:
//
    }

    @Override
    public T get(int i) {
//        return arrayhier[i];
    }

    @Override
    public int getCapaciteit() {
//      int capacity = arrayhier.lenght
//        return capacity;
    }

    @Override
    public boolean isLeeg() {
//        if(arrayhier.lenght == 0){
//        return true;
//    }
        return false;
    }

    @Override
    public void maakLeeg() {

    }


}
