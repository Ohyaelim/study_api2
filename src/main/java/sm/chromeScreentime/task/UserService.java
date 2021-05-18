package sm.chromeScreentime.task;

import org.springframework.stereotype.Service;
import sm.chromeScreentime.task.dao.UserDao;
import sm.chromeScreentime.task.dto.UserDTO;
import sm.chromeScreentime.task.request.UserDeleteRequest;
import sm.chromeScreentime.task.request.UserUpdateRequest;
import sm.chromeScreentime.task.request.UserRequestBody;
import sm.chromeScreentime.task.request.UserSearchRequest;

@Service
public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao = userDao;
    }

    public UserDTO searchUserInfo(UserSearchRequest request){
        return new UserDTO(userDao.findById(request.getUserId()).orElse(null));
    }

    public String saveUserInfo(UserRequestBody requestBody){
        userDao.save(requestBody.toEntity());
        return "userID : " + requestBody.getUserId() + "\n"
                +"username : "+requestBody.getUsername()+"\n"
                +"ent : "+requestBody.getEnt()+"\n"
                +"prod : "+requestBody.getProd()+"\n"
                +"sns : "+requestBody.getSns()+"\n"
                +"shop : "+requestBody.getShop()+"\n"
                +"edu : "+requestBody.getEdu()+"\n"
                +"business : "+requestBody.getBusiness()+"\n"
                +"etc : "+requestBody.getEtc();
    }

    public String updateUserInfo(UserUpdateRequest request){
        //userDao.insert(request);
        return "";
    }
    public String deleteUserInfo(UserDeleteRequest request){
        //userDao.insert(request);
        return "";
    }

}
