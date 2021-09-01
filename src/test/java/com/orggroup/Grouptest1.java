package com.orggroup;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mybaseclassnew.NewBaseClass;

public class Grouptest1 extends NewBaseClass{
	PoJoFb1 fb;
//	long starttime,endtime,totaltime;
//	@BeforeSuite
//	private void timeMillis() {
//		starttime=System.currentTimeMillis();
//
//	}
//	@AfterSuite
//	private void finaltime() {
//		endtime=System.currentTimeMillis();
//		totaltime=(endtime-starttime)/1000;
//		System.out.println("total time:"+totaltime);
//	}
	@BeforeMethod
	private void startBrowser() {
		launchBrowser();
		loadUrl(getFbUrl());
		maximizewindow();
		pagewait(10);
	}
	@AfterMethod
	private void quitBrowser() {
		closebrowser();
	}
	@Test(groups = {"f1"})
	public void test1() {
		fb=new PoJoFb1();
		fill(fb.getTxtusername(), "satham");
		fill(fb.getTxtpass(), "1221");
		clickbutton(fb.getBtnlogin());
		
	}
	@Test(groups = {"f2"})
	public void test2() {
		fb=new PoJoFb1();
		fill(fb.getTxtusername(), "hussain");
		fill(fb.getTxtpass(), "3434");
		clickbutton(fb.getBtnlogin());
		
	}
	@Test(groups = {"f3"})
	public void test3() {
		fb=new PoJoFb1();
		fill(fb.getTxtusername(), "mansoor");
		fill(fb.getTxtpass(), "1221");
		clickbutton(fb.getBtnlogin());
		
	}
	@Test(groups = {"f4"})
	public void test4() {
		fb=new PoJoFb1();
		fill(fb.getTxtusername(), "esa");
		fill(fb.getTxtpass(), "7674");
		clickbutton(fb.getBtnlogin());
		
	}
	
	
	
}
