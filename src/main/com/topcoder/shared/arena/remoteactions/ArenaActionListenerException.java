/*
 * ArenaActionListenerException
 * 
 * Created Nov 5, 2007
 */
package com.topcoder.shared.arena.remoteactions;

/**
 * @author Diego Belfer (mural)
 * @version $Id: ArenaActionListenerException.java 75864 2009-07-14 17:57:26Z ivern $
 */
public class ArenaActionListenerException extends Exception {

    public ArenaActionListenerException() {
    }

    public ArenaActionListenerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArenaActionListenerException(String message) {
        super(message);
    }

    public ArenaActionListenerException(Throwable cause) {
        super(cause);
    }

}
