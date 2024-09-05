package spring.api0;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
//import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/HallService")
public class HallService {
	HallDAO hdao=new HallDAO();
	
	@GET
    @Path("/hall/list")
	@Produces(MediaType.TEXT_XML)
	public String getUsers() {
		String ans="<halls>";
		List<Hall> list=hdao.getAllHall();
		if(list.size()==0) {
			ans=ans+"Not found";
		}
		else {
			for(int i=0;i<list.size();i++) {
				ans+=list.get(i).toString();
			}
		}
		ans+="</halls>";
		return ans;
	}
}
