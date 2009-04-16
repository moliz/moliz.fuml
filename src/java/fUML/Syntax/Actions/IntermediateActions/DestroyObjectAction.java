



/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 *
 * Contributors:
 *   MDS - initial API and implementation
 *
 */

package fUML.Syntax.Actions.IntermediateActions;

import fUML.utility.MexSystem;
import fUML.Debug;
import UMLPrimitiveTypes.intList;

 		

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fUML::Syntax::Actions::IntermediateActions::DestroyObjectAction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 	 *   <li>{@link DestroyObjectAction#setIsDestroyLinks <em>setIsDestroyLinks</em>}</li>
	 *   <li>{@link DestroyObjectAction#setIsDestroyOwnedObjects <em>setIsDestroyOwnedObjects</em>}</li>
	 *   <li>{@link DestroyObjectAction#setTarget <em>setTarget</em>}</li>
	 	 *   <li>{@link DestroyObjectAction#isDestroyLinks <em>isDestroyLinks</em>}</li>
	 *   <li>{@link DestroyObjectAction#isDestroyOwnedObjects <em>isDestroyOwnedObjects</em>}</li>
	 *   <li>{@link DestroyObjectAction#target <em>target</em>}</li>
	 * </ul>
 * </p>
 *
 * @generated
 */


public   class DestroyObjectAction    extends fUML.Syntax.Actions.BasicActions.Action    {
 	    
	// Attributes
 	 		public   boolean isDestroyLinks = 	false	;
	 		public   boolean isDestroyOwnedObjects = 	false	;
	 		public   fUML.Syntax.Actions.BasicActions.InputPin target = 	 null	;
	    
// Operations of the class
	  /**
   * operation setIsDestroyLinks
   * <!-- begin-user-doc -->
   		   * <!-- end-user-doc -->
   * @generated
   */

	public      void setIsDestroyLinks(boolean isDestroyLinks)   {
	 		 	 			this.isDestroyLinks = isDestroyLinks;

								    			  }
	
	  /**
   * operation setIsDestroyOwnedObjects
   * <!-- begin-user-doc -->
   		   * <!-- end-user-doc -->
   * @generated
   */

	public      void setIsDestroyOwnedObjects(boolean isDestroyOwnedObjects)   {
	 		 	 			this.isDestroyOwnedObjects = isDestroyOwnedObjects;

								    			  }
	
	  /**
   * operation setTarget
   * <!-- begin-user-doc -->
   		   * <!-- end-user-doc -->
   * @generated
   */

	public      void setTarget(fUML.Syntax.Actions.BasicActions.InputPin target)   {
	 		 	 			super.addInput(target);
this.target = target;

								    			  }
	
} //DestroyObjectAction
