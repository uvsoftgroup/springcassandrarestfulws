/**
 * 
 */
package uvsoftgroup.springcassandrarestfulws.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uvsoftgroup.springcassandrarestfulws.model.UserRegistration;
import uvsoftgroup.springcassandrarestfulws.servicesimpl.UserRegistrationServiceImpl;
import uvsoftgroup.springcassandrarestfulws.utility.ResultTO;


@RestController
@RequestMapping("/userregistrations")
public class UserRegistrationController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
    private UserRegistrationServiceImpl userRegistrationServiceImpl;
    
    public UserRegistrationController(
			UserRegistrationServiceImpl userRegistrationServiceImpl) {
		super();
		this.userRegistrationServiceImpl = userRegistrationServiceImpl;
	}

	public UserRegistrationController() {
        System.out.println("UserRegistrationController");
    }
     
	@RequestMapping(method = RequestMethod.GET)
    List<UserRegistration> findAll() {
		logger.info("------------findAll()------------------");
        return userRegistrationServiceImpl.findAll();
    }
	
	@RequestMapping(value = "/fromCR", method = RequestMethod.GET)
    List<UserRegistration> findAllCR() {
		logger.info("------------findAllCR()------------------");
        return userRegistrationServiceImpl.findAllFromCR();
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)    
	UserRegistration findOne(@PathVariable("id") Long id) { 
		logger.info("------------findOne()------------------");
	        return userRegistrationServiceImpl.findOne(id);
	  }
	
	

    @RequestMapping(value = "/userRegistration", method = RequestMethod.POST)    
    UserRegistration create(@RequestBody UserRegistration userRegistration) {  
    	logger.info("------------create()------------------");
        return userRegistrationServiceImpl.save(userRegistration);
    }
    
    
    @RequestMapping(value = "/userRegistrationCR", method = RequestMethod.POST)    
   public Map<String, Object> createFromCR(@RequestBody UserRegistration userRegistration) {  
    	logger.info("------------createFromCR()------------------");
    	UserRegistration ob=userRegistrationServiceImpl.saveFromCR(userRegistration);
    	
    	Map<String, Object> dataMap = new HashMap<String, Object>();
    	ResultTO resultTO=new ResultTO();
    	
    	if(ob!=null && ob.getUserRegistrationId()!=null){
    		resultTO=new ResultTO();
    		
    		resultTO.setStatus("Created");
        	resultTO.setCode(Long.valueOf(HttpStatus.CREATED.value()));
        	resultTO.setId(ob.getUserRegistrationId());
        	resultTO.setMessage(true);
        	
        	dataMap.put("resultTO", resultTO);
        	dataMap.put("userRegistration", ob);
        	
    		return dataMap;
    	}
    	else{
    		resultTO.setStatus("Not Acceptable");
        	resultTO.setCode(Long.valueOf(HttpStatus.NOT_ACCEPTABLE.value()));
        	resultTO.setMessage(false);
        	
        	dataMap.put("resultTO", resultTO);
        	dataMap.put("userRegistration", ob);
        	
        	return dataMap;
    	}
    }
    
    
    @RequestMapping(value = "/userRegistration", method = RequestMethod.PUT)    
    public UserRegistration update(@RequestBody UserRegistration userRegistration) {   
    	logger.info("------------update()------------------");
        return userRegistrationServiceImpl.update(userRegistration);
    }
    
    
    @RequestMapping(value = "/userRegistrationCR/{id}", method = RequestMethod.PUT)    
    public Map<String, Object> updateFromCR(@RequestBody UserRegistration userRegistration,@PathVariable("id") Long id) { 
    	
    	logger.info("------------updateFromCR()------------------");
    	
    	UserRegistration ob=userRegistrationServiceImpl.updateFromCR(userRegistration, id);
    	Map<String, Object> dataMap = new HashMap<String, Object>();
    	ResultTO resultTO=new ResultTO();
    	
    	if(ob!=null && ob.getUserRegistrationId()!=null){
    		resultTO=new ResultTO();
    		
    		resultTO.setStatus("Accepted");
        	resultTO.setCode(Long.valueOf(HttpStatus.ACCEPTED.value()));
        	resultTO.setId(ob.getUserRegistrationId());
        	resultTO.setMessage(true);
        	
        	dataMap.put("resultTO", resultTO);
        	dataMap.put("userRegistration", ob);
        	
    		return dataMap;
    	}
    	else{
    		resultTO.setStatus("No Content");
        	resultTO.setCode(Long.valueOf(HttpStatus.NO_CONTENT.value()));
        	resultTO.setMessage(false);
        	
        	dataMap.put("resultTO", resultTO);
        	dataMap.put("userRegistration", ob);
        	return dataMap;
    	}
    	
    }
    
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)    
    void delete(@PathVariable("id") Long id) {       
    	logger.info("------------delete()------------------");
        userRegistrationServiceImpl.delete(id);
    }
    
    
    @RequestMapping(value = "/userRegistrationCR/{id}", method = RequestMethod.DELETE)    
    public ResultTO deleteFromCR(@PathVariable("id") Long id) { 
    	
    	logger.info("------------deleteFromCR()------------------");
    	ResultTO resultTO=userRegistrationServiceImpl.deleteFromCR(id);
    	if(resultTO!=null && resultTO.getMessage()){
    		resultTO.setStatus("OK");
        	resultTO.setCode(Long.valueOf(HttpStatus.OK.value()));
            return resultTO;
    	}
    	else{
    		resultTO.setStatus("No Content");
        	resultTO.setCode(Long.valueOf(HttpStatus.NO_CONTENT.value()));
        	return resultTO;
    	}
    	
    }
    
    
}
