package csc332project.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory

public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
	public void addGlobalsAndPanelComponents(){
		
		addSliderWL("numUnvaccinated", "Number of non-immune", 1, 1, 100, 30)
		addSliderWL("numVaccinated", "Number of immune", 1, 1, 100, 50)
		addMonitorWL("remainingUnvaccinateds", "Remaining Uninfected", 1)


	}
}