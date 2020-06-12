package uvsoftgroup.springcassandrarestfulws.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import uvsoftgroup.springcassandrarestfulws.model.PlotInfo;
import uvsoftgroup.springcassandrarestfulws.services.PlotInfoService;

@RestController
@RequestMapping("/plotInfos")
public class PlotInfoController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private PlotInfoService plotInfoService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.CREATED)
   public List<PlotInfo> getPlotInfos() {
		logger.info("------------getPlotInfos()------------------");
        return plotInfoService.getPlotInfos();
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.CREATED)
	public PlotInfo getPlotInfo(@PathVariable("id") Long id) {  
		logger.info("------------getPlotInfo()------------------");
	        return plotInfoService.getPlotInfo(id);
	  }
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public PlotInfo savePlotInfo(@RequestBody @Valid PlotInfo plotInfo) {    
		logger.info("------------savePlotInfo()------------------");
	        return plotInfoService.savePlotInfo(plotInfo);
	  }
	
	@RequestMapping(value = "/{id}", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.CREATED)
	public PlotInfo updatePlotInfo(@PathVariable("id") Long id, @RequestBody @Valid PlotInfo plotInfo) {     
		logger.info("------------updatePlotInfo()------------------");
	        return plotInfoService.updatePlotInfo(id, plotInfo);
	  }
	
	@RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.CREATED)
	public PlotInfo deletePlotInfo(@PathVariable("id") Long id) {  
		logger.info("------------deletePlotInfo()------------------");
	        return plotInfoService.deletePlotInfo(id);
	  }
	
}
