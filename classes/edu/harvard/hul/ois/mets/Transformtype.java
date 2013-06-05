/**********************************************************************
 * METS Java Toolkit
 * Copyright (c) 2006 by the President and Fellows of Harvard College
 *
 * The METS specification was developed as an initiative of the
 * Digital Library Federation <http://www.diglib.org> and is
 * maintained by the Network Development and MARC Standards Office of
 * the Library of Congress <http://www.loc.gov/standards/mets/>.
 **********************************************************************/

package edu.harvard.hul.ois.mets;

import edu.harvard.hul.ois.mets.helper.*;
import java.util.*;

/**
 * This class encapsulates the TRANSFORMTYPE type.
 * @author Stephen Abrams
 * @version 1.5.1 2006-04-03
 */
public final class Transformtype
    extends edu.harvard.hul.ois.mets.helper.Enum
{
    /******************************************************************
     * PRIVATE CLASS FIELDS.
     ******************************************************************/

    /** List of enumeration values. */
    private static List _list = new ArrayList ();

    /** Decompression. */
    public static final Transformtype DECOMPRESSION =
	            new Transformtype ("decompression");

    /** Decryption. */
    public static final Transformtype DECRYPTION =
                    new Transformtype ("decryption");

    /******************************************************************
     * CLASS CONSTRUCTOR.
     ******************************************************************/

    /**
     * Instantiate a <tt>Transformtype</tt> object.
     * @param value Transformtype value
     */
    public Transformtype (String value)
    {
	super (value);
	_list.add (this);
    }

    /******************************************************************
     * PUBLIC CLASS METHODS.
     ******************************************************************/

    /**
     * Return Transformtype by name.
     * @param name Transformtype name
     */
    public static Transformtype parse (String name)
        throws MetsException
    {
	Iterator iter = _list.iterator ();
	while (iter.hasNext ()) {
	    Transformtype type = (Transformtype) iter.next ();
	    if (name.equals (type.toString ())) {
		return type;
	    }
	}

	throw new MetsException ("Unsupported transformtype: " + name);
    }
}
