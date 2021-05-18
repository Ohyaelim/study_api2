package sm.chromeScreentime.task.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.w3c.dom.stylesheets.LinkStyle;
import sm.chromeScreentime.task.entity.User;

import java.util.List;

public interface UserDao extends MongoRepository <User,String> {

}
