package lgwarlick.finances.controller;


import lgwarlick.finances.service.StockServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class StockController {

    StockServiceImpl stockService = new StockServiceImpl();


    @RequestMapping("/GOOG")
    BigDecimal home(String stockSymbol) {
        return stockService.findStock(stockSymbol).getStock().getQuote().getPrice();
    }

}
