



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

package fUML.Semantics.Actions.IntermediateActions;

import fUML.utility.MexSystem;
import fUML.Debug;
import UMLPrimitiveTypes.intList;

 		 	 				    		 	 			import fUML.Syntax.*;
import fUML.Syntax.Classes.Kernel.*;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.*;
import fUML.Syntax.CommonBehaviors.Communications.*;
import fUML.Syntax.Activities.IntermediateActivities.*;
import fUML.Syntax.Actions.BasicActions.*;
import fUML.Syntax.Actions.IntermediateActions.*;

import fUML.Semantics.*;
import fUML.Semantics.Classes.Kernel.*;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.*;
import fUML.Semantics.Activities.IntermediateActivities.*;
import fUML.Semantics.Actions.BasicActions.*;
import fUML.Semantics.Loci.*;


								    		

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fUML::Semantics::Actions::IntermediateActions::LinkActionActivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 	 *   <li>{@link LinkActionActivation#linkMatchesEndData <em>linkMatchesEndData</em>}</li>
	 *   <li>{@link LinkActionActivation#endMatchesEndData <em>endMatchesEndData</em>}</li>
	 *   <li>{@link LinkActionActivation#getAssociation <em>getAssociation</em>}</li>
	 	 * </ul>
 * </p>
 *
 * @generated
 */


public  abstract class LinkActionActivation    extends fUML.Semantics.Actions.BasicActions.ActionActivation    {
 	    
	// Attributes
 	    
// Operations of the class
	  /**
   * operation linkMatchesEndData
   * <!-- begin-user-doc -->
   		   * <!-- end-user-doc -->
   * @generated
   */

	public     boolean linkMatchesEndData(fUML.Semantics.Classes.Kernel.Link link, fUML.Syntax.Actions.IntermediateActions.LinkEndDataList endDataList)   {
	 		 	 			// Test whether the given link matches the given end data.

boolean matches = true;
int i = 1;
while (matches & i <= endDataList.size()) {
    matches = this.endMatchesEndData(link, endDataList.getValue(i-1));
    i = i + 1;
}

return matches;

								    			  }
	
	  /**
   * operation endMatchesEndData
   * <!-- begin-user-doc -->
   		   * <!-- end-user-doc -->
   * @generated
   */

	public     boolean endMatchesEndData(fUML.Semantics.Classes.Kernel.Link link, fUML.Syntax.Actions.IntermediateActions.LinkEndData endData)   {
	 		 	 			// Test whether the appropriate end of the given link matches the given end data.

boolean matches = false;
if (endData.value == null) {
    matches = true;
} else {
    Property end = endData.end;
    FeatureValue linkFeatureValue = link.getFeatureValue(end);
    Value endValue = this.getTokens(endData.value).getValue(0);
    if (endData instanceof LinkEndDestructionData) {
            if (!((LinkEndDestructionData)endData).isDestroyDuplicates & !end.multiplicityElement.isUnique & end.multiplicityElement.isOrdered)  {
                int destroyAt = ((UnlimitedNaturalValue)(this.getTokens(((LinkEndDestructionData)endData).destroyAt).getValue(0))).value.naturalValue;
                matches = linkFeatureValue.values.getValue(0).equals(endValue) && linkFeatureValue.position == destroyAt;
            } else {
                matches = linkFeatureValue.values.getValue(0).equals(endValue);
            }
    } else {
        matches =  linkFeatureValue.values.getValue(0).equals(endValue);
    }
}

return matches;

								    			  }
	
	  /**
   * operation getAssociation
   * <!-- begin-user-doc -->
   		   * <!-- end-user-doc -->
   * @generated
   */

	public     fUML.Syntax.Classes.Kernel.Association getAssociation()   {
	 		 	 			// Get the association for the link action of this activation.

return (Association)(((LinkAction)(this.node)).endData.getValue(0).end.association);

								    			  }
	
} //LinkActionActivation
