package DemoApplicationTests.demo.controller;

import DemoApplicationTests.demo.model.item;
import DemoApplicationTests.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class itemcontroller {
    @Autowired
    ItemService itemService;

    @PostMapping("/items")
    public ResponseEntity<Object> createItem(@RequestBody item Item){
        return new ResponseEntity<>(itemService.addItem(Item), HttpStatus.CREATED);
    }
    @GetMapping("/items/{id}")
    public ResponseEntity<item> getItem(@PathVariable("id") Integer itemId){
        return ResponseEntity.ok().body(itemService.getItemById(itemId));
    }
    @GetMapping("/items")
    public List<item> getItems(){
        return itemService.getItems();
    }

    @PutMapping("/items/{id}")
    public ResponseEntity<item> updateItem(@PathVariable("id") Integer itemId, @RequestBody item item){
        return ResponseEntity.ok((itemService.updateItem(itemId,item)));
    }
    @DeleteMapping("items/{id}")
    public ResponseEntity<Object> deleteItem(@PathVariable("id") int itemId){
        itemService.deleteItem(itemId);
        return new ResponseEntity<>("",HttpStatus.NO_CONTENT);
    }
}
