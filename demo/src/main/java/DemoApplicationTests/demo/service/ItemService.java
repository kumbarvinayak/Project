package DemoApplicationTests.demo.service;
import DemoApplicationTests.demo.exeption.ItemNotFoundException;
import DemoApplicationTests.demo.model.item;
import java.util.List;

public interface ItemService    {
    item addItem(item Item);
    item getItemById(Integer id) throws ItemNotFoundException;
    List<item> getItems();
    item updateItem(Integer itemId, item Item)  throws ItemNotFoundException;
    void deleteItem(Integer itemId) throws ItemNotFoundException;
}
