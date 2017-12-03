package csc332project;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoLink<T> extends BaseLink<T>	{

	/**
	 * Returns an agentset of infecteds on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of infecteds on patch p
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Infected")
	public AgentSet<csc332project.relogo.Infected> infectedsOn(Patch p){
		AgentSet<csc332project.relogo.Infected> result = new AgentSet<csc332project.relogo.Infected>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"infected")){
			if (t instanceof csc332project.relogo.Infected)
			result.add((csc332project.relogo.Infected)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of infecteds on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of infecteds on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Infected")
	public AgentSet<csc332project.relogo.Infected> infectedsOn(Turtle t){
		AgentSet<csc332project.relogo.Infected> result = new AgentSet<csc332project.relogo.Infected>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"infected")){
			if (tt instanceof csc332project.relogo.Infected)
			result.add((csc332project.relogo.Infected)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of infecteds on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of infecteds on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Infected")
	public AgentSet<csc332project.relogo.Infected> infectedsOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<csc332project.relogo.Infected>();
		}

		Set<csc332project.relogo.Infected> total = new HashSet<csc332project.relogo.Infected>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(infectedsOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(infectedsOn(p));
				}
			}
		}
		return new AgentSet<csc332project.relogo.Infected>(total);
	}

	/**
	 * Queries if object is a infected.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a infected
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Infected")
	public boolean isInfectedQ(Object o){
		return (o instanceof csc332project.relogo.Infected);
	}

	/**
	 * Returns the infected with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Infected")
	public csc332project.relogo.Infected infected(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof csc332project.relogo.Infected)
			return (csc332project.relogo.Infected) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all infecteds.
	 * 
	 * @return agentset of all infecteds
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Infected")
	public AgentSet<csc332project.relogo.Infected> infecteds(){
		AgentSet<csc332project.relogo.Infected> a = new AgentSet<csc332project.relogo.Infected>();
		for (Object e : this.getMyObserver().getContext().getObjects(csc332project.relogo.Infected.class)) {
			if (e instanceof csc332project.relogo.Infected){
				a.add((csc332project.relogo.Infected)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of unvaccinateds on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of unvaccinateds on patch p
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Unvaccinated")
	public AgentSet<csc332project.relogo.Unvaccinated> unvaccinatedsOn(Patch p){
		AgentSet<csc332project.relogo.Unvaccinated> result = new AgentSet<csc332project.relogo.Unvaccinated>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"unvaccinated")){
			if (t instanceof csc332project.relogo.Unvaccinated)
			result.add((csc332project.relogo.Unvaccinated)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of unvaccinateds on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of unvaccinateds on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Unvaccinated")
	public AgentSet<csc332project.relogo.Unvaccinated> unvaccinatedsOn(Turtle t){
		AgentSet<csc332project.relogo.Unvaccinated> result = new AgentSet<csc332project.relogo.Unvaccinated>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"unvaccinated")){
			if (tt instanceof csc332project.relogo.Unvaccinated)
			result.add((csc332project.relogo.Unvaccinated)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of unvaccinateds on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of unvaccinateds on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Unvaccinated")
	public AgentSet<csc332project.relogo.Unvaccinated> unvaccinatedsOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<csc332project.relogo.Unvaccinated>();
		}

		Set<csc332project.relogo.Unvaccinated> total = new HashSet<csc332project.relogo.Unvaccinated>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(unvaccinatedsOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(unvaccinatedsOn(p));
				}
			}
		}
		return new AgentSet<csc332project.relogo.Unvaccinated>(total);
	}

	/**
	 * Queries if object is a unvaccinated.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a unvaccinated
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Unvaccinated")
	public boolean isUnvaccinatedQ(Object o){
		return (o instanceof csc332project.relogo.Unvaccinated);
	}

	/**
	 * Returns the unvaccinated with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Unvaccinated")
	public csc332project.relogo.Unvaccinated unvaccinated(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof csc332project.relogo.Unvaccinated)
			return (csc332project.relogo.Unvaccinated) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all unvaccinateds.
	 * 
	 * @return agentset of all unvaccinateds
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Unvaccinated")
	public AgentSet<csc332project.relogo.Unvaccinated> unvaccinateds(){
		AgentSet<csc332project.relogo.Unvaccinated> a = new AgentSet<csc332project.relogo.Unvaccinated>();
		for (Object e : this.getMyObserver().getContext().getObjects(csc332project.relogo.Unvaccinated.class)) {
			if (e instanceof csc332project.relogo.Unvaccinated){
				a.add((csc332project.relogo.Unvaccinated)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.UserTurtle")
	public AgentSet<csc332project.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<csc332project.relogo.UserTurtle> result = new AgentSet<csc332project.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"userTurtle")){
			if (t instanceof csc332project.relogo.UserTurtle)
			result.add((csc332project.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.UserTurtle")
	public AgentSet<csc332project.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<csc332project.relogo.UserTurtle> result = new AgentSet<csc332project.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"userTurtle")){
			if (tt instanceof csc332project.relogo.UserTurtle)
			result.add((csc332project.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.UserTurtle")
	public AgentSet<csc332project.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<csc332project.relogo.UserTurtle>();
		}

		Set<csc332project.relogo.UserTurtle> total = new HashSet<csc332project.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<csc332project.relogo.UserTurtle>(total);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof csc332project.relogo.UserTurtle);
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.UserTurtle")
	public csc332project.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof csc332project.relogo.UserTurtle)
			return (csc332project.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.UserTurtle")
	public AgentSet<csc332project.relogo.UserTurtle> userTurtles(){
		AgentSet<csc332project.relogo.UserTurtle> a = new AgentSet<csc332project.relogo.UserTurtle>();
		for (Object e : this.getMyObserver().getContext().getObjects(csc332project.relogo.UserTurtle.class)) {
			if (e instanceof csc332project.relogo.UserTurtle){
				a.add((csc332project.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of vaccinateds on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of vaccinateds on patch p
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Vaccinated")
	public AgentSet<csc332project.relogo.Vaccinated> vaccinatedsOn(Patch p){
		AgentSet<csc332project.relogo.Vaccinated> result = new AgentSet<csc332project.relogo.Vaccinated>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"vaccinated")){
			if (t instanceof csc332project.relogo.Vaccinated)
			result.add((csc332project.relogo.Vaccinated)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of vaccinateds on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of vaccinateds on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Vaccinated")
	public AgentSet<csc332project.relogo.Vaccinated> vaccinatedsOn(Turtle t){
		AgentSet<csc332project.relogo.Vaccinated> result = new AgentSet<csc332project.relogo.Vaccinated>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"vaccinated")){
			if (tt instanceof csc332project.relogo.Vaccinated)
			result.add((csc332project.relogo.Vaccinated)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of vaccinateds on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of vaccinateds on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Vaccinated")
	public AgentSet<csc332project.relogo.Vaccinated> vaccinatedsOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<csc332project.relogo.Vaccinated>();
		}

		Set<csc332project.relogo.Vaccinated> total = new HashSet<csc332project.relogo.Vaccinated>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(vaccinatedsOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(vaccinatedsOn(p));
				}
			}
		}
		return new AgentSet<csc332project.relogo.Vaccinated>(total);
	}

	/**
	 * Queries if object is a vaccinated.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a vaccinated
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Vaccinated")
	public boolean isVaccinatedQ(Object o){
		return (o instanceof csc332project.relogo.Vaccinated);
	}

	/**
	 * Returns the vaccinated with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Vaccinated")
	public csc332project.relogo.Vaccinated vaccinated(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof csc332project.relogo.Vaccinated)
			return (csc332project.relogo.Vaccinated) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all vaccinateds.
	 * 
	 * @return agentset of all vaccinateds
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.Vaccinated")
	public AgentSet<csc332project.relogo.Vaccinated> vaccinateds(){
		AgentSet<csc332project.relogo.Vaccinated> a = new AgentSet<csc332project.relogo.Vaccinated>();
		for (Object e : this.getMyObserver().getContext().getObjects(csc332project.relogo.Vaccinated.class)) {
			if (e instanceof csc332project.relogo.Vaccinated){
				a.add((csc332project.relogo.Vaccinated)e);
			}
		}
		return a;
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof csc332project.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.UserLink")
	public AgentSet<csc332project.relogo.UserLink> userLinks(){
		AgentSet<csc332project.relogo.UserLink> a = new AgentSet<csc332project.relogo.UserLink>();
		for (Object e : this.getMyObserver().getContext().getObjects(csc332project.relogo.UserLink.class)) {
			if (e instanceof csc332project.relogo.UserLink){
				a.add((csc332project.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.UserLink")
	public csc332project.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (csc332project.relogo.UserLink)(this.getMyObserver().getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("csc332project.relogo.UserLink")
	public csc332project.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable numUnvaccinated.
	 *
	 * @return the value of the global variable numUnvaccinated
	 */
	@ReLogoBuilderGeneratedFor("global: numUnvaccinated")
	public Object getNumUnvaccinated(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numUnvaccinated");
	}

	/**
	 * Sets the value of the global variable numUnvaccinated.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numUnvaccinated")
	public void setNumUnvaccinated(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numUnvaccinated",value);
	}

	/**
	 * Returns the value of the global variable numVaccinated.
	 *
	 * @return the value of the global variable numVaccinated
	 */
	@ReLogoBuilderGeneratedFor("global: numVaccinated")
	public Object getNumVaccinated(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numVaccinated");
	}

	/**
	 * Sets the value of the global variable numVaccinated.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numVaccinated")
	public void setNumVaccinated(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numVaccinated",value);
	}


}