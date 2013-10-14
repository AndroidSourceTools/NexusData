package org.nexusdata.core;

import org.nexusdata.metamodel.EntityDescription;

public class NoSuchPropertyException extends RuntimeException {
    private String propertyName;

    public NoSuchPropertyException(ManagedObject object, String propertyName) {
        super("No such property '" + propertyName + "' in object " + object);
        this.propertyName = propertyName;
    }

    public NoSuchPropertyException(EntityDescription<?> entity, String propertyName) {
        super("No such property '" + propertyName + "' in entity " + entity);
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }
}
