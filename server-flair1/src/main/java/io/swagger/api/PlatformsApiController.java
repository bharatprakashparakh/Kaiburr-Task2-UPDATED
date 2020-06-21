package io.swagger.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Platform;
import io.swagger.repository.PlatformRepository;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-20T11:30:19.835+05:30")

@RestController
public class PlatformsApiController implements PlatformsApi {

	@Autowired
    private PlatformRepository platformRepository;
    private static final Logger log = LoggerFactory.getLogger(PlatformsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PlatformsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addPlatform(@ApiParam(value = "Platform object that needs to be added to the list" ,required=true )  @Valid @RequestBody Platform platform) {
  	  String accept = request.getHeader("Accept");
        
         //My constraint that Id>5000 cannot be present
        if(platform.getId() > 5000)
        	return new ResponseEntity<Void>(HttpStatus.METHOD_NOT_ALLOWED);

    	platformRepository.save(platform);
    	return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deletePlatform(@ApiParam(value = "Platform id to delete",required=true) @PathVariable("id") Integer id) {
    	
    	Platform p= platformRepository.findOne(id);
    	if(p == null)
        	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    	
    	platformRepository.delete(id);
        return new ResponseEntity<Void>(HttpStatus.OK);    }

    public ResponseEntity<List<Platform>> getAllPlatforms() {
    	
    	  String accept = request.getHeader("Accept");
    	if (accept != null && accept.contains("application/json")) {
    		
    		
            try {
            	
            	List<Platform> p=platformRepository.findAll();
            	if(p.size()==0)
            		return new ResponseEntity<List<Platform>>(p,HttpStatus.NOT_FOUND);
            	return new ResponseEntity<List<Platform>>(p,HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Platform>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    	
    	return new ResponseEntity<List<Platform>>(HttpStatus.INTERNAL_SERVER_ERROR);
  	
    }

    public ResponseEntity<Platform> getPlatformById(@ApiParam(value = "ID of Platform to return",required=true) @PathVariable("id") Integer id) {
    	
    	
    	
    	String accept = request.getHeader("Accept");
     	 


 
   	if (accept != null && accept.contains("application/json")) {
           try {
               Platform p=  platformRepository.findOne(id);
              if(p==null)
           	   return new ResponseEntity<Platform>(p,HttpStatus.NOT_FOUND);
          	return new ResponseEntity<Platform>(p,HttpStatus.OK);

              
           } catch (Exception e) {
               log.error("Couldn't serialize response for content type application/json", e);
               return new ResponseEntity<Platform>(HttpStatus.INTERNAL_SERVER_ERROR);
           }
       }
   	
    return new ResponseEntity<Platform>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<List<Platform>> getPlatformByName(@ApiParam(value = "Name of Platform to return",required=true) @PathVariable("name") String name) {

    	  String accept = request.getHeader("Accept");
    	if (accept != null && accept.contains("application/json")) {
            try {
            	List<Platform> p=platformRepository.findByName(name);
            	if(p.size()==0)
            		return new ResponseEntity<List<Platform>>(p,HttpStatus.NOT_FOUND);
            	return new ResponseEntity<List<Platform>>(p,HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Platform>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    	
    	return new ResponseEntity<List<Platform>>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<Void> updatePlatform(@ApiParam(value = "Platform object that needs to be updated in the list" ,required=true )  @Valid @RequestBody Platform platform) {
    	
        Platform p=  platformRepository.findOne(platform.getId());
    	if(p == null)
        	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    	
    	platformRepository.save(platform);
    	return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
