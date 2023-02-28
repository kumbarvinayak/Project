package DemoApplicationTests.demo.repositary;

import DemoApplicationTests.demo.model.item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ItemRepo extends JpaRepository<item,Integer> {

}

