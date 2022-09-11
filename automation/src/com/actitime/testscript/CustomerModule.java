package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass {
@Test
public void CreateCustomer() {
	Reporter.log("CreateCustomer",true);
}
@Test
public void ModifyCustomer() {
	Reporter.log("ModifyCustomer",true);
}
@Test
public void DeleteCustomer() {
	Reporter.log("DeleteCustomer",true);
}
}
