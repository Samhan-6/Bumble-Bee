package com.webapp.bumble.bee.service;

import com.webapp.bumble.bee.dao.UserDAO;
import com.webapp.bumble.bee.model.User;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/UserService")
public class UserService {
    
    private UserDAO userDAO = new UserDAO();
    
    public UserService(){
        this.userDAO = new UserDAO();
    }
    
    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers(){
        return userDAO.getAllUsers();
    }
    
    @GET
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("userId")int userId){
        return userDAO.getUserById(userId);
    }
    
    @GET
    @Path("/{userEmail}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserByEmail(@PathParam("userEmail")String userEmail){
        return userDAO.getUserByEmail(userEmail);
    }
    
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUser(String username, String password, String email){
        userDAO.addUser(username, password, email);
        return Response.status(Response.Status.CREATED).build();
    }
    
    @PUT
    @Path("/{userId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUser(@PathParam("userId") int id, String username, String email, String password){
        userDAO.updateUser(id, username, email, password);
        return Response.status(Response.Status.OK).build();
    }
    
    @DELETE
    @Path("/{userId}")
    public Response deleteUser(@PathParam("userId") int userId){
        userDAO.deleteUser(userId);
        return Response.status(Response.Status.OK).build();
    }
    
}
