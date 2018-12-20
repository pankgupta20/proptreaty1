package scenariocontext;

import gherkin.formatter.model.Scenario;

public class ScenarioContext {
	private static ScenarioContext scenariocontext;
	Scenario scenario;
	
	private ScenarioContext(){
	}
	
	public static ScenarioContext getInstance() {
        return scenariocontext;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

	
	
	
	
}
