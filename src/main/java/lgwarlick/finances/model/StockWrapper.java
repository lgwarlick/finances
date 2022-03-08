package lgwarlick.finances.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;
import org.springframework.beans.factory.annotation.Autowired;
import yahoofinance.Stock;

import java.time.LocalDateTime;

@Getter
@With
@AllArgsConstructor
public class StockWrapper {

    private final Stock stock;
    private final LocalDateTime lastAccess;


    public StockWrapper(final Stock stock) {
        this.stock = stock;
        lastAccess = LocalDateTime.now();
    }
}
