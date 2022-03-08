package lgwarlick.finances.service;

import lgwarlick.finances.model.StockWrapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

@AllArgsConstructor
@Service
public class StockService {

    public StockWrapper findStock(String symbol) {
        try {
            System.out.println("Getting info on: " + symbol);
            return new StockWrapper(YahooFinance.get(symbol));
        } catch (Exception symbolNotFound) {
            System.out.println(symbolNotFound.getMessage());
        }
        return null;
    }

    public BigDecimal findPrice(final StockWrapper stock) throws IOException {
        return stock.getStock().getQuote(true).getPrice();
    }

}
