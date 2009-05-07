
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
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>fUML::Semantics::Actions::IntermediateActions::ReadLinkActionActivation</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link ReadLinkActionActivation#doAction <em>doAction</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class ReadLinkActionActivation extends
        fUML.Semantics.Actions.IntermediateActions.LinkActionActivation {

    // Attributes

    // Operations of the class
    /**
     * operation doAction <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void doAction() {
        // Get the extent, at the current execution locus, of the association to
        // which the action applies.
        // For all links that match the link end data, place the value of the
        // remaining "open" end on the result pin.

        ReadLinkAction action = (ReadLinkAction) (this.node);
        LinkEndDataList endDataList = action.endData;
        LinkEndData openEnd = null;

        int i = 1;
        while ((openEnd == null) & i <= endDataList.size()) {
            if (endDataList.getValue(i - 1).value == null) {
                openEnd = endDataList.getValue(i - 1);
            }
            i = i + 1;
        }

        ExtensionalValueList extent = this.getExecutionLocus().getExtent(this.getAssociation());

        for (int j = 0; j < extent.size(); j++) {
            ExtensionalValue value = extent.getValue(j);
            Link link = (Link) value;
            if (this.linkMatchesEndData(link, endDataList)) {
                Value resultValue = link.getFeatureValue(openEnd.end).values.getValue(0);
                this.putToken(action.result, resultValue);
            }
        }

        // Now that matching is done, ensure that all tokens on end data input
        // pins
        // are consumed.
        for (int k = 0; k < endDataList.size(); k++) {
            LinkEndData endData = endDataList.getValue(k);
            if (endData.value != null) {
                this.takeTokens(endData.value);
            }
        }

    } // doAction

} // ReadLinkActionActivation
