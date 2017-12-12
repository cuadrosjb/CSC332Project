package csc332project.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*

import csc332project.ReLogoTurtle
import repast.simphony.relogo.Plural
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

class Unvaccinated extends ReLogoTurtle {
	
	def infected = false
	
	def step(){		
		//face random direction
		facexy(randomXcor(),randomYcor())
		fd(1)
		if(infected) {
			die()
			hatchInfecteds(1)
		}
		setColor(15)
		
		label = ""
		
	}
	

}
