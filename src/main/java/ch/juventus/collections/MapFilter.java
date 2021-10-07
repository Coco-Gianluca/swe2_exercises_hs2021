package ch.juventus.collections;

import java.util.Iterator;
import java.util.Map;

public class MapFilter {

    public <K, V> Map<K, V> cleanup(Map<K, V> map, V value) {
        map.entrySet().removeIf(entry -> !entry.getValue().equals(value));
        return map;
    }

    public <K, V> Map<K, V> cleanupV2(Map<K, V> map, V value) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (!entry.getValue().equals(value)) {
                iterator.remove();
            }
        }
        return map;
    }

}
