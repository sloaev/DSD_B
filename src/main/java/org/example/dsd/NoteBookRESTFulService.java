package org.example.dsd;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dsd.entities.Person;
import org.example.dsd.hibernate.PersonDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/notebook")
public class NoteBookRESTFulService {

    PersonDAO personDAO = new PersonDAO();


    @Path("/notes")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getNotes() throws JsonProcessingException {
        List<Person> people = personDAO.getPeople();
        return new ObjectMapper().writeValueAsString(people);
    }

    @Path("/updateNote")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePhones(String json) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        Person person = om.readValue(json, Person.class);
        personDAO.updatePerson(person);
    }

    @Path("/createNote")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createNote(String json) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        Person person = om.readValue(json, Person.class);
        personDAO.savePerson(person);
    }


    @Path("/deleteNote/{id}")
    @DELETE
    public void deleteNote(@PathParam("id") Integer id) {
        personDAO.deletePerson(id);
    }

}
