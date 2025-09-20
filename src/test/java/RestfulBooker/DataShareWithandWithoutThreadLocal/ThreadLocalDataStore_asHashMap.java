package RestfulBooker.DataShareWithandWithoutThreadLocal;

//there might be a chnace to same data pass to other instances
// when u run all script in paralal mode so to avoid that we need to use ThreadLocal in our script

import java.util.LinkedHashMap;

public class ThreadLocalDataStore_asHashMap {

    private ThreadLocalDataStore_asHashMap() {
    }

    ;

   // private static LinkedHashMap<String, Object> datamap1 = new LinkedHashMap<String, Object>();

    private static ThreadLocal<LinkedHashMap<String, Object>> datamap = ThreadLocal.withInitial(() -> new LinkedHashMap<String, Object>());
    static void setValue(String key, Object value)
    {
        datamap.get().put(key,value);
    }

    public static Object getValue(String key)
    {
        return datamap.get().get(key);
    }

}
