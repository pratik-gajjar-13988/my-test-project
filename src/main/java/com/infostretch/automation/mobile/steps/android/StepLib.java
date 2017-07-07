package com.infostretch.automation.mobile.steps.android;

import com.infostretch.automation.mobile.steps.common.IStepLib;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
/**
 * 
 * @author pratik.gajjar
 */
public class StepLib implements IStepLib {

	@Override
	public void backfromplaystore() {
		new WebDriverTestBase().getDriver().getUnderLayingDriver().navigate().back();
	}

}
