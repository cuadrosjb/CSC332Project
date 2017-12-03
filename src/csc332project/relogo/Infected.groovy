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

class Infected extends ReLogoTurtle {
	def step(){
		//face random direction
		facexy(randomXcor(),randomYcor())
		fd(1)
		
		setColor(55)
		
		if (count(unvaccinatedsHere()) > 0){
			label = "cough!"
			def infectee = oneOf(unvaccinateds())
			infect(infectee)
//			createInfectionTo(infectee)
		}
		else {
			label = ""
		}
	}
	
	def infect(unvaccinated){
		unvaccinated.infected = true
	}
}
