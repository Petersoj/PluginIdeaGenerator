package me.petersoj.idea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import me.petersoj.util.Utils;

public class PluginIdeas {
	
	private String[] verbs, adverbs, nounObjects, nounPlaces, nounPersons, prepositions;
	
	public PluginIdeas(){
		this.verbs = this.readFileIntoArray("verbs.txt");
		this.adverbs = this.readFileIntoArray("adverbs.txt");
		this.nounObjects = this.readFileIntoArray("noun_objects.txt");
		this.nounPlaces = this.readFileIntoArray("noun_places.txt");
		this.nounPersons = this.readFileIntoArray("noun_persons.txt");
		this.prepositions = this.readFileIntoArray("prepositions.txt");
	}
	private String[] readFileIntoArray(String fileName){
		String[] newArray = null;
		try{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/words/" + fileName)));
			
			ArrayList<String> tempStrings = new ArrayList<String>();
			
			String line = "";
			while((line = bufferedReader.readLine()) != null){
				tempStrings.add(line);
			}
			
			newArray = tempStrings.toArray(new String[tempStrings.size()]);
		}catch(Exception e){
			e.printStackTrace();
		}
		return newArray;
	}
	
	
	public String getNewPluginIdea(){
		return "A plugin that " + getAdverb() + " " + getVerb() + " " + getNounObject()
			+ " " + getPreposition() + " " + getNounPlace() + " " + getPreposition() + " " + getNounPerson();
	}
	
	private String getVerb(){
		return verbs[Utils.getRandomInt(0, verbs.length)];
	}
	
	private String getAdverb(){
		return adverbs[Utils.getRandomInt(0, verbs.length)];
	}
	
	private String getNounObject(){
		return nounObjects[Utils.getRandomInt(0, verbs.length)];
	}

	private String getNounPlace(){
		return nounPlaces[Utils.getRandomInt(0, verbs.length)];
	}
	
	private String getNounPerson(){
		return nounPersons[Utils.getRandomInt(0, verbs.length)];
	}
	
	private String getPreposition(){
		return prepositions[Utils.getRandomInt(0, verbs.length)];
	}
}
