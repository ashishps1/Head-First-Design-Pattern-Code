package Chapter9;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;
    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }
}
