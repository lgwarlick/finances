package lgwarlick.finances.service;

import lgwarlick.finances.model.StockWrapper;
import org.springframework.stereotype.Service;
import yahoofinance.YahooFinance;

@Service
public class StockServiceImpl implements StockService {

    @Override
    public StockWrapper findStock(String symbol) {
        try {
            return new StockWrapper(YahooFinance.get(symbol));
        } catch (Exception symbolNotFound) {
            System.out.println(symbolNotFound.getMessage());
        }
        return null;
    }
}
