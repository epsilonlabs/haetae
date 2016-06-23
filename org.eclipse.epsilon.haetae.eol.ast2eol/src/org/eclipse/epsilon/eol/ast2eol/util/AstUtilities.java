package org.eclipse.epsilon.eol.ast2eol.util;


import java.util.ArrayList;

import org.eclipse.epsilon.common.parse.AST;

public class AstUtilities {

	public static int getChildrenCount(AST parent) {
		int count = 0;
		if (parent == null) return count;
		AST child = parent.getFirstChild();
		while (child != null){
			count++;
			child = child.getNextSibling();
		}
		return count;
	}
	
	public static AST getPreviousSibling(AST ast)
	{
		AST result = null;
		AST parentAst = ast.getParent();
		for(AST child: parentAst.getChildren())
		{
			if(child.childIndex == ast.childIndex)
			{
				if (child.childIndex > 1) {
					result = parentAst.getChild(child.childIndex-1);
				}
				else {
					return null;
				}
			}
		}
		return result;
	}
	
	public static AST getChildAt(AST parent, int index) {
		int count = 0;
		if (parent == null) return null;
		AST child = parent.getFirstChild();
		while (child != null){
			if (count == index) {
				return child;
			}
			else {
				child = child.getNextSibling();
				count++;
			}
		}
		return null;
	}
	
	public static ArrayList<AST> getChildren(AST parent){
		return getChildren(parent, -1);
	}
	
	public static ArrayList<AST> getChildrenBut(AST parent, int type){
		ArrayList<AST> children = new ArrayList<AST>();
		AST child = parent.getFirstChild();
		while (child != null){
			if (!(child.getType() == type)){
				children.add(child);
			}
			child = child.getNextSibling();
		}
		return children;
	}
	public static ArrayList<AST> getChildren(AST parent, int... type){
		ArrayList<AST> children = new ArrayList<AST>();
		
		if (parent != null) {
			AST child = parent.getFirstChild();
			while (child != null){
				for (int i=0;i<type.length;i++) {
					if (child.getType() == type[i] || type[i] == -1){
						children.add(child);
					}
				}
				child = child.getNextSibling();
			}
		}
		
		return children;
	}
	
	public static AST getChild(AST parent, int type){
		if (parent == null) return null;
		AST child = parent.getFirstChild();
		while (child != null){
			if (child.getType() == type){
				return child;
			}
			child = child.getNextSibling();
		}
		return null;
	}
	
	public static AST getFirstConcreteChild(AST parent){
		if (parent.getLine() > 0){
			return parent;
		}
		else {
			AST child = parent.getFirstChild();
			while (child != null){
				AST result = getFirstConcreteChild(child);
				if (result != null){
					return result;
				}
			}
			return null;
		}
	}
	
	public static int getParentType(AST child) {
		if (child.getParent() == null) return -1;
		return child.getParent().getType();
	}
}
