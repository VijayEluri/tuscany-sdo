/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.sequences.impl;

import commonj.sdo.helper.HelperContext;
import org.apache.tuscany.sdo.helper.TypeHelperImpl;

import com.example.sequences.*;

import commonj.sdo.DataObject;
import commonj.sdo.Property;
import commonj.sdo.Type;

import org.apache.tuscany.sdo.SDOFactory;

import org.apache.tuscany.sdo.impl.FactoryBase;

import org.apache.tuscany.sdo.model.ModelFactory;

import org.apache.tuscany.sdo.model.impl.ModelFactoryImpl;

import org.apache.tuscany.sdo.util.SDOUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * Generator information:
 * patternVersion=1.1; -prefix Sequences
 * <!-- end-user-doc -->
 * @generated
 */
public class SequencesFactoryImpl extends FactoryBase implements SequencesFactory
{

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String NAMESPACE_URI = "http://www.example.com/sequences";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String NAMESPACE_PREFIX = "seq";

  /**
   * The version of the generator pattern used to generate this class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String PATTERN_VERSION = "1.1";
  
  public static final int MIXED_QUOTE = 1;	
  public static final int MIXED_REPEATING_CHOICE = 2;	
  public static final int REPEATING_CHOICE = 3;	
  public static final int TWO_RCS = 4;	
  public static final int TWO_RCS_MIXED = 5;
  
  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequencesFactoryImpl()
  {
    super(NAMESPACE_URI, NAMESPACE_PREFIX, "com.example.sequences");
  }

  /**
   * Registers the Factory instance so that it is available within the supplied scope.
   * @argument scope a HelperContext instance that will make the types supported by this Factory available.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */	
  public void register(HelperContext scope) {
    if(scope == null) {
       throw new IllegalArgumentException("Scope can not be null");
    } 
    TypeHelperImpl th = (TypeHelperImpl)scope.getTypeHelper();
    th.getExtendedMetaData().putPackage(NAMESPACE_URI, this);
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataObject create(int typeNumber)
  {
    switch (typeNumber)
    {
      case MIXED_QUOTE: return (DataObject)createMixedQuote();
      case MIXED_REPEATING_CHOICE: return (DataObject)createMixedRepeatingChoice();
      case REPEATING_CHOICE: return (DataObject)createRepeatingChoice();
      case TWO_RCS: return (DataObject)createTwoRCs();
      case TWO_RCS_MIXED: return (DataObject)createTwoRCsMixed();
      default:
        return super.create(typeNumber);
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MixedQuote createMixedQuote()
  {
    MixedQuoteImpl mixedQuote = new MixedQuoteImpl();
    return mixedQuote;
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MixedRepeatingChoice createMixedRepeatingChoice()
  {
    MixedRepeatingChoiceImpl mixedRepeatingChoice = new MixedRepeatingChoiceImpl();
    return mixedRepeatingChoice;
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatingChoice createRepeatingChoice()
  {
    RepeatingChoiceImpl repeatingChoice = new RepeatingChoiceImpl();
    return repeatingChoice;
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoRCs createTwoRCs()
  {
    TwoRCsImpl twoRCs = new TwoRCsImpl();
    return twoRCs;
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoRCsMixed createTwoRCsMixed()
  {
    TwoRCsMixedImpl twoRCsMixed = new TwoRCsMixedImpl();
    return twoRCsMixed;
  }
  
  // Following creates and initializes SDO metadata for the supported types.			
  protected Type mixedQuoteType = null;

  public Type getMixedQuote()
  {
    return mixedQuoteType;
  }
    
  protected Type mixedRepeatingChoiceType = null;

  public Type getMixedRepeatingChoice()
  {
    return mixedRepeatingChoiceType;
  }
    
  protected Type repeatingChoiceType = null;

  public Type getRepeatingChoice()
  {
    return repeatingChoiceType;
  }
    
  protected Type twoRCsType = null;

  public Type getTwoRCs()
  {
    return twoRCsType;
  }
    
  protected Type twoRCsMixedType = null;

  public Type getTwoRCsMixed()
  {
    return twoRCsMixedType;
  }
  

  private static boolean isInited = false;

  public static SequencesFactoryImpl init()
  {
    if (isInited) return (SequencesFactoryImpl)FactoryBase.getStaticFactory(SequencesFactoryImpl.NAMESPACE_URI);
    SequencesFactoryImpl theSequencesFactoryImpl = new SequencesFactoryImpl();
    isInited = true;

    // Initialize simple dependencies
    SDOUtil.registerStaticTypes(SDOFactory.class);
    SDOUtil.registerStaticTypes(ModelFactory.class);

    // Create package meta-data objects
    theSequencesFactoryImpl.createMetaData();

    // Initialize created meta-data
    theSequencesFactoryImpl.initializeMetaData();

    // Mark meta-data to indicate it can't be changed
    //theSequencesFactoryImpl.freeze(); //FB do we need to freeze / should we freeze ????

    return theSequencesFactoryImpl;
  }
  
  private boolean isCreated = false;

  public void createMetaData()
  {
    if (isCreated) return;
    isCreated = true;	

    // Create types and their properties
    mixedQuoteType = createType(false, MIXED_QUOTE);
    createProperty(true, mixedQuoteType,MixedQuoteImpl.INTERNAL_MIXED); 
    createProperty(true, mixedQuoteType,MixedQuoteImpl.INTERNAL_SYMBOL); 
    createProperty(true, mixedQuoteType,MixedQuoteImpl.INTERNAL_COMPANY_NAME); 
    createProperty(true, mixedQuoteType,MixedQuoteImpl.INTERNAL_PRICE); 
    createProperty(true, mixedQuoteType,MixedQuoteImpl.INTERNAL_OPEN1); 
    createProperty(true, mixedQuoteType,MixedQuoteImpl.INTERNAL_HIGH); 
    createProperty(true, mixedQuoteType,MixedQuoteImpl.INTERNAL_LOW); 
    createProperty(true, mixedQuoteType,MixedQuoteImpl.INTERNAL_VOLUME); 
    createProperty(true, mixedQuoteType,MixedQuoteImpl.INTERNAL_CHANGE1); 
    createProperty(false, mixedQuoteType,MixedQuoteImpl.INTERNAL_QUOTES); 
    mixedRepeatingChoiceType = createType(false, MIXED_REPEATING_CHOICE);
    createProperty(true, mixedRepeatingChoiceType,MixedRepeatingChoiceImpl.INTERNAL_MIXED); 
    createProperty(true, mixedRepeatingChoiceType,MixedRepeatingChoiceImpl.INTERNAL_GROUP); 
    createProperty(true, mixedRepeatingChoiceType,MixedRepeatingChoiceImpl.INTERNAL_A); 
    createProperty(true, mixedRepeatingChoiceType,MixedRepeatingChoiceImpl.INTERNAL_B); 
    repeatingChoiceType = createType(false, REPEATING_CHOICE);
    createProperty(true, repeatingChoiceType,RepeatingChoiceImpl.INTERNAL_GROUP); 
    createProperty(true, repeatingChoiceType,RepeatingChoiceImpl.INTERNAL_A); 
    createProperty(true, repeatingChoiceType,RepeatingChoiceImpl.INTERNAL_B); 
    twoRCsType = createType(false, TWO_RCS);
    createProperty(true, twoRCsType,TwoRCsImpl.INTERNAL_GROUP); 
    createProperty(true, twoRCsType,TwoRCsImpl.INTERNAL_A); 
    createProperty(true, twoRCsType,TwoRCsImpl.INTERNAL_B); 
    createProperty(true, twoRCsType,TwoRCsImpl.INTERNAL_SPLIT); 
    createProperty(true, twoRCsType,TwoRCsImpl.INTERNAL_GROUP1); 
    createProperty(true, twoRCsType,TwoRCsImpl.INTERNAL_Y); 
    createProperty(true, twoRCsType,TwoRCsImpl.INTERNAL_Z); 
    twoRCsMixedType = createType(false, TWO_RCS_MIXED);
    createProperty(true, twoRCsMixedType,TwoRCsMixedImpl.INTERNAL_MIXED); 
    createProperty(true, twoRCsMixedType,TwoRCsMixedImpl.INTERNAL_GROUP); 
    createProperty(true, twoRCsMixedType,TwoRCsMixedImpl.INTERNAL_A); 
    createProperty(true, twoRCsMixedType,TwoRCsMixedImpl.INTERNAL_B); 
    createProperty(true, twoRCsMixedType,TwoRCsMixedImpl.INTERNAL_SPLIT); 
    createProperty(true, twoRCsMixedType,TwoRCsMixedImpl.INTERNAL_GROUP1); 
    createProperty(true, twoRCsMixedType,TwoRCsMixedImpl.INTERNAL_Y); 
    createProperty(true, twoRCsMixedType,TwoRCsMixedImpl.INTERNAL_Z); 
  }
  
  private boolean isInitialized = false;

  public void initializeMetaData()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Obtain other dependent packages
    ModelFactoryImpl theModelPackageImpl = (ModelFactoryImpl)FactoryBase.getStaticFactory(ModelFactoryImpl.NAMESPACE_URI);
    Property property = null;

    // Add supertypes to types

    // Initialize types and properties
    initializeType(mixedQuoteType, MixedQuote.class, "MixedQuote", false);
    property = getProperty(mixedQuoteType, MixedQuoteImpl.INTERNAL_MIXED);
    initializeProperty(property, getSequence(), "mixed", null, 0, -1, MixedQuote.class, false, false, false);

    property = getProperty(mixedQuoteType, MixedQuoteImpl.INTERNAL_SYMBOL);
    initializeProperty(property, theModelPackageImpl.getString(), "symbol", null, 1, 1, MixedQuote.class, false, false, true);

    property = getProperty(mixedQuoteType, MixedQuoteImpl.INTERNAL_COMPANY_NAME);
    initializeProperty(property, theModelPackageImpl.getString(), "companyName", null, 1, 1, MixedQuote.class, false, false, true);

    property = getProperty(mixedQuoteType, MixedQuoteImpl.INTERNAL_PRICE);
    initializeProperty(property, theModelPackageImpl.getDecimal(), "price", null, 1, 1, MixedQuote.class, false, false, true);

    property = getProperty(mixedQuoteType, MixedQuoteImpl.INTERNAL_OPEN1);
    initializeProperty(property, theModelPackageImpl.getDecimal(), "open1", null, 1, 1, MixedQuote.class, false, false, true);

    property = getProperty(mixedQuoteType, MixedQuoteImpl.INTERNAL_HIGH);
    initializeProperty(property, theModelPackageImpl.getDecimal(), "high", null, 1, 1, MixedQuote.class, false, false, true);

    property = getProperty(mixedQuoteType, MixedQuoteImpl.INTERNAL_LOW);
    initializeProperty(property, theModelPackageImpl.getDecimal(), "low", null, 1, 1, MixedQuote.class, false, false, true);

    property = getProperty(mixedQuoteType, MixedQuoteImpl.INTERNAL_VOLUME);
    initializeProperty(property, theModelPackageImpl.getDouble(), "volume", null, 1, 1, MixedQuote.class, false, true, true);

    property = getProperty(mixedQuoteType, MixedQuoteImpl.INTERNAL_CHANGE1);
    initializeProperty(property, theModelPackageImpl.getDouble(), "change1", null, 1, 1, MixedQuote.class, false, true, true);

    property = getProperty(mixedQuoteType, MixedQuoteImpl.INTERNAL_QUOTES);
    initializeProperty(property, this.getMixedQuote(), "quotes", null, 0, -1, MixedQuote.class, false, false, true, true , null);

    initializeType(mixedRepeatingChoiceType, MixedRepeatingChoice.class, "MixedRepeatingChoice", false);
    property = getProperty(mixedRepeatingChoiceType, MixedRepeatingChoiceImpl.INTERNAL_MIXED);
    initializeProperty(property, getSequence(), "mixed", null, 0, -1, MixedRepeatingChoice.class, false, false, false);

    property = getProperty(mixedRepeatingChoiceType, MixedRepeatingChoiceImpl.INTERNAL_GROUP);
    initializeProperty(property, getSequence(), "group", null, 0, -1, MixedRepeatingChoice.class, false, false, true);

    property = getProperty(mixedRepeatingChoiceType, MixedRepeatingChoiceImpl.INTERNAL_A);
    initializeProperty(property, theModelPackageImpl.getString(), "a", null, 0, -1, MixedRepeatingChoice.class, false, false, true);

    property = getProperty(mixedRepeatingChoiceType, MixedRepeatingChoiceImpl.INTERNAL_B);
    initializeProperty(property, theModelPackageImpl.getInt(), "b", null, 0, -1, MixedRepeatingChoice.class, false, false, true);

    initializeType(repeatingChoiceType, RepeatingChoice.class, "RepeatingChoice", false);
    property = getProperty(repeatingChoiceType, RepeatingChoiceImpl.INTERNAL_GROUP);
    initializeProperty(property, getSequence(), "group", null, 0, -1, RepeatingChoice.class, false, false, false);

    property = getProperty(repeatingChoiceType, RepeatingChoiceImpl.INTERNAL_A);
    initializeProperty(property, theModelPackageImpl.getString(), "a", null, 0, -1, RepeatingChoice.class, false, false, true);

    property = getProperty(repeatingChoiceType, RepeatingChoiceImpl.INTERNAL_B);
    initializeProperty(property, theModelPackageImpl.getInt(), "b", null, 0, -1, RepeatingChoice.class, false, false, true);

    initializeType(twoRCsType, TwoRCs.class, "TwoRCs", false);
    property = getProperty(twoRCsType, TwoRCsImpl.INTERNAL_GROUP);
    initializeProperty(property, getSequence(), "group", null, 0, -1, TwoRCs.class, false, false, false);

    property = getProperty(twoRCsType, TwoRCsImpl.INTERNAL_A);
    initializeProperty(property, theModelPackageImpl.getString(), "a", null, 0, -1, TwoRCs.class, false, false, true);

    property = getProperty(twoRCsType, TwoRCsImpl.INTERNAL_B);
    initializeProperty(property, theModelPackageImpl.getInt(), "b", null, 0, -1, TwoRCs.class, false, false, true);

    property = getProperty(twoRCsType, TwoRCsImpl.INTERNAL_SPLIT);
    initializeProperty(property, theModelPackageImpl.getString(), "split", null, 1, 1, TwoRCs.class, false, false, false);

    property = getProperty(twoRCsType, TwoRCsImpl.INTERNAL_GROUP1);
    initializeProperty(property, getSequence(), "group1", null, 0, -1, TwoRCs.class, false, false, false);

    property = getProperty(twoRCsType, TwoRCsImpl.INTERNAL_Y);
    initializeProperty(property, theModelPackageImpl.getString(), "y", null, 0, -1, TwoRCs.class, false, false, true);

    property = getProperty(twoRCsType, TwoRCsImpl.INTERNAL_Z);
    initializeProperty(property, theModelPackageImpl.getInt(), "z", null, 0, -1, TwoRCs.class, false, false, true);

    initializeType(twoRCsMixedType, TwoRCsMixed.class, "TwoRCsMixed", false);
    property = getProperty(twoRCsMixedType, TwoRCsMixedImpl.INTERNAL_MIXED);
    initializeProperty(property, getSequence(), "mixed", null, 0, -1, TwoRCsMixed.class, false, false, false);

    property = getProperty(twoRCsMixedType, TwoRCsMixedImpl.INTERNAL_GROUP);
    initializeProperty(property, getSequence(), "group", null, 0, -1, TwoRCsMixed.class, false, false, true);

    property = getProperty(twoRCsMixedType, TwoRCsMixedImpl.INTERNAL_A);
    initializeProperty(property, theModelPackageImpl.getString(), "a", null, 0, -1, TwoRCsMixed.class, false, false, true);

    property = getProperty(twoRCsMixedType, TwoRCsMixedImpl.INTERNAL_B);
    initializeProperty(property, theModelPackageImpl.getInt(), "b", null, 0, -1, TwoRCsMixed.class, false, false, true);

    property = getProperty(twoRCsMixedType, TwoRCsMixedImpl.INTERNAL_SPLIT);
    initializeProperty(property, theModelPackageImpl.getString(), "split", null, 1, 1, TwoRCsMixed.class, false, false, true);

    property = getProperty(twoRCsMixedType, TwoRCsMixedImpl.INTERNAL_GROUP1);
    initializeProperty(property, getSequence(), "group1", null, 0, -1, TwoRCsMixed.class, false, false, true);

    property = getProperty(twoRCsMixedType, TwoRCsMixedImpl.INTERNAL_Y);
    initializeProperty(property, theModelPackageImpl.getString(), "y", null, 0, -1, TwoRCsMixed.class, false, false, true);

    property = getProperty(twoRCsMixedType, TwoRCsMixedImpl.INTERNAL_Z);
    initializeProperty(property, theModelPackageImpl.getInt(), "z", null, 0, -1, TwoRCsMixed.class, false, false, true);

  }

    
} //SequencesFactoryImpl
