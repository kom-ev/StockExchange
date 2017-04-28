package kom_ev.StockExchange;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by EKomarov on 28.04.2017.
 */
public class DealRequestDataGetter {
    public String readFile(String file) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(file))) {
            return stream.filter(line -> line.split(" ")
            );
        }
    }
}
