package csc332project.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory

public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
	public void addGlobalsAndPanelComponents(){
		
		addSliderWL("numUnvaccinated", "Number of non-immune", 0, 1, 200, 2)
		addSliderWL("numVaccinated", "Number of immune", 0, 1, 200, 198)
		addMonitorWL("remainingUnvaccinateds", "Remaining Uninfected", 1)


	}
}