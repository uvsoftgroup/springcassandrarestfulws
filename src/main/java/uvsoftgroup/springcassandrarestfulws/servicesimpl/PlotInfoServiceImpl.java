package uvsoftgroup.springcassandrarestfulws.servicesimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uvsoftgroup.springcassandrarestfulws.model.PlotInfo;
import uvsoftgroup.springcassandrarestfulws.repositories.PlotInfoCRUDRepository;
import uvsoftgroup.springcassandrarestfulws.services.PlotInfoService;


@Service
public class PlotInfoServiceImpl implements PlotInfoService {
	
	@Autowired
	private PlotInfoCRUDRepository plotInfoCRUDRepository;
	
	@Override
	public List<PlotInfo> getPlotInfos() {
		List<PlotInfo> list=(List<PlotInfo>) plotInfoCRUDRepository.findAll();
		return list;
	}
	
	@Override
	public PlotInfo getPlotInfo(Long id) {     
		PlotInfo plotInfoResult=plotInfoCRUDRepository.findOne(id);
		if(plotInfoResult!=null){
			return plotInfoResult;
		}
		else{
			return new PlotInfo();
		}
	
    }
	
	@Override
	public PlotInfo savePlotInfo(PlotInfo plotInfo) {
		if(plotInfo!=null){
			return plotInfoCRUDRepository.save(plotInfo);
		}
		else{
			return new PlotInfo();
		}
	}
	
	@Override
	public PlotInfo updatePlotInfo(Long id, PlotInfo plotInfo) {
		PlotInfo plotInfoResult=plotInfoCRUDRepository.findOne(id);
		if(plotInfoResult!=null){
			return plotInfoCRUDRepository.save(plotInfo);	
		}
		else{
			return new PlotInfo();
		}
	}
	
	@Override
	public PlotInfo deletePlotInfo(Long id) {
		PlotInfo plotInfoResult=plotInfoCRUDRepository.findOne(id);
		if(plotInfoResult!=null){
			plotInfoCRUDRepository.delete(id);
			return plotInfoResult;
		}
		else{
			return new PlotInfo();
		}
	}
	
}
