package spring.api0;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/UserService")
public class UserService {
    UserDAO userDao = new UserDAO();

    @GET
    @Path("/user/{id}")
    @Produces(MediaType.TEXT_XML)
    public String getUserById(@PathParam("id") int id) {
    	User ret=null;
        for (User user : userDao.getAllUser()) {
            if (user.getId() == id) {
                ret= user;
            }
        }
        String res="<user>Not found</user>";
        if(ret!=null)
        res="<user><email>"+ret.getEmail()+"</email><id>"+ret.getId()+"</id><name>"+ret.getName()+"</name><profession>"+ret.getProfession()+"</profession></user>";
        return res; 
    }
}
