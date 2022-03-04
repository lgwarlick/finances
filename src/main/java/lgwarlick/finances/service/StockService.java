package lgwarlick.finances.service;

import lgwarlick.finances.model.StockWrapper;
import org.springframework.stereotype.Service;


public interface StockService {

    StockWrapper findStock(String symbol);

}
