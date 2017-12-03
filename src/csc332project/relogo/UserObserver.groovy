package csc332project.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import csc332project.ReLogoObserver;

class UserObserver extends ReLogoObserver{
	@Setup
	def setup(){
		clearAll()
		setDefaultShape(Infected,"human")
		setDefaultShape(Vaccinated,"human")
		setDefaultShape(Unvaccinated,"human")
		
		createInfecteds(1){
			setxy(randomXcor(),randomYcor())
		}
		createVaccinateds(numVaccinated){
			setxy(randomXcor(),randomYcor())
		}
		createUnvaccinateds(numUnvaccinated){
			setxy(randomXcor(),randomYcor())
		}
		
		
	}
	
	@Go
	def go(){
		
		ask (infecteds()){
			step()
			
		}
		
		ask (unvaccinateds()){
			step()
		}
		
		ask (vaccinateds()){
			step()
		}
		
		// Ends the simulation when
		// no humans are left
		if (emptyQ(unvaccinateds())){
			pause()
			// Could choose to pause as well.
			// pause()
		}
		
	}
	
	def remainingUnvaccinateds(){
		count(unvaccinateds())
	}
		


}