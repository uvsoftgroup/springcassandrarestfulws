package uvsoftgroup.springcassandrarestfulws.services;

import java.util.List;

import org.springframework.stereotype.Service;

import uvsoftgroup.springcassandrarestfulws.model.PlotInfo;

@Service
public interface PlotInfoService {
	public List<PlotInfo> getPlotInfos();
	public PlotInfo savePlotInfo(PlotInfo plotInfo);
	public PlotInfo updatePlotInfo(Long id, PlotInfo plotInfo);
	public PlotInfo deletePlotInfo(Long id);
	public PlotInfo getPlotInfo(Long id);
}
