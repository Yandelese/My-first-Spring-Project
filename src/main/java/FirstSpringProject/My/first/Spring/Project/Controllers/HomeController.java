package FirstSpringProject.My.first.Spring.Project.Controllers;
import FirstSpringProject.My.first.Spring.Project.Classes.Items;
import FirstSpringProject.My.first.Spring.Project.DB.DB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller

    public class HomeController {
        @GetMapping(value = "/")
        public String indexPage(Model model){
           ArrayList<Items> itemsArrayList=DB.getallitems();
           model.addAttribute("items",itemsArrayList);
            return "index";
        }


            @GetMapping(value = "/additem")
            public String additems (Model model){
                return "additem";
            }

            @PostMapping (value = "/additem2")
            public String additems2 (@RequestParam(name = "id")Long id,
                                     @RequestParam(name = "name") String name,
                                     @RequestParam(name = "description") String description,
                                     @RequestParam(name = "price") double price){
                System.out.println(id);
                System.out.println(name);
                System.out.println(description);
                System.out.println(price);
            Items items=new Items(id,name,description,price);

            DB.additems(items);
                return "redirect:/";
            }

    }

