package structural.flyweight;

import java.util.WeakHashMap;

class CoffeeFlavour {
    private final String name;
    private static final WeakHashMap<String, CoffeeFlavour> CACHE = new WeakHashMap<>();

    // only intern() can call this constructor
    private CoffeeFlavour(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static CoffeeFlavour intern(String name) {
        synchronized (CACHE) {
            return CACHE.computeIfAbsent(name, CoffeeFlavour::new);
        }
    }

    public static int flavoursInCache() {
        synchronized (CACHE) {
            return CACHE.size();
        }
    }
}
