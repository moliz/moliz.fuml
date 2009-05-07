
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

package fUML.Syntax.CommonBehaviors.Communications;

import fUML.utility.MexSystem;
import fUML.Debug;
import UMLPrimitiveTypes.intList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>fUML::Syntax::CommonBehaviors::Communications::Reception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link Reception#setSignal <em>setSignal</em>}</li>
 * <li>{@link Reception#signal <em>signal</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class Reception extends fUML.Syntax.Classes.Kernel.BehavioralFeature {

    // Attributes
    public fUML.Syntax.CommonBehaviors.Communications.Signal signal = null;

    // Operations of the class
    /**
     * operation setSignal <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSignal(fUML.Syntax.CommonBehaviors.Communications.Signal signal) {
        this.signal = signal;
    } // setSignal

} // Reception
