package com.topcoder.shared.security;

/**
 * Resource which represents a class, as the full name with package.
 *
 * @author Ambrose Feinstein,dok
 * @version $Id: ClassResource.java 68762 2008-02-28 20:31:11Z gpaul $
 */
public class ClassResource implements Resource {


    private String name;
    private static final long serialVersionUID = 5923007131994822615L;

    public ClassResource(Class c) {
        this.name = c.getName();
    }

    public String getName() {
        return name;
    }
}
