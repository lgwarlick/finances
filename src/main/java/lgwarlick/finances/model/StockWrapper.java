package lgwarlick.finances.model;

import lombok.Getter;
import yahoofinance.Stock;

import java.time.LocalDateTime;

@Getter
public class StockWrapper {

    private Stock stock;
    private LocalDateTime lastAccess;
    private String name;


    public StockWrapper(Stock stock) {
    }

    public StockWrapper(Stock stock, LocalDateTime lastAccess) {
        this.stock = stock;
        this.lastAccess = lastAccess;
    }

    public String getName() {
        return this.stock.getName();
    }
}
