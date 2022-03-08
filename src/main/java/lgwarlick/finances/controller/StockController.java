package lgwarlick.finances.controller;


import lgwarlick.finances.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @RequestMapping("/price/{stockSymbol}")
    public String stockPrice(@PathVariable String stockSymbol, Model model) {

        model.addAttribute(stockService.findStock(stockSymbol).getStock().getQuote().getPrice());

        return "stockprice";
    }

}
