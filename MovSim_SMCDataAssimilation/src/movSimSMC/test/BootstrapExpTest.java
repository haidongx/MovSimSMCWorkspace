package movSimSMC.test;

import movSimSMC.BootstrapMovSimIdenticalTwinExperiment;

public class BootstrapExpTest
{

	public static void main(String[] args)
	{
		int particleN = 50;
		int stepLength = 15;
		int stepN = 6;
		
		BootstrapMovSimIdenticalTwinExperiment exp = new BootstrapMovSimIdenticalTwinExperiment(stepLength);
		try
		{
			exp.runDataAssimilationExperiement(stepN, particleN);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
