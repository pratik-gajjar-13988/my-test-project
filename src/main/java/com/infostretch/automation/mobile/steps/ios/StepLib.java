package com.infostretch.automation.mobile.steps.ios;

import com.infostretch.automation.mobile.steps.common.IStepLib;
import static com.qmetry.qaf.automation.step.CommonStep.click;
/**
 * 
 * @author pratik.gajjar
 */
public class StepLib implements IStepLib {

	@Override
	public void backfromplaystore() {
		click("btn.back.apptore.appname");
	}

}
