package cn.ricky.gg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloController {

    @RequestMapping("/quote")
    public String Quote(Model m){
        Quote quote=new RestTemplate().getForObject("https://gturnquist-quoters.cfapps" +
                        ".io/api/random",
                Quote.class);
        if(quote!=null)m.addAttribute("quote",quote.getValue().getQuote().toString()) ;
        return "Quote";
    }
}
