package net.runelite.api.mixins;

/*
import com.sun.source.tree.VariableTree;
import com.sun.source.util.TreePathScanner;
import com.sun.source.util.Trees;


https://git.openrs2.org/openrs2/openrs2/src/commit/e804fdc0655cb95328250f29e46aee403de040b1/deob-processor/src/main/kotlin/org/openrs2/deob/processor
https://git.openrs2.org/openrs2/openrs2/src/commit/e804fdc0655cb95328250f29e46aee403de040b1/deob-processor/src/main/kotlin/org/openrs2/deob/processor/NameMapProcessor.kt

    "org.openrs2.deob.annotation.OriginalArg",
    "org.openrs2.deob.annotation.OriginalClass",
    "org.openrs2.deob.annotation.OriginalMember",
    "org.openrs2.deob.annotation.Pc"
    
*/
public class Test {

	public static void main(String[] args) {
		//PLAN: Loop through all client classes and then check for an annotation. If so, add it to a list for the correct type.
		
	}

	
	String generateSetters(Class clazz, ParaSetter a) {
		String s = a.value();
		a.getClass();
		switch(s) {
		case "setInterface":
			return "<accessor>Client</accessor><into>"+clazz+"</into><field>"+s+"</field><methodname>setInterface</methodname><descfield>I</descfield>";
		}
		
		return null;	
	}
}
