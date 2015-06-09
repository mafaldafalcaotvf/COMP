import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MyjQueryListener extends jQueryParserBaseListener 
{
	private HashMap<String, InOutV> vars;
	private HashMap<String, Variable> localVarsInUse;
	private int errors;
	

	public MyjQueryListener() {
		vars = new HashMap<String, InOutV>();
		localVarsInUse = new HashMap<String, Variable>();
		errors = 0;
	}
	
	
    @Override 
    public void enterSelector(jQueryParserParser.SelectorContext ctx) { }

    @Override 
    public void exitSelector(jQueryParserParser.SelectorContext ctx) { }

    @Override 
    public void enterInput(jQueryParserParser.InputContext ctx) { 
    	try
    	{
    		String str = ctx.getText();
    		Variable v = null;
    		
    		if(localVarsInUse.containsKey(str))
    		{
    			/*if(localVarsInUse.get(str).)
    			{
    				v = localVarsInUse.get(str);
    			}*/
    		}
    		

    	} catch (NullPointerException e) {
				System.out.println("Syntax Error!");
				return;
    	}
    }

    @Override 
    public void exitInput(jQueryParserParser.InputContext ctx) { }
    
    @Override
    public void enterCode(jQueryParserParser.CodeContext ctx){}
	
    @Override
	public void exitCode(jQueryParserParser.CodeContext ctx){}
    
    @Override 
    public void enterOutput(jQueryParserParser.OutputContext ctx) { }

    @Override 
    public void exitOutput(jQueryParserParser.OutputContext ctx) { }

    @Override 
    public void enterAssign_selection(jQueryParserParser.Assign_selectionContext ctx) { }

    @Override 
    public void exitAssign_selection(jQueryParserParser.Assign_selectionContext ctx) { }
    
    @Override 
    public void enterFilter(jQueryParserParser.FilterContext ctx) { }
   
    @Override 
    public void exitFilter(jQueryParserParser.FilterContext ctx) { }
    
    @Override 
    public void enterOps(jQueryParserParser.OpsContext ctx) { }
    
    @Override 
    public void exitOps(jQueryParserParser.OpsContext ctx) { }
    
    @Override 
    public void enterMain(jQueryParserParser.MainContext ctx) { 
    	//iniciar o bloco de jquery, está definido com mode
    }
    
    @Override 
    public void exitMain(jQueryParserParser.MainContext ctx) { 
    	System.out.println("Build Finish!");
    	System.out.println("Errors: " + errors);
    }

    @Override 
    public void enterEveryRule(ParserRuleContext ctx) { }
    
    @Override 
    public void exitEveryRule(ParserRuleContext ctx) { }
    
    @Override 
    public void visitTerminal(TerminalNode node) { }
    
    @Override 
    public void visitErrorNode(ErrorNode node) { }
}
