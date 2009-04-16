



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

package fUML.Syntax.Classes.Kernel;

import fUML.utility.MexSystem;
import fUML.Debug;
import UMLPrimitiveTypes.intList;

 		

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fUML::Syntax::Classes::Kernel::DataType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 	 *   <li>{@link DataType#addOwnedAttribute <em>addOwnedAttribute</em>}</li>
	 *   <li>{@link DataType#addOwnedOperation <em>addOwnedOperation</em>}</li>
	 	 *   <li>{@link DataType#ownedAttribute <em>ownedAttribute</em>}</li>
	 *   <li>{@link DataType#ownedOperation <em>ownedOperation</em>}</li>
	 * </ul>
 * </p>
 *
 * @generated
 */


public   class DataType    extends fUML.Syntax.Classes.Kernel.Classifier    {
 	    
	// Attributes
 	 		public   fUML.Syntax.Classes.Kernel.PropertyList ownedAttribute = 	new fUML.Syntax.Classes.Kernel.PropertyList()	;
	 		public   fUML.Syntax.Classes.Kernel.OperationList ownedOperation = 	new fUML.Syntax.Classes.Kernel.OperationList()	;
	    
// Operations of the class
	  /**
   * operation addOwnedAttribute
   * <!-- begin-user-doc -->
   		   * <!-- end-user-doc -->
   * @generated
   */

	public      void addOwnedAttribute(fUML.Syntax.Classes.Kernel.Property ownedAttribute)   {
	 		 	 			super.addAttribute(ownedAttribute);
super.addOwnedMember(ownedAttribute);

this.ownedAttribute.addValue(ownedAttribute);
ownedAttribute.datatype = this;

								    			  }
	
	  /**
   * operation addOwnedOperation
   * <!-- begin-user-doc -->
   		   * <!-- end-user-doc -->
   * @generated
   */

	public      void addOwnedOperation(fUML.Syntax.Classes.Kernel.Operation ownedOperation)   {
	 		 	 			super.addFeature(ownedOperation);
super.addOwnedMember(ownedOperation);

this.ownedOperation.addValue(ownedOperation);
ownedOperation.datatype = this;

								    			  }
	
} //DataType
