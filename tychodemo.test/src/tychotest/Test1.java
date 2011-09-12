package tychotest;

import static org.junit.Assert.assertTrue;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.junit.Test;

public class Test1 {
	protected static final SWTWorkbenchBot bot = new SWTWorkbenchBot();
	
	@Test
	public void test() {
		SWTBotView view0 = bot.viewById("tychodemo.view");
		assertTrue("View".equals(view0.getTitle()));
		SWTBotMenu menu = bot.menu("File");
		menu.click();
		SWTBotView view = bot.activeView();
		//assertTrue("View".equals(view.getTitle()));
		System.out.println("Happy Testing");
		if(view!=null)
			System.out.println(view.getTitle());
	}

}
