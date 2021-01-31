package liqp.spi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public class SPIHelper {

    private static volatile List<TypesSupport> typeSupporters;

    public static void apply(ObjectMapper mapper) {
        List<TypesSupport> providers = findProviders();
        for (TypesSupport el: providers) {
            el.configureTypes(mapper);
        }
    }

    private static List<TypesSupport> findProviders() {
        if (typeSupporters == null) {
            ServiceLoader<TypesSupport> loader = ServiceLoader.load(TypesSupport.class);
            typeSupporters = copyIterator(loader.iterator());
        }
        return typeSupporters;
    }

    private static <T> List<T> copyIterator(Iterator<T> iter) {
        List<T> copy = new ArrayList<T>();
        while (iter.hasNext()) {
            copy.add(iter.next());
        }
        return copy;
    }
}