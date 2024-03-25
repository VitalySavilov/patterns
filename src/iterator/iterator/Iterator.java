package iterator.iterator;

import iterator.aggregate.MenuItem;

public interface Iterator {

    boolean hasNext();

    MenuItem next();

}
