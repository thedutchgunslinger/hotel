import java.util.Iterator;

public class Groep<T> implements GroepInterface<T>, Iterable<T> {
    // ik weet dat T een een parrameter is, maar wat is T?
//    bij add is T een type dus maybe een Gast? Gast nieuw voegt nieuwe gast toe aan de groep.
//    maar bij get is T ook een type. get Gast?
//    wat is het verschill een itterator en een for loop?
//    een groep is een array van gasten
    Object[] groep = new Object[10];
    int laatste;

    public GroepIterator iterator() {
        return this.new GroepIterator();
    }

    @Override
    public void add(T nieuw) {
        if(laatste == groep.length){
            Object[] nieuweGroep = new Object[groep.length * 2];
            for(int i = 0; i < groep.length; ++i) {
                nieuweGroep[i] = groep[i];
            }
            groep = nieuweGroep;
            return;
        }
        groep[laatste++] = nieuw;

    }

    @Override
    public T get(int index) {
        return (T) groep[index];
    }

    @Override
    public int getCapaciteit() {
        int capacity = groep.length;
        return capacity;
    }

    @Override
    public boolean isLeeg() {
        boolean allNull = true;
        for(int i=0;i<groep.length;i++)
        {
            if(groep[i] != null)
            {
                allNull=false;
                break;
            }
        }return allNull;
    }

    @Override
    public void maakLeeg() {
         groep = new Object[10];
    }


    private class GroepIterator implements Iterator<T> {
        int teller = 0;

        public T next() {
            return get(teller++);
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        public boolean hasNext() {
            return teller < groep.length;
        }
    }



}
