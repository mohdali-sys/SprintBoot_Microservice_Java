package com.test.design.immutable;

public final class User implements Cloneable
{

    private final int id;

    private final String name;

    private final String email;

    private final Address address;

    User(int id, String name, String email, Address address)
        throws CloneNotSupportedException
    {
        this.id = id;
        this.name = name;
        this.email = email;
        /*
         * Any field contains reference of any mutable object must be
         * initialized with the cloned object
         */
        this.address = (Address) address.clone();
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public Address getAddress()
        throws CloneNotSupportedException
    {
        /*
         * Getter method must return the reference of cloned object.
         Remove this "clone" implementation; use a copy constructor or copy factory instead */
        // return cloneAddress(address);
        return (Address) address.clone();
    }

    @Override
    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }
}
