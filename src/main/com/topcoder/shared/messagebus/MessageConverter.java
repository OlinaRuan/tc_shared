/*
 * MessageConverter
 * 
 * Created Oct 3, 2007
 */
package com.topcoder.shared.messagebus;

/**
 * MessageConverters are responsible for converting BusMessages
 * and model Objects
 * 
 * 
 * @author Diego Belfer (mural)
 * @version $Id: MessageConverter.java 66639 2007-10-24 19:05:44Z mural $
 */
public interface MessageConverter<T> {
    
    /**
     * Creates a BusMessage for the given Object
     * 
     * @param object The object to convert to a messahe
     * @return
     */
    public BusMessage toMessage(T object);
    public T fromMessage(BusMessage message); 
}
