package com.actitime.testscript;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass {
	@Test(groups="smokeTest")
	public void createTask() {
		Reporter.log("create project",true);
	}
	@Test(groups="regressionTest")
	public void modifyTask(){
		Reporter.log("modify project",true);
	}
	@Test(groups="regressionTest")
	public void deleteTask() {
		Reporter.log("delete project",true);
	}}

